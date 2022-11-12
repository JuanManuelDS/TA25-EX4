
drop table if exists peliculas;
CREATE TABLE peliculas (
codigo INT AUTO_INCREMENT,
nombre VARCHAR(100),
calificacion_edad INT,
PRIMARY KEY (codigo));

drop table if exists salas;
CREATE TABLE salas (
codigo INT AUTO_INCREMENT,
nombre VARCHAR(100),
pelicula INT not null REFERENCES peliculas(codigo) ON DELETE CASCADE ON UPDATE CASCADE,
PRIMARY KEY (codigo));


insert into peliculas (nombre, calificacion_edad) values ('Back to the Future', 17);
insert into peliculas (nombre, calificacion_edad) values ('Case départ', 9);
insert into peliculas (nombre, calificacion_edad) values ('Sex in Chains (Geschlecht in Fesseln)', 17);
insert into peliculas (nombre, calificacion_edad) values ('Sarah''s Key (Elle s''appelait Sarah)', 5);
insert into peliculas (nombre, calificacion_edad) values ('Internes Can''t Take Money', 13);
insert into peliculas (nombre, calificacion_edad) values ('The Hound of the Baskervilles', 13);
insert into peliculas (nombre, calificacion_edad) values ('Yu-Gi-Oh!: Bonds Beyond Time (Gekijouban Yuugiou: Chouyuugou! Jikuu o koeta kizuna)', 11);
insert into peliculas (nombre, calificacion_edad) values ('Organizer, The (I compagni)', 7);
insert into peliculas (nombre, calificacion_edad) values ('Cat''s Meow, The', 11);
insert into peliculas (nombre, calificacion_edad) values ('Space Odyssey: Voyage to the Planets', 9);
insert into peliculas (nombre, calificacion_edad) values ('The Trip to Bountiful', 5);
insert into peliculas (nombre, calificacion_edad) values ('Letter to Elia, A', 3);
insert into peliculas (nombre, calificacion_edad) values ('The Good Lie', 5);
insert into peliculas (nombre, calificacion_edad) values ('Rebound', 9);
insert into peliculas (nombre, calificacion_edad) values ('Through a Glass Darkly (Såsom i en spegel)', 4);
insert into peliculas (nombre, calificacion_edad) values ('Modern Problems', 4);
insert into peliculas (nombre, calificacion_edad) values ('White Banners', 15);
insert into peliculas (nombre, calificacion_edad) values ('Scream 4', 10);
insert into peliculas (nombre, calificacion_edad) values ('Kickboxer 4: The Aggressor', 13);
insert into peliculas (nombre, calificacion_edad) values ('Bolero (Uns et les autres, Les)', 14);

insert into salas (nombre, pelicula) values ('Comedy|Drama|Thriller', 1);
insert into salas (nombre, pelicula) values ('Horror', 2);
insert into salas (nombre, pelicula) values ('Drama|War', 3);
insert into salas (nombre, pelicula) values ('Action|Adventure|Thriller', 4);
insert into salas (nombre, pelicula) values ('Comedy', 5);
insert into salas (nombre, pelicula) values ('Adventure|Drama|Romance|War', 6);
insert into salas (nombre, pelicula) values ('Drama|Romance|War', 7);
insert into salas (nombre, pelicula) values ('Comedy|Drama', 8);
insert into salas (nombre, pelicula) values ('Adventure|Comedy|Drama', 9);
insert into salas (nombre, pelicula) values ('(no genres listed)', 10);
insert into salas (nombre, pelicula) values ('Drama|Fantasy|Mystery', 11);
insert into salas (nombre, pelicula) values ('Crime|Drama', 12);
insert into salas (nombre, pelicula) values ('Drama', 13);
insert into salas (nombre, pelicula) values ('Documentary', 14);
insert into salas (nombre, pelicula) values ('Action|Drama|Thriller', 15);
insert into salas (nombre, pelicula) values ('Comedy|Drama|Romance', 16);
insert into salas (nombre, pelicula) values ('Action|Animation|Drama|Sci-Fi', 18);
insert into salas (nombre, pelicula) values ('Drama|Thriller', 19);
insert into salas (nombre, pelicula) values ('Comedy|Horror', 20);