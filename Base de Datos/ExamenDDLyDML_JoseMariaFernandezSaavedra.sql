-- Pregunta 1 --
-- DDL: Es el lenguaje que se utiliza para definir, crear, eliminar y modificar tablas en SQL.
-- Algunos de los comandos principales son: 
-- 
-- CREATE TABLE (define y crea nuevas tablas)
-- Ejemplo:
-- CREATE TABLE productos (
-- id_producto INT PRIMARY KEY,
-- id_fabricante INT NOT NULL,
-- );
-- 
-- DROP TABLE: (elimina tablas)
-- DROP TABLE produtos;
-- 
-- ALTER TABLE: (modifica las tablas)
-- ALTER TABLE productos ADD fecha_fabricacion DATE;
-- ALTER TABLE productos DROP COLUMN fecha_fabricacion;
-- 

-- Pregunta 2 --
CREATE TABLE `examen`.`empleados` (
  `id_empleado` INT NOT NULL,
  `nombre` VARCHAR(50) NOT NULL,
  `puesto` VARCHAR(50) NULL,
  `salario` DECIMAL(10,2) NULL DEFAULT 0.00,
  `fecha_ingreso` DATE NOT NULL,
  PRIMARY KEY (`id_empleado`));

-- Pregunta 3 --
ALTER TABLE `examen`.`empleados` 
ADD `departamento` VARCHAR(50);

-- Pregunta 4 --
DROP TABLE `empleados`;

-- Pregunta 5 --
-- DML: Es el lenguaje que se utiliza en SQL para modificar el contenido de las tablas.
-- Algunos de los comandos principales son: 
-- 
-- INSERT (insertar nuevas filas de datos)
-- Ejemplo:
-- INSERT INTO empleados(nombre, edad, DNI, ventas)
-- VALUES(`Antonio`,27,12345678A,777);
-- 
-- UPDATE (Modifica datos existentes)
-- Ejemplo:
-- UPDATE empleados SET ventas = 0 WHERE ventas IS NULL
-- 
-- DELETE (Borra filas de datos existentes)
-- Ejemplo:
-- DELETE FROM pedidos WHERE DNI_rep = ( 
-- SELECT DNI FROM empleados WHERE nombre = `Antonio`);

-- Pregunta 6 --
INSERT INTO `examen`.`empleados`(id_empleado, nombre, puesto, salario, fecha_ingreso)
VALUES (101, `Juan Pérez`,`Analista`,5000.00,`2025-01-01`);

UPDATE `examen`.`empleados` SET salario = 5500.00 WHERE id_empleado = 101;

DELETE FROM `examen`.`empleados` WHERE id_empleado = 101;

-- Pregunta 7 --
CREATE VIEW SALARIO_ALTO AS
SELECT salario, puesto FROM `examen`.`empleados`
WHERE salario > 3000.00 AND puesto IS NOT NULL
ORDER BY nombre ASC;

-- Pregunta 8 --
INSERT INTO `empleados`(id_empleado, nombre, salario, fecha_ingreso) 
SELECT id_empleado, nombre, salario, fecha_ingreso 
FROM NuevosEmpleados 
WHERE fecha_ingreso >= '2025-01-01';
-- Este comando SQL lo que hace es insertar nuevas filas de datos en la tabla empleados
-- Las filas las saca de una nueva tabla que crea a partir de la tabla original pero
-- esa nueva tabla es filtrada pasando únicamente los empleados cuya fecha de ingreso es posterior al 
-- 1 de enero del 2025. 