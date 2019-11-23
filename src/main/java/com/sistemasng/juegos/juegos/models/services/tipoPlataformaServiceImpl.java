/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemasng.juegos.juegos.models.services;

import com.sistemasng.juegos.juegos.models.dao.ITipoPlataformaDao;
import com.sistemasng.juegos.juegos.models.entities.tipoPlataforma;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author matia
 */
@Service
public class tipoPlataformaServiceImpl implements ITipoPlataformaService {

    @Autowired
    private ITipoPlataformaDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<tipoPlataforma> buscarTodo() {
        return (List<tipoPlataforma>) dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public tipoPlataforma buscarPorId(int id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void guardar(tipoPlataforma tipoPlataforma) {
        dao.save(tipoPlataforma);
    }

    @Override
    @Transactional
    public void borrar(tipoPlataforma tipoPlataforma) {
        dao.delete(tipoPlataforma);
    }

}
