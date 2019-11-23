/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemasng.juegos.juegos.models.entities;

import java.io.Serializable;
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
@Table(name = "plataformas")
public class Plataforma implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_tipoPlataforma", referencedColumnName = "id")
    private tipoPlataforma tipoPlataforma;

    @ManyToOne
    @JoinColumn(name = "id_jueg", referencedColumnName = "id")
    private Juego juego;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public tipoPlataforma getTipoPlataforma() {
        return tipoPlataforma;
    }

    public void setTipoPlataforma(tipoPlataforma tipoPlataforma) {
        this.tipoPlataforma = tipoPlataforma;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }
    
}
