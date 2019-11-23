-- MODIFICADO: 22/11/2019

DROP DATABASE juegosDB;
CREATE DATABASE juegosDB;
USE juegosDB;

CREATE TABLE juegos(
	id int not null primary key auto_increment,
    juego varchar(45) not null,
    fecLanz date not null,
    foto varchar(255)
);

CREATE TABLE categorias(
	id int not null primary key auto_increment,
    categoria varchar(45) not null
);

/* NOMBRE: Luciano

CREATE TABLE tiposCategorias(
	id int not null primary key auto_increment,
    tipo varchar(55) not null
);

*/

/*
CREATE TABLE creadores(
	id int not null primary key auto_increment,
    apellido varchar(45) not null,
    nombre varchar(45) not null
);

CREATE TABLE tiposCreadores(
	id int not null primary key auto_increment,
    tipo varchar(55) not null
); */

/*
CREATE TABLE empresas(
	id int not null primary key auto_increment,
    empresa varchar(55) not null
); */

CREATE TABLE modos(
	id int not null primary key auto_increment
);

CREATE TABLE tiposModos(
	id int not null primary key auto_increment,
    tipo varchar(55) not null
);

CREATE TABLE plataformas(
	id int not null primary key auto_increment
);

CREATE TABLE tiposPlataformas(
	id int not null primary key auto_increment,
    tipo varchar(55) not null
);

-- CREADORES

/* ALTER TABLE creadores ADD COLUMN id_juego INT NULL; */
/* ALTER TABLE creadores ADD COLUMN id_tipoCreador INT NULL; */
/* ALTER TABLE creadores ADD COLUMN id_empresa INT NULL; */

/* ALTER TABLE creadores ADD CONSTRAINT id_juego
FOREIGN KEY (id_juego) REFERENCES juegos(id);
ALTER TABLE creadores ADD CONSTRAINT id_tipoCreador
FOREIGN KEY (id_tipoCreador) REFERENCES tiposCreadores(id);
ALTER TABLE creadores ADD CONSTRAINT id_empresa
FOREIGN KEY (id_empresa) REFERENCES empresas(id); */

/*
	ALTER TABLE categorias ADD COLUMN id_tipoCategoria INT NULL;
	ALTER TABLE categorias ADD CONSTRAINT id_tipoCategoria
	FOREIGN KEY (id_tipoCategoria) REFERENCES tiposCategorias(id);
*/

-- MODOS

ALTER TABLE modos ADD COLUMN id_tipoModo INT NULL;

ALTER TABLE modos ADD CONSTRAINT id_tipoModo
FOREIGN KEY (id_tipoModo) REFERENCES tiposModos(id);

ALTER TABLE modos ADD COLUMN id_jue INT NULL;

ALTER TABLE modos ADD CONSTRAINT id_jue
FOREIGN KEY (id_jue) REFERENCES Juegos(id);

-- PLATAFORMAS

ALTER TABLE plataformas ADD COLUMN id_tipoPlataforma INT NULL;

ALTER TABLE plataformas ADD CONSTRAINT id_tipoPlataforma
FOREIGN KEY (id_tipoPlataforma) REFERENCES tiposPlataformas(id);

ALTER TABLE plataformas ADD COLUMN id_jueg INT NULL;

ALTER TABLE plataformas ADD CONSTRAINT id_jueg
FOREIGN KEY (id_jueg) REFERENCES Juegos(id);

-- JUEGOS

ALTER TABLE juegos ADD COLUMN id_categoria INT NULL;

ALTER TABLE juegos ADD CONSTRAINT id_categoria
FOREIGN KEY (id_categoria) REFERENCES Categorias(id);


