/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.almacenespetroleraecopetrol.persistence;

import com.prueba.tecnica.almacenespetroleraecopetrol.entities.Almacenes;
import com.prueba.tecnica.almacenespetroleraecopetrol.entities.Tanques;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Mon
 */
@Stateless
public class TanquesFacade extends AbstractFacade<Tanques> implements TanquesFacadeLocal {
    @PersistenceContext(unitName = "com.prueba.tecnica_AlmacenesPetroleraEcopetrol_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TanquesFacade() {
        super(Tanques.class);
    }
    
    @Override    
    public List<Tanques> findByIdalmacen(Integer idalmacen) {   
        Almacenes almacen = new Almacenes();
        almacen.setIdalmacen(idalmacen);
        Query query = getEntityManager().createNamedQuery("Tanques.findByIdalmacen");
        query.setParameter("idalmacen", almacen);
        return query.getResultList();
    }
    
    
    
}
