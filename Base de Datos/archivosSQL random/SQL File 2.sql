-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: empresa_asir1
-- ------------------------------------------------------
-- Server version	8.0.32

use tema4;
oficinas
/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `num_clie` int NOT NULL,
  `empresa` varchar(45) DEFAULT NULL,
  `rep_clie` int DEFAULT NULL,
  `límite_crédito` int DEFAULT NULL,
  PRIMARY KEY (`num_clie`),
  KEY `fk_clientes_repventas1_idx` (`rep_clie`),
  CONSTRAINT `fk_clientes_repventas1` FOREIGN KEY (`rep_clie`) REFERENCES `repventas` (`num_empl`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (2101,'Exclusivas Soriano S.A.',106,65000),(2102,'Exclusivas del Este S.L.',101,65000),(2103,'Pino S.L.',105,50000),(2105,'MALB S.A.',101,45000),(2106,'Construcciones León S.A.',102,65000),(2107,'Distribuciones Sur S.A.',110,35000),(2108,'Zapater Importaciones S.A.',109,55000),(2109,'Roda & Castedo S.L.',103,25000),(2111,'EVBE S.A.',103,50000),(2112,'López Asociados S.L.',108,50000),(2113,'Importaciones Martín S.L.',104,20000),(2114,'Componentes Fernández S.A.',102,20000),(2115,'AFS S.A.',101,20000),(2117,'Hnos. Ramón S.L.',106,35000),(2118,'Exclusivas Norte S.A.',108,60000),(2119,'Martínez & García S.L.',109,25000),(2120,'Distribuciones Montiel S.L.',102,50000),(2121,'Hernández & hijos S.L.',103,45000),(2122,'JPF S.L.',105,30000),(2123,'Hnos. Martínez S.A.',102,40000),(2124,'Domingo S.L.',107,40000);
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `oficinas`
--

DROP TABLE IF EXISTS `oficinas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `oficinas` (
  `oficina` int NOT NULL,
  `ciudad` varchar(45) DEFAULT NULL,
  `región` varchar(45) DEFAULT NULL,
  `dir` int DEFAULT NULL,
  `objetivo` int DEFAULT NULL,
  `ventas` int DEFAULT NULL,
  PRIMARY KEY (`oficina`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `oficinas`
--

LOCK TABLES `oficinas` WRITE;
/*!40000 ALTER TABLE `oficinas` DISABLE KEYS */;
INSERT INTO `oficinas` VALUES (11,'Valencia','Este',106,52500,40063),(12,'Barcelona','Este',104,70000,29328),(13,'Alicante','Este',105,30000,39327),(21,'Madrid','Centro',108,60000,81309),(22,'Toledo','Centro',108,27500,34432);
/*!40000 ALTER TABLE `oficinas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidos`
--

DROP TABLE IF EXISTS `pedidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedidos` (
  `num_pedido` int NOT NULL,
  `fecha_pedido` date DEFAULT NULL,
  `clie` int DEFAULT NULL,
  `rep` int DEFAULT NULL,
  `fab` varchar(45) DEFAULT NULL,
  `producto` varchar(45) DEFAULT NULL,
  `cant` int DEFAULT NULL,
  `importe` int DEFAULT NULL,
  PRIMARY KEY (`num_pedido`),
  KEY `fk_pedidos_repventas1_idx` (`rep`),
  KEY `fk_pedidos_clientes1_idx` (`clie`),
  KEY `fk_pedidos_productos1_idx` (`producto`,`fab`),
  KEY `fk_pedidos_productos1` (`fab`,`producto`),
  CONSTRAINT `fk_pedidos_clientes1` FOREIGN KEY (`clie`) REFERENCES `clientes` (`num_clie`),
  CONSTRAINT `fk_pedidos_productos1` FOREIGN KEY (`fab`, `producto`) REFERENCES `productos` (`id_fab`, `id_producto`),
  CONSTRAINT `fk_pedidos_repventas1` FOREIGN KEY (`rep`) REFERENCES `repventas` (`num_empl`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidos`
--

LOCK TABLES `pedidos` WRITE;
/*!40000 ALTER TABLE `pedidos` DISABLE KEYS */;
INSERT INTO `pedidos` VALUES (110036,'2000-01-30',2107,110,'ACI','4100Z',9,22500),(112961,'1999-12-17',2117,106,'REI','2A44L',7,31500),(112963,'1999-12-17',2103,105,'ACI','41004',28,3276),(112968,'1999-10-12',2102,101,'ACI','41004',34,3978),(112975,'1999-10-12',2111,103,'REI','2A44G',6,2100),(112979,'1999-10-12',2114,102,'ACI','4100Z',6,15000),(112983,'1999-12-27',2103,105,'ACI','41004',6,702),(112987,'1999-12-31',2103,105,'ACI','4100Y',11,27500),(112989,'2000-01-03',2101,106,'FEA','114',6,1458),(112992,'1999-11-04',2118,108,'ACI','41002',10,760),(112993,'2000-01-04',2106,102,'REI','2A45C',24,1896),(112997,'2000-01-08',2124,107,'BIC','41003',1,652),(113003,'2000-01-25',2108,109,'IMM','779C',3,5625),(113007,'2000-01-08',2112,108,'IMM','773C',3,2825),(113012,'2000-01-11',2111,105,'ACI','41003',35,3745),(113013,'2000-01-14',2118,108,'BIC','41003',1,652),(113024,'2000-01-20',2114,108,'QSA','XK47',20,7100),(113027,'2000-02-22',2103,105,'ACI','41002',54,4104),(113034,'2000-01-29',2107,110,'REI','2A45C',8,632),(113042,'2000-02-02',2113,101,'REI','2A44R',5,22500),(113045,'2000-02-02',2112,108,'REI','2A44R',10,45000),(113048,'2000-02-10',2120,102,'IMM','779C',2,3750),(113049,'2000-02-10',2118,108,'QSA','XK47',2,776),(113051,'2000-02-10',2118,108,'QSA','XK47',4,1420),(113055,'2000-02-15',2108,101,'ACI','4100X',6,150),(113057,'2000-02-18',2111,103,'ACI','4100X',24,600),(113058,'2000-02-23',2108,109,'FEA','112',10,1480),(113062,'2000-02-24',2124,107,'FEA','114',10,2430),(113065,'2000-02-27',2106,102,'QSA','XK47',6,2130),(113069,'2000-03-02',2109,107,'IMM','775C',22,31350);
/*!40000 ALTER TABLE `pedidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos` (
  `id_fab` varchar(45) NOT NULL,
  `id_producto` varchar(45) NOT NULL,
  `descripción` varchar(45) DEFAULT NULL,
  `precio` int DEFAULT NULL,
  `existencias` int DEFAULT NULL,
  PRIMARY KEY (`id_fab`,`id_producto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES ('ACI','41001','Artículo Tipo 1',55,277),('ACI','41002','Artículo Tipo 2',76,167),('ACI','41003','Artículo Tipo 3',107,207),('ACI','41004','Artículo Tipo 4',117,139),('ACI','4100X','Ajustador',25,37),('ACI','4100Y','Extractor',2750,25),('ACI','4100Z','Montador',2500,28),('BIC','41003','Manivela',652,3),('BIC','41089','Retén',225,78),('BIC','41672','Plate',180,0),('FEA','112','Cubierta',148,115),('FEA','114','Bancada Motor',243,15),('IMM','773C','Riostra 1/2-Tm',975,28),('IMM','775C','Riostra 1-Tm',1425,5),('IMM','779C','Riostra 2-Tm',1875,9),('IMM','887H','Soporte Riostra',54,223),('IMM','887P','Perno Riostra',250,24),('IMM','887X','Retenedor Piostra',475,32),('QSA','XK47','Reductor',355,38),('QSA','XK48','Reductor',134,203),('QSA','XK48A','Reductor',117,37),('REI','2A44G','Pasador Bisagra',350,14),('REI','2A44L','Bisagra Izqda.',4500,12),('REI','2A44R','Bisagra Dcha.',4500,12),('REI','2A45C','V Stago Trinquete',79,210);
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `repventas`
--

DROP TABLE IF EXISTS `repventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `repventas` (
  `num_empl` int NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `edad` int DEFAULT NULL,
  `oficina_rep` int DEFAULT NULL,
  `título` varchar(45) DEFAULT NULL,
  `contrato` date DEFAULT NULL,
  `director` int DEFAULT NULL,
  `cuota` int DEFAULT NULL,
  `ventas` int DEFAULT NULL,
  PRIMARY KEY (`num_empl`),
  KEY `fk_repventas_oficinas_idx` (`oficina_rep`),
  CONSTRAINT `fk_repventas_oficinas` FOREIGN KEY (`oficina_rep`) REFERENCES `oficinas` (`oficina`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `repventas`
--

LOCK TABLES `repventas` WRITE;
/*!40000 ALTER TABLE `repventas` DISABLE KEYS */;
INSERT INTO `repventas` VALUES (101,'Daniel Gutiérrez',45,12,'Rep. Ventas','1996-10-20',104,27500,26628),(102,'Soledad Martínez',48,21,'Rep. Ventas','1996-12-10',108,30000,22776),(103,'Pedro Cruz',29,12,'Rep. Ventas','1997-03-01',104,25000,2700),(104,'Carlos Martínez',33,12,'Dir. Ventas','1997-05-19',106,17500,0),(105,'Belén Aguirre',37,13,'Dir. Ventas','1998-02-12',104,30000,39327),(106,'José Maldonado',52,11,'VP Ventas','1998-06-14',NULL,25000,32958),(107,'Natalia Martín',49,22,'Rep. Ventas','1998-11-14',108,27500,34432),(108,'Lorenzo Fernández',62,21,'Dir. Ventas','1999-10-12',106,30000,58533),(109,'María García',31,11,'Rep. Ventas','1999-10-12',106,27500,7105),(110,'Antonio Valle',41,NULL,'Rep. Ventas','2000-01-13',101,NULL,23123);
/*!40000 ALTER TABLE `repventas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'empresa_asir1'
--

--
-- Dumping routines for database 'empresa_asir1'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-16 15:07:21
