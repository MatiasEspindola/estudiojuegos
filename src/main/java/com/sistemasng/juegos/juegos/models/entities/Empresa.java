///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.sistemasng.juegos.juegos.models.entities;
//
//import java.io.Serializable;
//import java.util.List;
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
///**
// *
// * @author matia
// */
//
//@Entity
//@Table(name = "empresas")
//public class Empresa implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    private String empresa;
//
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "empresa")
//    private List<Creador> creadores;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getEmpresa() {
//        return empresa;
//    }
//
//    public void setEmpresa(String empresa) {
//        this.empresa = empresa;
//    }
//
//    public List<Creador> getCreadores() {
//        return creadores;
//    }
//
//    public void setCreadores(List<Creador> creadores) {
//        this.creadores = creadores;
//    }
//
//}
