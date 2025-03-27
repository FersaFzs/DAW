-- Examen Triggers
-- José María Fernández Saavedra
-- 1 DAW

-- EJERCICIO 1:
/*
Un TRIGGER es un procedimiento que se ejecuta automáticamente antes o después de alguna operacion de tipo
INSERT, UPDATE o DELETE. Se indica el momento de su ejecución con BEFORE o AFTER

Caso práctico 1:
Para evitar un DELETE real se usa un trigger para la eliminación lógica. Se crea un campo activo que pasa
a valer 0 por un trigger UPDATE en un AFTER DELETE

Caso práctico 2:
Para llevar un registro de auditoría de los cambios en una tabla. Por ejemplo, si cuando hacemos un cambio 
en el precio de un producto queremos llevar registro del cambio guardando el precio antiguo y el precio nuevo
del producto modificado se utiliza un trigger AFTER UPDATE.
*/


-- EJERCICIO 2:
/*
Las diferencias entre un trigger BEFORE y un AFTER son principalmente el momento de ejecución de la operación.

En un trigger BEFORE ejecuta la función ANTES de la operación. Por ejemplo, sería recomendable utilizar un 
trigger BEFORE para una eliminación lógica, pues queremos que se ejecute ANTES de que la operación elimine.

Un trigger AFTER ejecuta la función inmediatamente DESPUÉS de la operación. Por ejemplo, sería recomendable 
utilizar un trigger AFTER para un registro de auditoría de cambios en una tabla, pues queremos que se
guarde registro una vez ya se haya hecho el cambio. 
*/


-- EJERCICIO 3:
/*
El error 1442 de MySQL ocurre cuando se intenta modificar la misma tabla dentro del trigger. Es decir, que 
sobre la misma tabla que está ejecutandose el trigger intentemos hacer una modificacion en el mismo.
La solución a esto es sencillamente utilizar una tabla auxiliar.

MySQL tiene restricciones sobre la modificación de la misma tabla en las operaciones BEFORE DELETE pues, 
como es lógico, no se puede modificar el registro porque aún no ha sido eliminado.
*/


-- EJERCICIO 4:
-- crear tabla historial_precios --
CREATE TABLE `empresa_asir1_tarde`.`historial_precios` (
  `id_producto` VARCHAR(45) NOT NULL,
  `precio_antiguo` INT NULL,
  `precio_nuevo` INT NULL,
  `fecha_cambio` DATE NULL,
  PRIMARY KEY (`id_producto`));
-- Trigger AFTER UPDATE --
DELIMITER $$
USE `empresa_asir1_tarde`$$
CREATE DEFINER = CURRENT_USER TRIGGER `empresa_asir1_tarde`.`productos_AFTER_UPDATE` AFTER UPDATE ON `productos` FOR EACH ROW
BEGIN
INSERT INTO historial_precios (id_producto, precio_antiguo, precio_nuevo, fecha_cambio)
VALUES (id_producto, OLD.precio, NEW.precio, now());
END$$
DELIMITER ;


-- EJERCICIO 5:
-- Trigger BEFORE INSERT --
DELIMITER $$
USE `empresa_asir1_tarde`$$
CREATE DEFINER = CURRENT_USER TRIGGER `empresa_asir1_tarde`.`productos_BEFORE_INSERT` BEFORE INSERT ON `productos` FOR EACH ROW
BEGIN
IF NEW.existencias < 0 
THEN 
SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = "El stock no puede ser negativo";
END IF;
END$$
DELIMITER ;
-- Trigger BEFORE UPDATE --
DELIMITER $$
USE `empresa_asir1_tarde`$$
CREATE DEFINER = CURRENT_USER TRIGGER `empresa_asir1_tarde`.`productos_BEFORE_UPDATE` BEFORE UPDATE ON `productos` FOR EACH ROW
BEGIN
IF NEW.existencias < 0 
THEN 
SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = "El stock no puede ser negativo";
END IF;
END$$
DELIMITER ;


-- EJERCICIO 6:
-- crear columna activo --
ALTER TABLE `empresa_asir1_tarde`.`clientes` 
ADD COLUMN `activo` INT NOT NULL DEFAULT 1 AFTER `límite_crédito`;
-- Trigger BEFORE DELETE --
DELIMITER $$
USE `empresa_asir1_tarde`$$
CREATE DEFINER=`root`@`localhost` TRIGGER `clientes_BEFORE_DELETE` BEFORE DELETE ON `clientes` FOR EACH ROW BEGIN
UPDATE clientes
SET activo = 0;
SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Eliminación lógica exitosa';
END$$
DELIMITER ;


-- EJERCICIO 7:
-- crear columna codigo_factura --
ALTER TABLE `empresa_asir1_tarde`.`pedidos` 
ADD COLUMN `codigo_factura` VARCHAR(45) NULL AFTER `importe`;
-- Trigger BEFORE INSERT
DELIMITER $$
USE `empresa_asir1_tarde`$$
CREATE DEFINER = CURRENT_USER TRIGGER `empresa_asir1_tarde`.`pedidos_BEFORE_INSERT` BEFORE INSERT ON `pedidos` FOR EACH ROW
BEGIN
UPDATE pedidos SET codigo_cliente = CONCAT('FAC-', LPAD((SELECT COUNT(*)+1 FROM pedidos),4,'0'));
END$$
DELIMITER ;

