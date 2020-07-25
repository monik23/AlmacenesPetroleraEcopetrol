/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.almacenespetroleraecopetrol.business;

import com.prueba.tecnica.almacenespetroleraecopetrol.entities.Almacenes;
import com.prueba.tecnica.almacenespetroleraecopetrol.entities.Operaciones;
import com.prueba.tecnica.almacenespetroleraecopetrol.entities.Tanques;
import com.prueba.tecnica.almacenespetroleraecopetrol.entities.Usuarios;
import com.prueba.tecnica.almacenespetroleraecopetrol.persistence.AlmacenesFacadeLocal;
import com.prueba.tecnica.almacenespetroleraecopetrol.persistence.TanquesFacadeLocal;
import com.prueba.tecnica.almacenespetroleraecopetrol.persistence.OperacionesFacadeLocal;
import com.prueba.tecnica.almacenespetroleraecopetrol.persistence.UsuariosFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Mon
 */
@Stateless
public class AlmacenesBusiness implements AlmacenesBusinessLocal {

    @EJB
    private TanquesFacadeLocal tanquesFacade;
    
    @EJB
    private OperacionesFacadeLocal operacionesFacade;
    
    @EJB
    private UsuariosFacadeLocal usuariosFacade;
    
    @EJB
    private AlmacenesFacadeLocal almacenesFacade;
    
    @Override
    public List<Almacenes> getAlamcenes() {
        return almacenesFacade.findAll();
    }
    
    @Override
    public Almacenes getAlmacen(final int id) {
        return almacenesFacade.find(id);
    }
    
    @Override
    public List<Tanques> getTanqueByIdalmacen(Integer idalmace){
        return tanquesFacade.findByIdalmacen(idalmace);
    }
    
    @Override
    public Tanques getTanque(final int id) {
        return tanquesFacade.find(id);
    }
    @Override
    public Operaciones getOperacion(final int id) {
        return operacionesFacade.find(id);
    }
    @Override
    public Usuarios getUsuario(final int id) {
        return usuariosFacade.find(id);
    }
}
