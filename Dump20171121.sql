-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: db_tgs_java
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.25-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `t_barang`
--

DROP TABLE IF EXISTS `t_barang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_barang` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `barang_kode` varchar(45) DEFAULT NULL,
  `barang_nama` varchar(45) DEFAULT NULL,
  `no_rak` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_barang`
--

LOCK TABLES `t_barang` WRITE;
/*!40000 ALTER TABLE `t_barang` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_barang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_barang_keluar`
--

DROP TABLE IF EXISTS `t_barang_keluar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_barang_keluar` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `bk_dok` varchar(7) DEFAULT NULL,
  `bk_tgl` date DEFAULT NULL,
  `bk_tujuan` varchar(45) DEFAULT NULL,
  `bk_ref_no` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_barang_keluar`
--

LOCK TABLES `t_barang_keluar` WRITE;
/*!40000 ALTER TABLE `t_barang_keluar` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_barang_keluar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_barang_keluar_det`
--

DROP TABLE IF EXISTS `t_barang_keluar_det`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_barang_keluar_det` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `bk_id` varchar(45) DEFAULT NULL,
  `barang_kode` varchar(45) DEFAULT NULL,
  `bk_qty` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_barang_keluar_det`
--

LOCK TABLES `t_barang_keluar_det` WRITE;
/*!40000 ALTER TABLE `t_barang_keluar_det` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_barang_keluar_det` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_inventory`
--

DROP TABLE IF EXISTS `t_inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_inventory` (
  `inv_tgl` date DEFAULT NULL,
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `inv_ref_no` varchar(45) DEFAULT NULL,
  `inv_ket` varchar(45) DEFAULT NULL,
  `barang_kode` varchar(45) DEFAULT NULL,
  `inv_qty` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_inventory`
--

LOCK TABLES `t_inventory` WRITE;
/*!40000 ALTER TABLE `t_inventory` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_supplier`
--

DROP TABLE IF EXISTS `t_supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_supplier` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `supplier_kode` varchar(5) DEFAULT NULL,
  `supplier_nama` varchar(35) DEFAULT NULL,
  `supplier_alamat` text,
  `supplier_telp` varchar(25) DEFAULT NULL,
  `supplier_kontak` varchar(35) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_supplier`
--

LOCK TABLES `t_supplier` WRITE;
/*!40000 ALTER TABLE `t_supplier` DISABLE KEYS */;
INSERT INTO `t_supplier` VALUES (1,'ATM','PT. Asia Traktor Mandiri','Jl. Parang Rogong Jaya Blok F No. 11-14\nJakarta Timur, 14127','021-2239921','Bpk. Jaya Purnomo'),(2,'SDP','PT. Sedap Selalu','Bekasi','021-3929819','Bpk. Josua Marjono');
/*!40000 ALTER TABLE `t_supplier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_terima_barang`
--

DROP TABLE IF EXISTS `t_terima_barang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_terima_barang` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `tb_dok` varchar(7) DEFAULT NULL,
  `tb_tgl` date DEFAULT NULL,
  `supplier_kode` varchar(45) DEFAULT NULL,
  `tb_penerima` varchar(45) DEFAULT NULL,
  `tb_ref_no` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_terima_barang`
--

LOCK TABLES `t_terima_barang` WRITE;
/*!40000 ALTER TABLE `t_terima_barang` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_terima_barang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_terima_barang_det`
--

DROP TABLE IF EXISTS `t_terima_barang_det`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_terima_barang_det` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `tb_id` varchar(45) DEFAULT NULL,
  `barang_kode` varchar(45) DEFAULT NULL,
  `tb_qty` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_terima_barang_det`
--

LOCK TABLES `t_terima_barang_det` WRITE;
/*!40000 ALTER TABLE `t_terima_barang_det` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_terima_barang_det` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_user`
--

DROP TABLE IF EXISTS `t_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_user` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_name` varchar(10) NOT NULL,
  `pass` varchar(100) NOT NULL,
  `user_type` varchar(20) NOT NULL,
  PRIMARY KEY (`ID`,`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_user`
--

LOCK TABLES `t_user` WRITE;
/*!40000 ALTER TABLE `t_user` DISABLE KEYS */;
INSERT INTO `t_user` VALUES (1,'ADMIN','ADMIN','ADMINISTRATOR');
/*!40000 ALTER TABLE `t_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-21  7:59:21
