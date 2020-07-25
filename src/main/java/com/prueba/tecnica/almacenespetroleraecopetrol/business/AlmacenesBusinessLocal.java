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
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Mon
 */
@Local
public interface AlmacenesBusinessLocal {
    public List<Almacenes> getAlamcenes();
    
    public Almacenes getAlmacen(final int id);
    
    public Tanques getTanque(final int id);
    
    public Operaciones getOperacion(final int id);
    
    public Usuarios getUsuario(final int id);
    
    public List<Tanques> getTanqueByIdalmacen(Integer idalmace);
}
