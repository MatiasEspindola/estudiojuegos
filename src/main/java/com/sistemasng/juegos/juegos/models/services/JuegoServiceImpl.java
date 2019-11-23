/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemasng.juegos.juegos.models.services;

import com.sistemasng.juegos.juegos.models.dao.IJuegoDao;
import com.sistemasng.juegos.juegos.models.entities.Juego;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author matia
 */
@Service
public class JuegoServiceImpl implements IJuegoService{
    
    @Autowired
    private IJuegoDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<Juego> buscarTodo() {
        return (List<Juego>) dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Juego buscarPorId(int id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void guardar(Juego juego) {
        dao.save(juego);
    }

    @Override
    @Transactional
    public void borrar(Juego juego) {
        dao.delete(juego);
    }
    
}
