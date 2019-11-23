/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemasng.juegos.juegos.models.services;

import com.sistemasng.juegos.juegos.models.entities.Plataforma;
import java.util.List;

/**
 *
 * @author matia
 */
public interface IPlataformaService {

    public List<Plataforma> buscarTodo();

    public Plataforma buscarPorId(int id);

    public void guardar(Plataforma plataforma);

    public void borrar(Plataforma plataforma);

}
