/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemasng.juegos.juegos.models.services;

import com.sistemasng.juegos.juegos.models.dao.IPlataformaDao;
import com.sistemasng.juegos.juegos.models.entities.Plataforma;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author matia
 */
@Service
public class PlataformaServiceImpl implements IPlataformaService {

    @Autowired
    private IPlataformaDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<Plataforma> buscarTodo() {
        return (List<Plataforma>) dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Plataforma buscarPorId(int id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void guardar(Plataforma plataforma) {
        dao.save(plataforma);
    }

    @Override
    @Transactional
    public void borrar(Plataforma plataforma) {
        dao.delete(plataforma);
    }

}
