-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: proje
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `giris`
--

DROP TABLE IF EXISTS `giris`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `giris` (
  `kullaniciadi` varchar(20) COLLATE utf8_turkish_ci NOT NULL,
  `sifre` int(11) NOT NULL,
  PRIMARY KEY (`kullaniciadi`,`sifre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `giris`
--

LOCK TABLES `giris` WRITE;
/*!40000 ALTER TABLE `giris` DISABLE KEYS */;
INSERT INTO `giris` VALUES ('aysecan',12345),('fatmakol',54321);
/*!40000 ALTER TABLE `giris` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ogrenciler`
--

DROP TABLE IF EXISTS `ogrenciler`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ogrenciler` (
  `ogrencinumarasi` int(11) NOT NULL,
  `ogrenciadsoyad` varchar(45) COLLATE utf8_turkish_ci DEFAULT NULL,
  `ogrencisube` varchar(1) COLLATE utf8_turkish_ci NOT NULL,
  `ogrencinot` int(11) DEFAULT NULL,
  `ogrencidevamsızlık` int(11) DEFAULT NULL,
  PRIMARY KEY (`ogrencinumarasi`,`ogrencisube`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ogrenciler`
--

LOCK TABLES `ogrenciler` WRITE;
/*!40000 ALTER TABLE `ogrenciler` DISABLE KEYS */;
INSERT INTO `ogrenciler` VALUES (1,'ali keser','a',NULL,NULL),(2,'ahmet yanık','a',NULL,NULL),(3,'furkan koç','a',NULL,NULL),(4,'murat kalı','a',NULL,NULL),(5,'ela haksız','a',NULL,NULL);
/*!40000 ALTER TABLE `ogrenciler` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ogretmenler`
--

DROP TABLE IF EXISTS `ogretmenler`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ogretmenler` (
  `ogretmenad` varchar(45) COLLATE utf8_turkish_ci NOT NULL,
  `ogretmensoyad` varchar(45) COLLATE utf8_turkish_ci DEFAULT NULL,
  `ogretmenbrans` varchar(15) COLLATE utf8_turkish_ci DEFAULT NULL,
  `ogretmensube` varchar(1) COLLATE utf8_turkish_ci NOT NULL,
  PRIMARY KEY (`ogretmenad`,`ogretmensube`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ogretmenler`
--

LOCK TABLES `ogretmenler` WRITE;
/*!40000 ALTER TABLE `ogretmenler` DISABLE KEYS */;
INSERT INTO `ogretmenler` VALUES ('ayşe','can','türkçe','a'),('fatma','kul','ingilizce','a');
/*!40000 ALTER TABLE `ogretmenler` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-28  9:26:37
