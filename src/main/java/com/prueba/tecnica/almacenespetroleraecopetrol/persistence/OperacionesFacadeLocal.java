/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.almacenespetroleraecopetrol.persistence;

import com.prueba.tecnica.almacenespetroleraecopetrol.entities.Operaciones;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Mon
 */
@Local
public interface OperacionesFacadeLocal {

    void create(Operaciones operaciones);

    void edit(Operaciones operaciones);

    void remove(Operaciones operaciones);

    Operaciones find(Object id);

    List<Operaciones> findAll();

    List<Operaciones> findRange(int[] range);

    int count();
    
}
