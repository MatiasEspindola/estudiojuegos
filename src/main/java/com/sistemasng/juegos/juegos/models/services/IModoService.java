/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemasng.juegos.juegos.models.services;

import com.sistemasng.juegos.juegos.models.entities.Modo;
import java.util.List;

/**
 *
 * @author matia
 */
public interface IModoService {
    
    public List<Modo> buscarTodo();
    
    public Modo buscarPorId(int id);
    
    public void guardar(Modo modo);
    
    public void borrar(Modo modo);
    
}
