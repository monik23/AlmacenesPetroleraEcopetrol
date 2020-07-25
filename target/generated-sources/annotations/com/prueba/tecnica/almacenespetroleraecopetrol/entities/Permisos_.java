package com.prueba.tecnica.almacenespetroleraecopetrol.entities;

import com.prueba.tecnica.almacenespetroleraecopetrol.entities.Roles;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-07-25T12:02:59")
@StaticMetamodel(Permisos.class)
public class Permisos_ { 

    public static volatile SingularAttribute<Permisos, String> descripcion;
    public static volatile ListAttribute<Permisos, Roles> rolesList;
    public static volatile SingularAttribute<Permisos, String> nombre;
    public static volatile SingularAttribute<Permisos, Integer> idpermiso;

}