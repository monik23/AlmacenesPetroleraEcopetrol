package com.prueba.tecnica.almacenespetroleraecopetrol.entities;

import com.prueba.tecnica.almacenespetroleraecopetrol.entities.Ciudades;
import com.prueba.tecnica.almacenespetroleraecopetrol.entities.Operaciones;
import com.prueba.tecnica.almacenespetroleraecopetrol.entities.Tanques;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-07-25T12:02:59")
@StaticMetamodel(Almacenes.class)
public class Almacenes_ { 

    public static volatile ListAttribute<Almacenes, Operaciones> operacionList;
    public static volatile SingularAttribute<Almacenes, Ciudades> idciudad;
    public static volatile SingularAttribute<Almacenes, String> nombre;
    public static volatile SingularAttribute<Almacenes, Integer> idalmacen;
    public static volatile ListAttribute<Almacenes, Tanques> tanqueList;

}