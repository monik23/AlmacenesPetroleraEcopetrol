/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.almacenespetroleraecopetrol.persistence;

import com.prueba.tecnica.almacenespetroleraecopetrol.entities.Almacenes;
import com.prueba.tecnica.almacenespetroleraecopetrol.entities.Tanques;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Mon
 */
@Local
public interface TanquesFacadeLocal {

    void create(Tanques tanques);

    void edit(Tanques tanques);

    void remove(Tanques tanques);

    Tanques find(Object id);

    List<Tanques> findAll();

    List<Tanques> findRange(int[] range);

    int count();
    
    List<Tanques> findByIdalmacen(Integer idalmace);
    
}
