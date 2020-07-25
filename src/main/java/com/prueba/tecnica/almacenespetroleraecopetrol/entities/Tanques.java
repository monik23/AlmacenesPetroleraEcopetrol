/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.almacenespetroleraecopetrol.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Mon
 */
@Entity
@Table(name = "tanque")
@NamedQueries({
    @NamedQuery(name = "Tanques.findAll", query = "SELECT t FROM Tanques t"),
    @NamedQuery(name = "Tanques.findByIdalmacen", query = "SELECT t FROM Tanques t WHERE t.idalmacen = :idalmacen")})

public class Tanques implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "idtanque")
    private Integer idtanque;
    
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    
    @Basic(optional = false)
    @Column(name = "estado")
    private boolean estado;
    
    @Basic(optional = false)
    @Column(name = "unidadmedida")
    private String unidadmedida;
    
    @Basic(optional = false)
    @Column(name = "cantidad")
    private String cantidad;
    
    @Basic(optional = false)
    @Column(name = "porcentajeocupacion")
    private String porcentajeocupacion;
    
    @JoinColumn(name = "idalmacen", referencedColumnName = "idalmacen")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Almacenes idalmacen;

    public Tanques() {
    }

    public Tanques(Integer idtanque) {
        this.idtanque = idtanque;
    }

    public Tanques(Integer idtanque, String nombre, boolean estado, String unidadmedida, String cantidad, String porcentajeocupacion) {
        this.idtanque = idtanque;
        this.nombre = nombre;
        this.estado = estado;
        this.unidadmedida = unidadmedida;
        this.cantidad = cantidad;
        this.porcentajeocupacion = porcentajeocupacion;
        this.idalmacen= idalmacen;
    }

    public Integer getIdtanque() {
        return idtanque;
    }

    public void setIdtanque(Integer idtanque) {
        this.idtanque = idtanque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getUnidadmedida() {
        return unidadmedida;
    }

    public void setUnidadmedida(String unidadmedida) {
        this.unidadmedida = unidadmedida;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPorcentajeocupacion() {
        return porcentajeocupacion;
    }

    public void setPorcentajeocupacion(String porcentajeocupacion) {
        this.porcentajeocupacion = porcentajeocupacion;
    }

    public Almacenes getIdalmacen() {
        return idalmacen;
    }

    public void setIdalmacen(Almacenes idalmacen) {
        this.idalmacen = idalmacen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtanque != null ? idtanque.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tanques)) {
            return false;
        }
        Tanques other = (Tanques) object;
        if ((this.idtanque == null && other.idtanque != null) || (this.idtanque != null && !this.idtanque.equals(other.idtanque))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prueba.tecnica.almacenespetroleraecopetrol.entities.Tanques[ idtanque=" + idtanque + " ]";
    }
    
}
