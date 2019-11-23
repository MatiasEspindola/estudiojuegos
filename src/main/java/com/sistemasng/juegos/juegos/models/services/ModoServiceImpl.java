/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemasng.juegos.juegos.models.services;

import com.sistemasng.juegos.juegos.models.dao.IModoDao;
import com.sistemasng.juegos.juegos.models.entities.Modo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author matia
 */

@Service
public class ModoServiceImpl implements IModoService{
    
    @Autowired
    private IModoDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<Modo> buscarTodo() {
        return (List<Modo>) dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Modo buscarPorId(int id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void guardar(Modo modo) {
        dao.save(modo);
    }

    @Override
    @Transactional
    public void borrar(Modo modo) {
        dao.delete(modo);
    }
    
}
