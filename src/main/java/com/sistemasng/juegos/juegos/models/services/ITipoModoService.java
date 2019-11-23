/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemasng.juegos.juegos.models.services;

import com.sistemasng.juegos.juegos.models.entities.tipoModo;
import java.util.List;

/**
 *
 * @author matia
 */
public interface ITipoModoService {

    public List<tipoModo> buscarTodo();

    public tipoModo buscarPorId(int id);

    public void guardar(tipoModo tipoModo);

    public void borrar(tipoModo tipoModo);

}
