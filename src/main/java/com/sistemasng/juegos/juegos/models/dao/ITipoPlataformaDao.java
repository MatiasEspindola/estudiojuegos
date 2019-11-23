/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemasng.juegos.juegos.models.dao;

import com.sistemasng.juegos.juegos.models.entities.tipoPlataforma;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author matia
 */
public interface ITipoPlataformaDao extends CrudRepository<tipoPlataforma, Integer>{
    
}
