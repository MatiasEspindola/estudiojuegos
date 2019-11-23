/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemasng.juegos.juegos.controllers;

import com.sistemasng.juegos.juegos.models.entities.Juego;
import com.sistemasng.juegos.juegos.models.services.IUploadFileService;
import com.sistemasng.juegos.juegos.models.services.JuegoServiceImpl;
import java.net.MalformedURLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author matia
 */
@Controller
public class indexController {

    @Autowired
    private JuegoServiceImpl juegoService;

    @Autowired
    private IUploadFileService upl;

    @GetMapping(value = "/uploads/{filename:.+}")
    public ResponseEntity<Resource> verFoto(@PathVariable String filename) {

        Resource recurso = null;

        try {
            recurso = upl.load(filename);
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + recurso.getFilename() + "\"")
                .body(recurso);
    }

    @GetMapping({"/", "/index"})
    public String index(Model m) {

        m.addAttribute("titulo", "EstudioGames");
        m.addAttribute("desc", "Diseñador de VideoJuegos");

        List<Juego> juegos = juegoService.buscarTodo();

        

        m.addAttribute("juegos", juegos);

        return "/index";
    }

}
