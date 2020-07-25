--Creacion DB --
CREATE DATABASE almacenesecopetrol;

use almacenesecopetrol;


--Creacion tablas --

CREATE TABLE almacen(
	idalmacen INT (6)  AUTO_INCREMENT NOT NULL PRIMARY KEY,
	idciudad INT(6) NOT NULL,
	nombre VARCHAR(63) NOT NULL
	);


CREATE TABLE ciudad(
	idciudad INT (6)  AUTO_INCREMENT NOT NULL PRIMARY KEY,
	nombre VARCHAR(63) NOT NULL
	);



CREATE TABLE tanque(
	idtanque INT (6)  AUTO_INCREMENT NOT NULL PRIMARY KEY,
	nombre VARCHAR(63) NOT NULL,
	estado BOOLEAN NOT NULL,
	unidadmedida VARCHAR(2) NOT NULL,
	cantidad LONG NOT NULL,
	porcentajeocupacion LONG NOT NULL,
	idalmacen INT (6) NOT NULL
	);
	
CREATE TABLE operacion(
	idoperacion INT (6)  AUTO_INCREMENT NOT NULL PRIMARY KEY,
	idusuario  INT (6) NOT NULL,
	idalmacen INT (6) NOT NULL,
	fechaHora DATETIME NOT NULL,
	unidadmedida VARCHAR(2) NOT NULL,
	cantidad LONG NOT NULL
	);
	
CREATE TABLE usuario(
	idusuario INT (6)  AUTO_INCREMENT NOT NULL PRIMARY KEY,
	idrol INT (6) NOT NULL,
	usuario  VARCHAR (10) NOT NULL,
	password VARCHAR (20) NOT NULL,
	nombre VARCHAR(20) NOT NULL,
	apellido VARCHAR(20) NOT NULL,
	identificador INT(10) NOT NULL
	);
	
CREATE TABLE rol(
	idrol INT (6) AUTO_INCREMENT NOT NULL PRIMARY KEY,
	idpermiso INT (6) NOT NULL,
	nombre VARCHAR(10) NOT NULL,
	descripcion VARCHAR(30) NOT NULL
	);
	
CREATE TABLE permiso(
	idpermiso INT (6)  AUTO_INCREMENT NOT NULL PRIMARY KEY,
	nombre VARCHAR(10) NOT NULL,
	descripcion VARCHAR(30) NOT NULL
	);

--Generar llaves foreign--	

alter table almacen add constraint almacenciudad_fk foreign key (idciudad) references ciudad (idciudad);
alter table operacion add constraint almacenoperacion_fk foreign key (idalmacen) references almacen (idalmacen); 
alter table tanque add constraint tanquealmacen_fk foreign key (idalmacen) references almacen (idalmacen);
alter table operacion add constraint operacionusuario_fk foreign key (idusuario) references usuario (idusuario);
alter table usuario add constraint usuariorol_fk foreign key (idrol) references rol (idrol);
alter table rol add constraint rolpermiso_fk foreign key (idpermiso) references permiso (idpermiso);


--Llenado de tablas.--

INSERT INTO almacen (idalmacen, idciudad, nombre) VALUE (1,1,'Teusaquillo');
INSERT INTO almacen (idalmacen, idciudad, nombre) VALUE (2,1,'Andino');
INSERT INTO almacen (idalmacen, idciudad, nombre) VALUE (3,2,'Metro');

INSERT INTO ciudad (idciudad, nombre) VALUE (1, 'Bogota');
INSERT INTO ciudad (idciudad, nombre) VALUE (2, 'Medellin');
INSERT INTO ciudad (idciudad, nombre) VALUE (3, 'Cali');
INSERT INTO ciudad (idciudad, nombre) VALUE (4, 'Boyaca');
INSERT INTO ciudad (idciudad, nombre) VALUE (5, 'Cundinamarca');

INSERT INTO tanque (idtanque, nombre, estado, unidadmedida, cantidad, porcentajeocupacion, idalmacen) VALUE (1, 'ECO01', '1', 'lt', 10000, 70, 1);
INSERT INTO tanque (idtanque, nombre, estado, unidadmedida, cantidad, porcentajeocupacion, idalmacen) VALUE (2, 'ECO02', '1', 'lt', 30000, 50, 1);
INSERT INTO tanque (idtanque, nombre, estado, unidadmedida, cantidad, porcentajeocupacion, idalmacen) VALUE (3, 'ECO03', '1', 'lt', 20000, 30, 1);
INSERT INTO tanque (idtanque, nombre, estado, unidadmedida, cantidad, porcentajeocupacion, idalmacen) VALUE (4, 'ECO04', '1', 'lt', 50000, 40, 2);
INSERT INTO tanque (idtanque, nombre, estado, unidadmedida, cantidad, porcentajeocupacion, idalmacen) VALUE (5, 'ECO05', '1', 'lt', 70000, 70, 2);

INSERT INTO operacion (idoperacion, idusuario, idalmacen, fechaHora, unidadmedida, cantidad) VALUE (1, 1, 1, CURRENT_TIMESTAMP, 'lt', 5000);

INSERT INTO usuario (idusuario, idrol, usuario, password, nombre, apellido, identificador) VALUE (1, 1, 'pperez', '123456', 'Pedro', 'Perez', 12345321);
INSERT INTO usuario (idusuario, idrol, usuario, password, nombre, apellido, identificador) VALUE (2, 2, 'vmartinez', '123456', 'Victor', 'Martinez', 34567898);

INSERT INTO rol (idrol, idpermiso, nombre, descripcion) VALUE (1, 1, 'Administra', 'Administrador almacen');
INSERT INTO rol (idrol, idpermiso, nombre, descripcion) VALUE (2, 2, 'Tecnico', 'Tecnico almacen');

INSERT INTO permiso (idpermiso, nombre, descripcion) VALUE (1, 'General', 'Toda app');
INSERT INTO permiso (idpermiso, nombre, descripcion) VALUE (2, 'Tecnico', 'Almacen, cons. y act.');