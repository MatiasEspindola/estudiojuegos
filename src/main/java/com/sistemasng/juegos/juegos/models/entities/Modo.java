/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemasng.juegos.juegos.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author matia
 */
@Entity
@Table(name = "modos")
public class Modo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_tipoModo", referencedColumnName = "id")
    private tipoModo tipoModo;

    @ManyToOne
    @JoinColumn(name = "id_jue", referencedColumnName = "id")
    private Juego juego;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public tipoModo getTipoModo() {
        return tipoModo;
    }

    public void setTipoModo(tipoModo tipoModo) {
        this.tipoModo = tipoModo;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }
    
}
