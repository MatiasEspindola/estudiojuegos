/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemasng.juegos.juegos.models.services;

import com.sistemasng.juegos.juegos.models.entities.tipoPlataforma;
import java.util.List;

/**
 *
 * @author matia
 */
public interface ITipoPlataformaService {

    public List<tipoPlataforma> buscarTodo();

    public tipoPlataforma buscarPorId(int id);

    public void guardar(tipoPlataforma tipoPlataforma);

    public void borrar(tipoPlataforma tipoPlataforma);

}
