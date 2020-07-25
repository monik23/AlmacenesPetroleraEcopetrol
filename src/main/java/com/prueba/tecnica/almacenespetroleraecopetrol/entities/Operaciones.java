/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.almacenespetroleraecopetrol.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mon
 */
@Entity
@Table(name = "operacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Operaciones.findAll", query = "SELECT o FROM Operaciones o"),
    @NamedQuery(name = "Operaciones.findByIdoperacion", query = "SELECT o FROM Operaciones o WHERE o.idoperacion = :idoperacion"),
    @NamedQuery(name = "Operaciones.findByFechaHora", query = "SELECT o FROM Operaciones o WHERE o.fechaHora = :fechaHora"),
    @NamedQuery(name = "Operaciones.findByUnidadmedida", query = "SELECT o FROM Operaciones o WHERE o.unidadmedida = :unidadmedida")})
public class Operaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idoperacion")
    private Integer idoperacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaHora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHora;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "unidadmedida")
    private String unidadmedida;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 16777215)
    @Column(name = "cantidad")
    private String cantidad;
    @JoinColumn(name = "idalmacen", referencedColumnName = "idalmacen")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Almacenes idalmacen;
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Usuarios idusuario;

    public Operaciones() {
    }

    public Operaciones(Integer idoperacion) {
        this.idoperacion = idoperacion;
    }

    public Operaciones(Integer idoperacion, Date fechaHora, String unidadmedida, String cantidad) {
        this.idoperacion = idoperacion;
        this.fechaHora = fechaHora;
        this.unidadmedida = unidadmedida;
        this.cantidad = cantidad;
    }

    public Integer getIdoperacion() {
        return idoperacion;
    }

    public void setIdoperacion(Integer idoperacion) {
        this.idoperacion = idoperacion;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
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

    public Almacenes getIdalmacen() {
        return idalmacen;
    }

    public void setIdalmacen(Almacenes idalmacen) {
        this.idalmacen = idalmacen;
    }

    public Usuarios getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Usuarios idusuario) {
        this.idusuario = idusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idoperacion != null ? idoperacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Operaciones)) {
            return false;
        }
        Operaciones other = (Operaciones) object;
        if ((this.idoperacion == null && other.idoperacion != null) || (this.idoperacion != null && !this.idoperacion.equals(other.idoperacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prueba.tecnica.almacenespetroleraecopetrol.entities.Operaciones[ idoperacion=" + idoperacion + " ]";
    }
    
}
