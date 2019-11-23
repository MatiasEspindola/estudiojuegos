/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemasng.juegos.juegos.models.services;

import com.sistemasng.juegos.juegos.models.dao.ITipoModoDao;
import com.sistemasng.juegos.juegos.models.entities.tipoModo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author matia
 */
@Service
public class tipoModoServiceImpl implements ITipoModoService {

    @Autowired
    private ITipoModoDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<tipoModo> buscarTodo() {
        return (List<tipoModo>) dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public tipoModo buscarPorId(int id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void guardar(tipoModo tipoModo) {
        dao.save(tipoModo);
    }

    @Override
    @Transactional
    public void borrar(tipoModo tipoModo) {
        dao.delete(tipoModo);
    }

}
