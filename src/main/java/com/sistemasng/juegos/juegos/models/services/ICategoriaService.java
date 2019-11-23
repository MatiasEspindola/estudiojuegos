/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemasng.juegos.juegos.models.services;

import com.sistemasng.juegos.juegos.models.entities.Categoria;
import java.util.List;

/**
 *
 * @author matia
 */
public interface ICategoriaService {
    
    public List<Categoria> buscarTodo();
    
    public Categoria buscarPorId(int id);
    
    public void guardar(Categoria categoria);
    
    public void borrar(Categoria categoria);
    
}
