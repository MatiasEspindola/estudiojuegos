/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemasng.juegos.juegos.models.services;

import com.sistemasng.juegos.juegos.models.dao.ICategoriaDao;
import com.sistemasng.juegos.juegos.models.entities.Categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author matia
 */
@Service
public class CategoriaServiceImpl implements ICategoriaService {

    @Autowired
    private ICategoriaDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<Categoria> buscarTodo() {
        return (List<Categoria>) dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Categoria buscarPorId(int id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void guardar(Categoria categoria) {
        dao.save(categoria);
    }

    @Override
    @Transactional
    public void borrar(Categoria categoria) {
        dao.delete(categoria);
    }

}
