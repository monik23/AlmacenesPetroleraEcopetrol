/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.almacenespetroleraecopetrol.web.MB;

import com.prueba.tecnica.almacenespetroleraecopetrol.entities.Almacenes;
import com.prueba.tecnica.almacenespetroleraecopetrol.business.AlmacenesBusinessLocal;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

@ManagedBean(name="almacenesMB")
@RequestScoped
public class AlmacenesMB {
    
    @EJB
    private AlmacenesBusinessLocal almacenesBusiness;
    
    private List<Almacenes> almacenes;
    
    public AlmacenesMB() {
    }
    
    @PostConstruct
    public void init(){
        almacenes = new ArrayList<>();
    }
    public void queryAlmacenes(){almacenes = new ArrayList<>();
        almacenes = almacenesBusiness.getAlamcenes();  
        System.out.println(almacenes);
    }

    public List<Almacenes> getAlmacenes() {
        return almacenes;
    }

    public void setAlmacenes(List<Almacenes> almacenes) {
        this.almacenes = almacenes;
    }
    
    
}
