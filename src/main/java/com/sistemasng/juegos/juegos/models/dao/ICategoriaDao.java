/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemasng.juegos.juegos.models.dao;

import com.sistemasng.juegos.juegos.models.entities.Categoria;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author matia
 */
public interface ICategoriaDao extends CrudRepository<Categoria, Integer>{
    
}
