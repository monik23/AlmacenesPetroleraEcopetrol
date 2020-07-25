/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.almacenespetroleraecopetrol.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Mon
 */
@Entity
@Table(name = "almacen")
@NamedQueries({
    @NamedQuery(name = "Almacenes.findAll", query = "SELECT a FROM Almacenes a"),
    @NamedQuery(name = "Almacenes.findByIdalmacen", query = "SELECT a FROM Almacenes a WHERE a.idalmacen = :idalmacen")})
public class Almacenes implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "idalmacen")
    private Integer idalmacen;
    
    @Column(name = "nombre")
    private String nombre;
    
    @JoinColumn(name = "idciudad", referencedColumnName = "idciudad")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Ciudades idciudad;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idalmacen", fetch = FetchType.EAGER)
    private List<Operaciones> operacionList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idalmacen", fetch = FetchType.EAGER)
    private List<Tanques> tanqueList;
    
    public Almacenes() {
    }

    public Almacenes(Integer idalmacen) {
        this.idalmacen = idalmacen;
    }

    public Almacenes(Integer idalmacen, String nombre) {
        this.idalmacen = idalmacen;
        this.nombre = nombre;
    }

    public Integer getIdalmacen() {
        return idalmacen;
    }

    public void setIdalmacen(Integer idalmacen) {
        this.idalmacen = idalmacen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudades getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(Ciudades idciudad) {
        this.idciudad = idciudad;
    }

    public List<Operaciones> getOperacionesList() {
        return operacionList;
    }

    public void setOperacionesList(List<Operaciones> operacionesList) {
        this.operacionList = operacionesList;
    }

    public List<Tanques> getTanqueList() {
        return tanqueList;
    }

    public void setTanqueList(List<Tanques> tanqueList) {
        this.tanqueList = tanqueList;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idalmacen != null ? idalmacen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Almacenes)) {
            return false;
        }
        Almacenes other = (Almacenes) object;
        if ((this.idalmacen == null && other.idalmacen != null) || (this.idalmacen != null && !this.idalmacen.equals(other.idalmacen))) {
            return false;
        }
        return true;
    }
        
    
    @Override
    public String toString() {
        return "com.prueba.tecnica.almacenespetroleraecopetrol.entities.Almacenes[ idalmacen=" + idalmacen + " ]";
    }
    
}
