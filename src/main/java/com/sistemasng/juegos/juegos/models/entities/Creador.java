///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.sistemasng.juegos.juegos.models.entities;
//
//import java.io.Serializable;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
///**
// *
// * @author matia
// */
////@Entity
////@Table(name = "creadores")
//public class Creador implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    private String apellido;
//
//    private String nombre;
//
////    @ManyToOne
////    @JoinColumn(name = "id_juego", referencedColumnName = "id")
////    private Juego juego;
//
//    @ManyToOne
//    @JoinColumn(name = "id_tipoCreador", referencedColumnName = "id")
//    private tipoCreador tipoCreador;
//
//    @ManyToOne
//    @JoinColumn(name = "id_empresa", referencedColumnName = "id")
//    private Empresa empresa;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getApellido() {
//        return apellido;
//    }
//
//    public void setApellido(String apellido) {
//        this.apellido = apellido;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
////    public Juego getJuego() {
////        return juego;
////    }
////
////    public void setJuego(Juego juego) {
////        this.juego = juego;
////    }
//
//    public tipoCreador getTipoCreador() {
//        return tipoCreador;
//    }
//
//    public void setTipoCreador(tipoCreador tipoCreador) {
//        this.tipoCreador = tipoCreador;
//    }
//
//    public Empresa getEmpresa() {
//        return empresa;
//    }
//
//    public void setEmpresa(Empresa empresa) {
//        this.empresa = empresa;
//    }
//
//}
