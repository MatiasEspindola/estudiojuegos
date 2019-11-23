///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.sistemasng.juegos.juegos.models.services;
//
//import com.sistemasng.juegos.juegos.models.dao.IEmpresaDao;
//import com.sistemasng.juegos.juegos.models.entities.Empresa;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
///**
// *
// * @author matia
// */
//
//@Service
//public class EmpresasServiceImpl implements IEmpresaService{
//    
//    @Autowired
//    private IEmpresaDao dao;
//
//    @Override
//    @Transactional(readOnly = true)
//    public List<Empresa> buscarTodo() {
//        return (List<Empresa>) dao.findAll();
//    }
//
//    @Override
//    @Transactional(readOnly = true)
//    public Empresa buscarPorId(int id) {
//        return dao.findById(id).orElse(null);
//    }
//
//    @Override
//    @Transactional
//    public void guardar(Empresa empresa) {
//        dao.save(empresa);
//    }
//
//    @Override
//    @Transactional
//    public void borrar(Empresa empresa) {
//        dao.delete(empresa);
//    }
//    
//}
