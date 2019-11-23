/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemasng.juegos.juegos.models.services;

import com.sistemasng.juegos.juegos.models.entities.Juego;
import java.util.List;

/**
 *
 * @author matia
 */
public interface IJuegoService {
    
    public List<Juego> buscarTodo();
    
    public Juego buscarPorId(int id);
    
    public void guardar(Juego juego);
    
    public void borrar(Juego juego);
    
}
