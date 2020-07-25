package com.prueba.tecnica.almacenespetroleraecopetrol.entities;

import com.prueba.tecnica.almacenespetroleraecopetrol.entities.Almacenes;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-07-25T12:02:59")
@StaticMetamodel(Tanques.class)
public class Tanques_ { 

    public static volatile SingularAttribute<Tanques, Boolean> estado;
    public static volatile SingularAttribute<Tanques, String> porcentajeocupacion;
    public static volatile SingularAttribute<Tanques, String> cantidad;
    public static volatile SingularAttribute<Tanques, Integer> idtanque;
    public static volatile SingularAttribute<Tanques, String> nombre;
    public static volatile SingularAttribute<Tanques, String> unidadmedida;
    public static volatile SingularAttribute<Tanques, Almacenes> idalmacen;

}