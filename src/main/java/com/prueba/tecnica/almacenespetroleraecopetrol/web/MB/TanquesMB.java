/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.almacenespetroleraecopetrol.web.MB;

import java.io.Serializable;
import javax.ejb.EJB;
import com.prueba.tecnica.almacenespetroleraecopetrol.entities.Tanques;
import com.prueba.tecnica.almacenespetroleraecopetrol.business.AlmacenesBusinessLocal;
import com.prueba.tecnica.almacenespetroleraecopetrol.entities.Almacenes;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named(value = "tanquesMB")
@ViewScoped
public class TanquesMB implements Serializable {

    @EJB
    private AlmacenesBusinessLocal almacenBusiness;

    private List<Tanques> tanques;
    
    private Almacenes almacen;

    private Tanques tanque;

    private Integer idalmace;
    
    public TanquesMB() {
    }

    public void loadTanques() {
        tanques = almacenBusiness.getTanqueByIdalmacen(idalmace);
        almacen = almacenBusiness.getAlmacen(idalmace);
    }

    public List<Tanques> getTanques() {
        return tanques;
    }

    public void setTanques(List<Tanques> tanques) {
        this.tanques = tanques;
    }

    public Tanques getTanque() {
        return tanque;
    }

    public void setTanque(Tanques tanque) {
        this.tanque = tanque;
    }

    public Integer getIdalmace() {
        return idalmace;
    }

    public void setIdalmace(Integer idalmace) {
        this.idalmace = idalmace;
    }

    public Almacenes getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacenes almacen) {
        this.almacen = almacen;
    }

    
    
}
