package com.prueba.tecnica.almacenespetroleraecopetrol.entities;

import com.prueba.tecnica.almacenespetroleraecopetrol.entities.Operaciones;
import com.prueba.tecnica.almacenespetroleraecopetrol.entities.Roles;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-07-25T12:02:59")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, String> password;
    public static volatile SingularAttribute<Usuarios, Roles> idrol;
    public static volatile SingularAttribute<Usuarios, String> apellido;
    public static volatile SingularAttribute<Usuarios, String> usuario;
    public static volatile SingularAttribute<Usuarios, String> nombre;
    public static volatile ListAttribute<Usuarios, Operaciones> operacionesList;
    public static volatile SingularAttribute<Usuarios, Integer> idusuario;
    public static volatile SingularAttribute<Usuarios, Integer> identificador;

}