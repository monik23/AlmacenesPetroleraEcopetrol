package com.prueba.tecnica.almacenespetroleraecopetrol.entities;

import com.prueba.tecnica.almacenespetroleraecopetrol.entities.Almacenes;
import com.prueba.tecnica.almacenespetroleraecopetrol.entities.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-07-25T12:02:59")
@StaticMetamodel(Operaciones.class)
public class Operaciones_ { 

    public static volatile SingularAttribute<Operaciones, Date> fechaHora;
    public static volatile SingularAttribute<Operaciones, String> cantidad;
    public static volatile SingularAttribute<Operaciones, Integer> idoperacion;
    public static volatile SingularAttribute<Operaciones, String> unidadmedida;
    public static volatile SingularAttribute<Operaciones, Almacenes> idalmacen;
    public static volatile SingularAttribute<Operaciones, Usuarios> idusuario;

}