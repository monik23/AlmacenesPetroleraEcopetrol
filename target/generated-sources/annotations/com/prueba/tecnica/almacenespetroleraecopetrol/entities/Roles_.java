package com.prueba.tecnica.almacenespetroleraecopetrol.entities;

import com.prueba.tecnica.almacenespetroleraecopetrol.entities.Permisos;
import com.prueba.tecnica.almacenespetroleraecopetrol.entities.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-07-25T12:02:59")
@StaticMetamodel(Roles.class)
public class Roles_ { 

    public static volatile SingularAttribute<Roles, String> descripcion;
    public static volatile ListAttribute<Roles, Usuarios> usuariosList;
    public static volatile SingularAttribute<Roles, Integer> idrol;
    public static volatile SingularAttribute<Roles, String> nombre;
    public static volatile SingularAttribute<Roles, Permisos> idpermiso;

}