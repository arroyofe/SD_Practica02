-- Creación de la base de datos de usuarios
CREATE DATABASE IF NOT EXISTS `usuarios`;
USE `usuarios`;

-- Creación de la tabla usuario
CREATE TABLE IF NOT EXISTS usuario
(
    id        INT AUTO_INCREMENT PRIMARY KEY,
    nombre    VARCHAR(255) NOT NULL,
    apellidos VARCHAR(255) NOT NULL,
    clave     VARCHAR(010),
    email     VARCHAR(255)

);

-- Introducir datos de ejemplo
INSERT INTO usuario(nombre, apellidos)
VALUES ('Fernando', 'Arroyo Redondo'),
       ('Luisa', 'López Lòpez'),
       ('Julián', 'de Cervantes'),
       ('Liborio', 'Panadero Jiménez');