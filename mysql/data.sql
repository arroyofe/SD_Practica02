-- Creación de la tabla libros
CREATE TABLE IF NOT EXISTS libros (
                                    idlib int AUTO_INCREMENT PRIMARY KEY,
                                    titulo VARCHAR(255) NOT NULL,
    				                autor VARCHAR(255) NOT NULL
    );

-- introducir datos en la tabla libros
INSERT INTO libros (titulo, autor) VALUES
                                      ('To Kill a Mockingbird', 'Harper Lee'),
                                      ('1984', 'George Orwell'),
                                      ('The Great Gatsby', 'F. Scott Fitzgerald'),
                                      ('Pride and Prejudice', 'Jane Austen'),
                                      ('The Catcher in the Rye', 'J.D. Salinger');

-- Creación de la tabla usuarios
CREATE TABLE IF NOT EXISTS usuarios
(
    id int AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR (255) NOT NULL,
    apellidos VARCHAR(255) NOT NULL,
    clave VARCHAR(50),
    email VARCHAR(255)

 );

-- Introducir datos de ejemplo
INSERT INTO usuarios(nombre, apellidos)
VALUES ('Fernando', 'Arroyo Redondo'),
       ('Luisa', 'López Lòpez'),
       ('Julián', 'de Cervantes'),
       ('Liborio', 'Panadero Jiménez');