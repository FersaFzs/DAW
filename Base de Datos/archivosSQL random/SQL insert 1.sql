SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

DROP SCHEMA IF EXISTS `empresa_asir1` ;
CREATE SCHEMA IF NOT EXISTS `empresa_asir1` DEFAULT CHARACTER SET utf8 ;
USE `empresa_asir1` ;

-- -----------------------------------------------------
-- Table `empresa_asir1`.`oficinas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `empresa_asir1`.`oficinas` ;

CREATE TABLE IF NOT EXISTS `empresa_asir1`.`oficinas` (
  `oficina` INT(11) NOT NULL,
  `ciudad` VARCHAR(45) NULL DEFAULT NULL,
  `región` VARCHAR(45) NULL DEFAULT NULL,
  `dir` INT(11) NULL DEFAULT NULL,
  `objetivo` INT(11) NULL DEFAULT NULL,
  `ventas` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`oficina`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `empresa_asir1`.`repventas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `empresa_asir1`.`repventas` ;

CREATE TABLE IF NOT EXISTS `empresa_asir1`.`repventas` (
  `num_empl` INT(11) NOT NULL,
  `nombre` VARCHAR(45) NULL DEFAULT NULL,
  `edad` INT(11) NULL DEFAULT NULL,
  `oficina_rep` INT(11) NULL DEFAULT NULL,
  `título` VARCHAR(45) NULL DEFAULT NULL,
  `contrato` DATE NULL DEFAULT NULL,
  `director` INT(11) NULL DEFAULT NULL,
  `cuota` INT(11) NULL DEFAULT NULL,
  `ventas` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`num_empl`),
  INDEX `fk_repventas_oficinas_idx` (`oficina_rep` ASC),
  CONSTRAINT `fk_repventas_oficinas`
    FOREIGN KEY (`oficina_rep`)
    REFERENCES `empresa_asir1`.`oficinas` (`oficina`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `empresa_asir1`.`clientes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `empresa_asir1`.`clientes` ;

CREATE TABLE IF NOT EXISTS `empresa_asir1`.`clientes` (
  `num_clie` INT(11) NOT NULL,
  `empresa` VARCHAR(45) NULL DEFAULT NULL,
  `rep_clie` INT(11) NULL DEFAULT NULL,
  `límite_crédito` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`num_clie`),
  INDEX `fk_clientes_repventas1_idx` (`rep_clie` ASC),
  CONSTRAINT `fk_clientes_repventas1`
    FOREIGN KEY (`rep_clie`)
    REFERENCES `empresa_asir1`.`repventas` (`num_empl`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `empresa_asir1`.`productos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `empresa_asir1`.`productos` ;

CREATE TABLE IF NOT EXISTS `empresa_asir1`.`productos` (
  `id_fab` VARCHAR(45) NOT NULL,
  `id_producto` VARCHAR(45) NOT NULL,
  `descripción` VARCHAR(45) NULL DEFAULT NULL,
  `precio` INT(11) NULL DEFAULT NULL,
  `existencias` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id_fab`, `id_producto`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `empresa_asir1`.`pedidos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `empresa_asir1`.`pedidos` ;

CREATE TABLE IF NOT EXISTS `empresa_asir1`.`pedidos` (
  `num_pedido` INT(11) NOT NULL,
  `fecha_pedido` DATE NULL DEFAULT NULL,
  `clie` INT(11) NULL DEFAULT NULL,
  `rep` INT(11) NULL DEFAULT NULL,
  `fab` VARCHAR(45) NULL DEFAULT NULL,
  `producto` VARCHAR(45) NULL DEFAULT NULL,
  `cant` INT(11) NULL DEFAULT NULL,
  `importe` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`num_pedido`),
  INDEX `fk_pedidos_repventas1_idx` (`rep` ASC),
  INDEX `fk_pedidos_clientes1_idx` (`clie` ASC),
  INDEX `fk_pedidos_productos1_idx` (`producto` ASC, `fab` ASC),
  CONSTRAINT `fk_pedidos_repventas1`
    FOREIGN KEY (`rep`)
    REFERENCES `empresa_asir1`.`repventas` (`num_empl`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_pedidos_clientes1`
    FOREIGN KEY (`clie`)
    REFERENCES `empresa_asir1`.`clientes` (`num_clie`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_pedidos_productos1`
    FOREIGN KEY (`fab` , `producto`)
    REFERENCES `empresa_asir1`.`productos` (`id_fab` , `id_producto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Data for table `empresa_asir1`.`oficinas`
-- -----------------------------------------------------
START TRANSACTION;
USE `empresa_asir1`;
INSERT INTO `empresa_asir1`.`oficinas` (`oficina`, `ciudad`, `región`, `dir`, `objetivo`, `ventas`) VALUES (11, 'Valencia', 'Este', 106, 52500, 40063);
INSERT INTO `empresa_asir1`.`oficinas` (`oficina`, `ciudad`, `región`, `dir`, `objetivo`, `ventas`) VALUES (12, 'Barcelona', 'Este', 104, 70000, 29328);
INSERT INTO `empresa_asir1`.`oficinas` (`oficina`, `ciudad`, `región`, `dir`, `objetivo`, `ventas`) VALUES (13, 'Alicante', 'Este', 105, 30000, 39327);
INSERT INTO `empresa_asir1`.`oficinas` (`oficina`, `ciudad`, `región`, `dir`, `objetivo`, `ventas`) VALUES (21, 'Madrid', 'Centro', 108, 60000, 81309);
INSERT INTO `empresa_asir1`.`oficinas` (`oficina`, `ciudad`, `región`, `dir`, `objetivo`, `ventas`) VALUES (22, 'Toledo', 'Centro', 108, 27500, 34432);

COMMIT;


-- -----------------------------------------------------
-- Data for table `empresa_asir1`.`repventas`
-- -----------------------------------------------------
START TRANSACTION;
USE `empresa_asir1`;
INSERT INTO `empresa_asir1`.`repventas` (`num_empl`, `nombre`, `edad`, `oficina_rep`, `título`, `contrato`, `director`, `cuota`, `ventas`) VALUES (101, 'Daniel Gutiérrez', 45, 12, 'Rep. Ventas', '1996/10/20', 104, 27500, 26628);
INSERT INTO `empresa_asir1`.`repventas` (`num_empl`, `nombre`, `edad`, `oficina_rep`, `título`, `contrato`, `director`, `cuota`, `ventas`) VALUES (102, 'Soledad Martínez', 48, 21, 'Rep. Ventas', '1996/12/10', 108, 30000, 22776);
INSERT INTO `empresa_asir1`.`repventas` (`num_empl`, `nombre`, `edad`, `oficina_rep`, `título`, `contrato`, `director`, `cuota`, `ventas`) VALUES (103, 'Pedro Cruz', 29, 12, 'Rep. Ventas', '1997/03/01', 104, 25000, 2700);
INSERT INTO `empresa_asir1`.`repventas` (`num_empl`, `nombre`, `edad`, `oficina_rep`, `título`, `contrato`, `director`, `cuota`, `ventas`) VALUES (104, 'Carlos Martínez', 33, 12, 'Dir. Ventas', '1997/05/19', 106, 17500, 0);
INSERT INTO `empresa_asir1`.`repventas` (`num_empl`, `nombre`, `edad`, `oficina_rep`, `título`, `contrato`, `director`, `cuota`, `ventas`) VALUES (105, 'Belén Aguirre', 37, 13, 'Dir. Ventas', '1998/02/12', 104, 30000, 39327);
INSERT INTO `empresa_asir1`.`repventas` (`num_empl`, `nombre`, `edad`, `oficina_rep`, `título`, `contrato`, `director`, `cuota`, `ventas`) VALUES (106, 'José Maldonado', 52, 11, 'VP Ventas', '1998/06/14', NULL, 25000, 32958);
INSERT INTO `empresa_asir1`.`repventas` (`num_empl`, `nombre`, `edad`, `oficina_rep`, `título`, `contrato`, `director`, `cuota`, `ventas`) VALUES (107, 'Natalia Martín', 49, 22, 'Rep. Ventas', '1998/11/14', 108, 27500, 34432);
INSERT INTO `empresa_asir1`.`repventas` (`num_empl`, `nombre`, `edad`, `oficina_rep`, `título`, `contrato`, `director`, `cuota`, `ventas`) VALUES (108, 'Lorenzo Fernández', 62, 21, 'Dir. Ventas', '1999/10/12', 106, 30000, 58533);
INSERT INTO `empresa_asir1`.`repventas` (`num_empl`, `nombre`, `edad`, `oficina_rep`, `título`, `contrato`, `director`, `cuota`, `ventas`) VALUES (109, 'María García', 31, 11, 'Rep. Ventas', '1999/10/12', 106, 27500, 7105);
INSERT INTO `empresa_asir1`.`repventas` (`num_empl`, `nombre`, `edad`, `oficina_rep`, `título`, `contrato`, `director`, `cuota`, `ventas`) VALUES (110, 'Antonio Valle', 41, NULL, 'Rep. Ventas', '2000/1/13', 101, NULL, 23123);

COMMIT;


-- -----------------------------------------------------
-- Data for table `empresa_asir1`.`clientes`
-- -----------------------------------------------------
START TRANSACTION;
USE `empresa_asir1`;
INSERT INTO `empresa_asir1`.`clientes` (`num_clie`, `empresa`, `rep_clie`, `límite_crédito`) VALUES (2101, 'Exclusivas Soriano S.A.', 106, 65000);
INSERT INTO `empresa_asir1`.`clientes` (`num_clie`, `empresa`, `rep_clie`, `límite_crédito`) VALUES (2102, 'Exclusivas del Este S.L.', 101, 65000);
INSERT INTO `empresa_asir1`.`clientes` (`num_clie`, `empresa`, `rep_clie`, `límite_crédito`) VALUES (2103, 'Pino S.L.', 105, 50000);
INSERT INTO `empresa_asir1`.`clientes` (`num_clie`, `empresa`, `rep_clie`, `límite_crédito`) VALUES (2105, 'MALB S.A.', 101, 45000);
INSERT INTO `empresa_asir1`.`clientes` (`num_clie`, `empresa`, `rep_clie`, `límite_crédito`) VALUES (2106, 'Construcciones León S.A.', 102, 65000);
INSERT INTO `empresa_asir1`.`clientes` (`num_clie`, `empresa`, `rep_clie`, `límite_crédito`) VALUES (2107, 'Distribuciones Sur S.A.', 110, 35000);
INSERT INTO `empresa_asir1`.`clientes` (`num_clie`, `empresa`, `rep_clie`, `límite_crédito`) VALUES (2108, 'Zapater Importaciones S.A.', 109, 55000);
INSERT INTO `empresa_asir1`.`clientes` (`num_clie`, `empresa`, `rep_clie`, `límite_crédito`) VALUES (2109, 'Roda & Castedo S.L.', 103, 25000);
INSERT INTO `empresa_asir1`.`clientes` (`num_clie`, `empresa`, `rep_clie`, `límite_crédito`) VALUES (2111, 'EVBE S.A.', 103, 50000);
INSERT INTO `empresa_asir1`.`clientes` (`num_clie`, `empresa`, `rep_clie`, `límite_crédito`) VALUES (2112, 'López Asociados S.L.', 108, 50000);
INSERT INTO `empresa_asir1`.`clientes` (`num_clie`, `empresa`, `rep_clie`, `límite_crédito`) VALUES (2113, 'Importaciones Martín S.L.', 104, 20000);
INSERT INTO `empresa_asir1`.`clientes` (`num_clie`, `empresa`, `rep_clie`, `límite_crédito`) VALUES (2114, 'Componentes Fernández S.A.', 102, 20000);
INSERT INTO `empresa_asir1`.`clientes` (`num_clie`, `empresa`, `rep_clie`, `límite_crédito`) VALUES (2115, 'AFS S.A.', 101, 20000);
INSERT INTO `empresa_asir1`.`clientes` (`num_clie`, `empresa`, `rep_clie`, `límite_crédito`) VALUES (2117, 'Hnos. Ramón S.L.', 106, 35000);
INSERT INTO `empresa_asir1`.`clientes` (`num_clie`, `empresa`, `rep_clie`, `límite_crédito`) VALUES (2118, 'Exclusivas Norte S.A.', 108, 60000);
INSERT INTO `empresa_asir1`.`clientes` (`num_clie`, `empresa`, `rep_clie`, `límite_crédito`) VALUES (2119, 'Martínez & García S.L.', 109, 25000);
INSERT INTO `empresa_asir1`.`clientes` (`num_clie`, `empresa`, `rep_clie`, `límite_crédito`) VALUES (2120, 'Distribuciones Montiel S.L.', 102, 50000);
INSERT INTO `empresa_asir1`.`clientes` (`num_clie`, `empresa`, `rep_clie`, `límite_crédito`) VALUES (2121, 'Hernández & hijos S.L.', 103, 45000);
INSERT INTO `empresa_asir1`.`clientes` (`num_clie`, `empresa`, `rep_clie`, `límite_crédito`) VALUES (2122, 'JPF S.L.', 105, 30000);
INSERT INTO `empresa_asir1`.`clientes` (`num_clie`, `empresa`, `rep_clie`, `límite_crédito`) VALUES (2123, 'Hnos. Martínez S.A.', 102, 40000);
INSERT INTO `empresa_asir1`.`clientes` (`num_clie`, `empresa`, `rep_clie`, `límite_crédito`) VALUES (2124, 'Domingo S.L.', 107, 40000);

COMMIT;


-- -----------------------------------------------------
-- Data for table `empresa_asir1`.`productos`
-- -----------------------------------------------------
START TRANSACTION;
USE `empresa_asir1`;
INSERT INTO `empresa_asir1`.`productos` (`id_fab`, `id_producto`, `descripción`, `precio`, `existencias`) VALUES ('ACI', '41001', 'Artículo Tipo 1', 55, 277);
INSERT INTO `empresa_asir1`.`productos` (`id_fab`, `id_producto`, `descripción`, `precio`, `existencias`) VALUES ('ACI', '41002', 'Artículo Tipo 2', 76, 167);
INSERT INTO `empresa_asir1`.`productos` (`id_fab`, `id_producto`, `descripción`, `precio`, `existencias`) VALUES ('ACI', '41003', 'Artículo Tipo 3', 107, 207);
INSERT INTO `empresa_asir1`.`productos` (`id_fab`, `id_producto`, `descripción`, `precio`, `existencias`) VALUES ('ACI', '41004', 'Artículo Tipo 4', 117, 139);
INSERT INTO `empresa_asir1`.`productos` (`id_fab`, `id_producto`, `descripción`, `precio`, `existencias`) VALUES ('ACI', '4100X', 'Ajustador', 25, 37);
INSERT INTO `empresa_asir1`.`productos` (`id_fab`, `id_producto`, `descripción`, `precio`, `existencias`) VALUES ('ACI', '4100Y', 'Extractor', 2750, 25);
INSERT INTO `empresa_asir1`.`productos` (`id_fab`, `id_producto`, `descripción`, `precio`, `existencias`) VALUES ('ACI', '4100Z', 'Montador', 2500, 28);
INSERT INTO `empresa_asir1`.`productos` (`id_fab`, `id_producto`, `descripción`, `precio`, `existencias`) VALUES ('BIC', '41003', 'Manivela', 652, 3);
INSERT INTO `empresa_asir1`.`productos` (`id_fab`, `id_producto`, `descripción`, `precio`, `existencias`) VALUES ('BIC', '41089', 'Retén', 225, 78);
INSERT INTO `empresa_asir1`.`productos` (`id_fab`, `id_producto`, `descripción`, `precio`, `existencias`) VALUES ('BIC', '41672', 'Plate', 180, 0);
INSERT INTO `empresa_asir1`.`productos` (`id_fab`, `id_producto`, `descripción`, `precio`, `existencias`) VALUES ('FEA', '112', 'Cubierta', 148, 115);
INSERT INTO `empresa_asir1`.`productos` (`id_fab`, `id_producto`, `descripción`, `precio`, `existencias`) VALUES ('FEA', '114', 'Bancada Motor', 243, 15);
INSERT INTO `empresa_asir1`.`productos` (`id_fab`, `id_producto`, `descripción`, `precio`, `existencias`) VALUES ('IMM', '773C', 'Riostra 1/2-Tm', 975, 28);
INSERT INTO `empresa_asir1`.`productos` (`id_fab`, `id_producto`, `descripción`, `precio`, `existencias`) VALUES ('IMM', '775C', 'Riostra 1-Tm', 1425, 5);
INSERT INTO `empresa_asir1`.`productos` (`id_fab`, `id_producto`, `descripción`, `precio`, `existencias`) VALUES ('IMM', '779C', 'Riostra 2-Tm', 1875, 9);
INSERT INTO `empresa_asir1`.`productos` (`id_fab`, `id_producto`, `descripción`, `precio`, `existencias`) VALUES ('IMM', '887H', 'Soporte Riostra', 54, 223);
INSERT INTO `empresa_asir1`.`productos` (`id_fab`, `id_producto`, `descripción`, `precio`, `existencias`) VALUES ('IMM', '887P', 'Perno Riostra', 250, 24);
INSERT INTO `empresa_asir1`.`productos` (`id_fab`, `id_producto`, `descripción`, `precio`, `existencias`) VALUES ('IMM', '887X', 'Retenedor Piostra', 475, 32);
INSERT INTO `empresa_asir1`.`productos` (`id_fab`, `id_producto`, `descripción`, `precio`, `existencias`) VALUES ('QSA', 'XK47', 'Reductor', 355, 38);
INSERT INTO `empresa_asir1`.`productos` (`id_fab`, `id_producto`, `descripción`, `precio`, `existencias`) VALUES ('QSA', 'XK48', 'Reductor', 134, 203);
INSERT INTO `empresa_asir1`.`productos` (`id_fab`, `id_producto`, `descripción`, `precio`, `existencias`) VALUES ('QSA', 'XK48A', 'Reductor', 117, 37);
INSERT INTO `empresa_asir1`.`productos` (`id_fab`, `id_producto`, `descripción`, `precio`, `existencias`) VALUES ('REI', '2A44G', 'Pasador Bisagra', 350, 14);
INSERT INTO `empresa_asir1`.`productos` (`id_fab`, `id_producto`, `descripción`, `precio`, `existencias`) VALUES ('REI', '2A44L', 'Bisagra Izqda.', 4500, 12);
INSERT INTO `empresa_asir1`.`productos` (`id_fab`, `id_producto`, `descripción`, `precio`, `existencias`) VALUES ('REI', '2A44R', 'Bisagra Dcha.', 4500, 12);
INSERT INTO `empresa_asir1`.`productos` (`id_fab`, `id_producto`, `descripción`, `precio`, `existencias`) VALUES ('REI', '2A45C', 'V Stago Trinquete', 79, 210);

COMMIT;


-- -----------------------------------------------------
-- Data for table `empresa_asir1`.`pedidos`
-- -----------------------------------------------------
START TRANSACTION;
USE `empresa_asir1`;
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (110036, '2000/1/30', 2107, 110, 'ACI', '4100Z', 9, 22500);
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (112961, '1999/12/17', 2117, 106, 'REI', '2A44L', 7, 31500);
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (112963, '1999/12/17', 2103, 105, 'ACI', '41004', 28, 3276);
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (112968, '1999/10/12', 2102, 101, 'ACI', '41004', 34, 3978);
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (112975, '1999/10/12', 2111, 103, 'REI', '2A44G', 6, 2100);
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (112979, '1999/10/12', 2114, 102, 'ACI', '4100Z', 6, 15000);
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (112983, '1999/12/27', 2103, 105, 'ACI', '41004', 6, 702);
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (112987, '1999/12/31', 2103, 105, 'ACI', '4100Y', 11, 27500);
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (112989, '2000/1/3', 2101, 106, 'FEA', '114', 6, 1458);
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (112992, '1999/11/4', 2118, 108, 'ACI', '41002', 10, 760);
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (112993, '2000/01/4', 2106, 102, 'REI', '2A45C', 24, 1896);
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (112997, '2000/1/8', 2124, 107, 'BIC', '41003', 1, 652);
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (113003, '2000/1/25', 2108, 109, 'IMM', '779C', 3, 5625);
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (113007, '2000/1/8', 2112, 108, 'IMM', '773C', 3, 2825);
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (113012, '2000/1/11', 2111, 105, 'ACI', '41003', 35, 3745);
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (113013, '2000/1/14', 2118, 108, 'BIC', '41003', 1, 652);
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (113024, '2000/1/20', 2114, 108, 'QSA', 'XK47', 20, 7100);
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (113027, '2000/2/22', 2103, 105, 'ACI', '41002', 54, 4104);
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (113034, '2000/1/29', 2107, 110, 'REI', '2A45C', 8, 632);
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (113042, '2000/2/2', 2113, 101, 'REI', '2A44R', 5, 22500);
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (113045, '2000/2/2', 2112, 108, 'REI', '2A44R', 10, 45000);
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (113048, '2000/2/10', 2120, 102, 'IMM', '779C', 2, 3750);
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (113049, '2000/2/10', 2118, 108, 'QSA', 'XK47', 2, 776);
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (113051, '2000/2/10', 2118, 108, 'QSA', 'XK47', 4, 1420);
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (113055, '2000/2/15', 2108, 101, 'ACI', '4100X', 6, 150);
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (113057, '2000/2/18', 2111, 103, 'ACI', '4100X', 24, 600);
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (113058, '2000/2/23', 2108, 109, 'FEA', '112', 10, 1480);
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (113062, '2000/2/24', 2124, 107, 'FEA', '114', 10, 2430);
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (113065, '2000/2/27', 2106, 102, 'QSA', 'XK47', 6, 2130);
INSERT INTO `empresa_asir1`.`pedidos` (`num_pedido`, `fecha_pedido`, `clie`, `rep`, `fab`, `producto`, `cant`, `importe`) VALUES (113069, '2000/3/2', 2109, 107, 'IMM', '775C', 22, 31350);

COMMIT;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
