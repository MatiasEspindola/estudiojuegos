///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.sistemasng.juegos.juegos.models.services;
//
//import com.sistemasng.juegos.juegos.models.dao.ITipoCreadorDao;
//import com.sistemasng.juegos.juegos.models.entities.tipoCreador;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
///**
// *
// * @author matia
// */
//@Service
//public class tipoCreadorServiceImpl implements ITipoCreadorService {
//
//    @Autowired
//    private ITipoCreadorDao dao;
//
//    @Override
//    @Transactional(readOnly = true)
//    public List<tipoCreador> buscarTodo() {
//        return (List<tipoCreador>) dao.findAll();
//    }
//
//    @Override
//    @Transactional(readOnly = true)
//    public tipoCreador buscarPorId(int id) {
//        return dao.findById(id).orElse(null);
//    }
//
//    @Override
//    @Transactional
//    public void guardar(tipoCreador tipoCreador) {
//        dao.save(tipoCreador);
//    }
//
//    @Override
//    @Transactional
//    public void borrar(tipoCreador tipoCreador) {
//        dao.delete(tipoCreador);
//    }
//
//}
