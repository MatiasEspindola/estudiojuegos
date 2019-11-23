/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemasng.juegos.juegos.controllers;

import com.sistemasng.juegos.juegos.models.entities.Categoria;
//import com.sistemasng.juegos.juegos.models.entities.Empresa;
import com.sistemasng.juegos.juegos.models.entities.Juego;
import com.sistemasng.juegos.juegos.models.entities.Modo;
import com.sistemasng.juegos.juegos.models.entities.Plataforma;
import com.sistemasng.juegos.juegos.models.entities.tipoModo;
import com.sistemasng.juegos.juegos.models.entities.tipoPlataforma;
import com.sistemasng.juegos.juegos.models.services.CategoriaServiceImpl;
//import com.sistemasng.juegos.juegos.models.services.EmpresasServiceImpl;
import com.sistemasng.juegos.juegos.models.services.IUploadFileService;
import com.sistemasng.juegos.juegos.models.services.JuegoServiceImpl;
import com.sistemasng.juegos.juegos.models.services.ModoServiceImpl;
import com.sistemasng.juegos.juegos.models.services.PlataformaServiceImpl;
import com.sistemasng.juegos.juegos.models.services.tipoModoServiceImpl;
import com.sistemasng.juegos.juegos.models.services.tipoPlataformaServiceImpl;
import java.io.IOException;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author matia
 */
@Controller
@SessionAttributes("juego")
public class formularioController {

    @Autowired
    private CategoriaServiceImpl categoriaService;

    @Autowired
    private JuegoServiceImpl juegoService;

    @Autowired
    private ModoServiceImpl modoService;
    
    @Autowired
    private PlataformaServiceImpl plataformaService;

    @Autowired
    private tipoModoServiceImpl tipoModoService;

    @Autowired
    private tipoPlataformaServiceImpl tipoPlataformaService;

//    @Autowired
//    private EmpresasServiceImpl empresasService;

    @Autowired
    private IUploadFileService upl;

    @GetMapping("/formulario")
    public String formulario(Model m) {

        Juego juego = new Juego();

        List<Categoria> categorias = categoriaService.buscarTodo();

        List<tipoModo> modos = tipoModoService.buscarTodo();

        List<tipoPlataforma> plataformas = tipoPlataformaService.buscarTodo();

//        List<Empresa> empresas = empresasService.buscarTodo();

        m.addAttribute("categorias", categorias);

        m.addAttribute("modos", modos);

        m.addAttribute("plataformas", plataformas);

//        m.addAttribute("empresas", empresas);

        m.addAttribute("juego", juego);

        return "/formulario";
    }

    @PostMapping("/formulario")
    public String guardar(@Valid Juego juego, @RequestParam("file") MultipartFile foto,
            @RequestParam("tipomodo") int idModo, @RequestParam("tipoplataforma") int idPlataforma) {

        if (!foto.isEmpty()) {
            if (juego.getId() > 0 && juego.getFoto() != null
                    && juego.getFoto().length() > 0) {
                upl.delete(juego.getFoto());
            }
            String uniqueFilename = null;

            try {
                uniqueFilename = upl.copy(foto);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            juego.setFoto(uniqueFilename);

        }
        
        tipoModo tipoModo = tipoModoService.buscarPorId(idModo);
        
        Modo modo = new Modo();
        
        modo.setTipoModo(tipoModo);
        modo.setJuego(juego);
        
        tipoPlataforma tipoPlataforma = tipoPlataformaService.buscarPorId(idPlataforma);
        
        Plataforma plataforma = new Plataforma();
        
        plataforma.setTipoPlataforma(tipoPlataforma);
        plataforma.setJuego(juego);
        
        juegoService.guardar(juego);

        tipoModoService.guardar(tipoModo);
        modoService.guardar(modo);
        
        tipoPlataformaService.guardar(tipoPlataforma);
        plataformaService.guardar(plataforma);
        

        return "redirect:/";
    }
}