///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.sistemasng.juegos.juegos.models.services;
//
//import com.sistemasng.juegos.juegos.models.dao.ICreadorDao;
//import com.sistemasng.juegos.juegos.models.entities.Creador;
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
//public class CreadorServiceImpl implements ICreadorService{
//    
//    @Autowired
//    private ICreadorDao dao;
//
//    @Override
//    @Transactional(readOnly = true)
//    public List<Creador> buscarTodo() {
//        return (List<Creador>) dao.findAll();
//    }
//
//    @Override
//    @Transactional(readOnly = true)
//    public Creador buscarPorId(int id) {
//        return dao.findById(id).orElse(null);
//    }
//
//    @Override
//    @Transactional
//    public void guardar(Creador creador) {
//        dao.save(creador);
//    }
//
//    @Override
//    @Transactional
//    public void borrar(Creador creador) {
//        dao.delete(creador);
//    }
//    
//}
