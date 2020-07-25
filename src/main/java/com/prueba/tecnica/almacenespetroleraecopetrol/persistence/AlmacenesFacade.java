/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.almacenespetroleraecopetrol.persistence;

import com.prueba.tecnica.almacenespetroleraecopetrol.entities.Almacenes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Mon
 */
@Stateless
public class AlmacenesFacade 
        extends AbstractFacade<Almacenes> 
        implements AlmacenesFacadeLocal {
    
    @PersistenceContext(unitName = "com.prueba.tecnica_AlmacenesPetroleraEcopetrol_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AlmacenesFacade() {
        super(Almacenes.class);
    }
    
}
