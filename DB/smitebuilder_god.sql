CREATE DATABASE  IF NOT EXISTS `smitebuilder` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `smitebuilder`;
-- MySQL dump 10.13  Distrib 5.5.9, for Win32 (x86)
--
-- Host: localhost    Database: smitebuilder
-- ------------------------------------------------------
-- Server version	5.5.15

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
-- Table structure for table `god`
--

DROP TABLE IF EXISTS `god`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `god` (
  `GOD_ID` int(11) NOT NULL,
  `NAME` varchar(45) NOT NULL,
  `SUB_DESC` varchar(45) DEFAULT NULL,
  `ORIGIN` varchar(45) DEFAULT NULL,
  `TAGS` varchar(45) DEFAULT NULL,
  `HEALTH_BASE` int(11) NOT NULL,
  `HEALTH_PER` int(11) NOT NULL,
  `MANA_BASE` int(11) NOT NULL,
  `MANA_PER` int(11) NOT NULL,
  `SPEED_BASE` int(11) NOT NULL,
  `SPEED_PER` int(11) NOT NULL,
  `RANGE_BASE` int(11) NOT NULL,
  `RANGE_PER` int(11) NOT NULL,
  `ATTACK_SEC_BASE` decimal(10,2) NOT NULL,
  `ATTACK_SEC_PER` decimal(10,2) NOT NULL,
  `POWER_MAGICAL_BASE` decimal(10,2) NOT NULL,
  `PROT_MAGICAL_BASE` decimal(10,2) NOT NULL,
  `POWER_MAGICAL_PER` decimal(10,2) NOT NULL,
  `POWER_PHYSICAL_BASE` decimal(10,2) NOT NULL,
  `POWER_PHYSICAL_PER` decimal(10,2) NOT NULL,
  `PROT_MAGICAL_PER` decimal(10,2) NOT NULL,
  `PROT_PHYSICAL_BASE` decimal(10,2) NOT NULL,
  `PROT_PHYSICAL_PER` decimal(10,2) NOT NULL,
  `HP5_BASE` decimal(10,2) NOT NULL,
  `HP5_PER` decimal(10,2) NOT NULL,
  `MP5_BASE` decimal(10,2) NOT NULL,
  `MP5_PER` decimal(10,2) NOT NULL,
  `PORTRAIT_NAME` varchar(45) DEFAULT NULL,
  `PASSIVE_PORTRAIT` varchar(45) DEFAULT NULL,
  `PASSIVE NAME` varchar(45) DEFAULT NULL,
  `PASSIVE_DESC` varchar(512) DEFAULT NULL,
  `PASSIVE_STAT` varchar(45) DEFAULT NULL,
  `PASSIVE_MOD` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`GOD_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `god`
--

LOCK TABLES `god` WRITE;
/*!40000 ALTER TABLE `god` DISABLE KEYS */;
INSERT INTO `god` VALUES (1,'Guan Yu','The Saint Of War','Chinese','Tank',470,84,220,32,365,0,12,0,0.93,0.02,0.00,30.00,0.00,37.00,2.00,1.00,18.00,3.00,6.00,0.70,5.00,0.45,'guanyu.png','',NULL,NULL,NULL,NULL),(2,'Sun Wukong','Monkey King','Chinese','Physical Melee',460,75,220,38,390,0,12,0,1.00,0.02,0.00,30.00,0.00,38.00,2.00,1.00,13.00,3.00,10.00,0.68,4.00,0.27,'sunwukong.png',NULL,NULL,NULL,NULL,NULL),(3,'Hebo','God of the Yellow River','Chinese','Mage',340,64,298,56,350,0,55,0,0.86,0.01,0.00,30.00,0.00,35.00,2.00,0.00,9.00,3.00,6.00,0.45,5.00,0.40,'hebo.png',NULL,NULL,NULL,NULL,NULL),(4,'Ao Kuang','Dragon King of the Eastern Seas','Chinese','Mage',365,68,265,45,350,0,55,0,0.87,0.01,0.00,30.00,0.00,34.00,2.00,0.00,13.00,3.00,7.00,0.46,5.00,0.45,'aokuang.png',NULL,NULL,NULL,NULL,NULL),(5,'Kali','Goddess of Destruction','Hindu','Physical Melee',470,74,205,34,375,0,12,0,1.00,0.02,0.00,30.00,0.00,37.00,2.00,1.00,15.00,3.00,9.00,0.68,4.00,0.21,'kali.png',NULL,NULL,NULL,NULL,NULL),(6,'Arachne','The Weaver','Greek','Physical Melee',445,79,210,41,375,0,12,0,1.00,0.02,0.00,30.00,0.00,38.00,2.00,0.00,13.00,3.00,9.00,0.67,5.00,0.46,'arachne.png',NULL,NULL,NULL,NULL,NULL),(7,'Agni','God of Fire','Hindu','Mage',360,71,255,45,350,0,55,0,0.86,0.01,0.00,30.00,0.00,32.00,2.00,0.00,11.00,2.60,7.00,0.47,5.00,0.37,'agni.png','agni-p.png',NULL,NULL,NULL,NULL),(8,'Anhur','Slayer of Enemies','Egyption','Physical Ranged',460,78,220,35,365,0,55,0,0.85,0.01,0.00,30.00,0.00,40.00,3.00,1.00,11.00,3.00,8.00,0.69,5.00,0.32,'anhur.png',NULL,NULL,NULL,NULL,NULL),(9,'Anubis','God of the Dead','Egyption','Mage',350,66,280,58,350,0,55,0,0.86,0.01,0.00,30.00,0.00,35.00,2.00,0.00,10.00,3.00,7.00,0.45,5.00,0.36,'anubis.png',NULL,NULL,NULL,NULL,NULL),(10,'Ares','The God of War','Greek','Tank',485,90,200,37,360,0,12,0,0.95,0.01,0.00,30.00,0.00,38.00,2.00,1.00,17.00,3.00,8.00,0.67,5.00,0.42,'ares.png',NULL,NULL,NULL,NULL,NULL),(11,'Artemis','Goddess of the Hunt','Greek','Physical Ranged',450,72,205,34,365,0,55,0,0.90,0.01,0.00,30.00,0.00,35.00,2.00,1.00,12.00,3.00,8.00,0.68,4.00,0.25,'artemis.png',NULL,NULL,NULL,NULL,NULL),(12,'Bacchus','The God of Wine','Roman','Tank',495,86,200,40,365,0,12,0,1.00,0.02,0.00,30.00,0.00,37.00,2.00,1.00,19.00,3.00,8.00,0.80,5.00,0.40,'bacchus.png',NULL,NULL,NULL,NULL,NULL),(13,'Bakasura','The Great Devourer','Hindu','Physical Melee',455,78,200,39,370,0,12,0,1.00,0.02,0.00,30.00,0.00,36.00,2.00,1.00,13.00,3.00,9.00,0.68,5.00,0.46,'bakasura.png',NULL,NULL,NULL,NULL,NULL),(14,'Bastet','Goddess of Cats','Egyptian','Physical Melee',415,80,215,39,375,0,12,0,1.00,0.02,0.00,30.00,0.00,37.00,2.00,1.00,12.00,3.00,9.00,0.72,4.00,0.18,'bastet.png',NULL,NULL,NULL,NULL,NULL),(15,'Cupid','The God of Love','Roman','Physical Ranged',445,72,230,39,365,0,55,0,0.92,0.01,0.00,30.00,0.00,35.00,2.00,1.00,11.00,3.00,8.00,0.67,5.00,0.35,'cupid.png',NULL,NULL,NULL,NULL,NULL),(16,'Freya','The Queen of the Valkyries','Norse','Physical Ranged',405,77,220,37,370,0,12,0,0.95,0.02,0.00,30.00,0.00,35.00,2.00,1.00,13.00,3.00,7.00,0.52,5.00,0.39,'freya.png',NULL,NULL,NULL,NULL,NULL),(17,'Hades','King of the Underworld','Greek','Tank',490,80,265,53,355,0,55,0,0.88,0.01,0.00,30.00,0.00,32.00,2.00,1.00,18.00,3.00,5.00,0.54,5.00,0.36,'hades.png',NULL,NULL,NULL,NULL,NULL),(18,'Hel','Goddess of the Underworld','Norse','Support',345,67,300,57,350,0,55,0,0.86,0.01,0.00,30.00,0.00,33.00,2.00,0.00,9.00,3.00,5.00,0.43,5.00,0.45,'hel.png',NULL,NULL,NULL,NULL,NULL),(19,'Loki','The Trickster God','Norse','Physical Melee',395,75,210,35,375,0,12,0,1.00,0.02,0.00,30.00,0.00,38.00,2.00,1.00,11.00,3.00,8.00,0.70,4.00,0.35,'loki.png',NULL,NULL,NULL,NULL,NULL),(20,'Odin','The Allfather','Norse','Tank',475,86,195,32,365,0,12,0,0.95,0.01,0.00,30.00,0.00,38.00,2.00,1.00,17.00,3.00,9.00,0.63,4.00,0.40,'odin.png',NULL,NULL,NULL,NULL,NULL),(21,'Ra','The Sun God','Egyptian','Support',385,68,255,48,350,0,55,0,0.88,0.01,0.00,30.00,0.00,33.00,2.00,0.00,10.00,3.00,7.00,0.48,5.00,0.44,'ra.png',NULL,NULL,NULL,NULL,NULL),(22,'Sobek','God of the Nile','Egyptian','Tank',490,81,210,35,365,0,12,0,0.96,0.02,0.00,30.00,0.00,38.00,2.00,1.00,19.00,3.00,6.00,0.75,5.00,0.43,'sobek.png',NULL,NULL,NULL,NULL,NULL),(23,'Thor','God of Thunder','Norse','Physical Melee',475,76,240,38,370,0,12,0,1.01,0.02,0.00,30.00,0.00,39.00,2.00,1.00,14.00,3.00,9.00,0.69,4.00,0.29,'thor.png',NULL,NULL,NULL,NULL,NULL),(24,'Vamana','The Avatar of Vishnu','Hindu','Tank',480,85,200,39,365,0,12,0,0.88,0.01,0.00,30.00,0.00,37.00,2.00,1.00,18.00,3.00,8.00,0.50,5.00,0.41,'vamana.png',NULL,NULL,NULL,NULL,NULL),(25,'Xbalanque','The Hidden Jaguar Sun','Mayan','Physical Ranged',455,75,220,37,365,0,55,0,0.89,0.01,0.00,30.00,0.00,37.00,3.00,1.00,12.00,3.00,8.00,0.68,4.00,0.40,'xbalanque.png',NULL,NULL,NULL,NULL,NULL),(26,'Ymir','Father of the Frost Giants','Norse','Tank',510,104,185,30,360,0,12,0,0.86,0.01,0.00,30.00,0.00,40.00,3.00,1.00,21.00,3.00,8.00,0.90,5.00,0.40,'ymir.png',NULL,NULL,NULL,NULL,NULL),(27,'Zeus','God of the Sky','Greek','Mage',380,71,245,44,355,0,55,0,0.88,0.01,0.00,30.00,0.00,31.00,2.00,0.00,8.00,3.00,6.00,0.45,5.00,0.45,'zeus.png',NULL,NULL,NULL,NULL,NULL),(28,'Hercules','The Champion of Rome','Roman','Physical Melee',480,86,205,32,370,0,12,0,1.01,0.01,0.00,30.00,0.00,39.00,2.00,1.00,18.00,3.00,7.00,0.63,4.00,0.40,'hercules.png',NULL,NULL,NULL,NULL,NULL),(29,'Vulcan','Smith of the Gods','Roman','Tank',435,78,205,38,360,0,12,0,0.91,0.02,0.00,30.00,0.00,36.00,2.00,1.00,15.00,3.00,7.00,0.78,5.00,0.41,'vulcan.png',NULL,NULL,NULL,NULL,NULL),(30,'Neith','Weaver of Fate','Egyptian','Physical Ranged',435,75,230,39,365,0,55,0,0.92,0.01,0.00,30.00,0.00,35.00,2.00,1.00,12.00,3.00,6.00,0.54,4.00,0.35,'neith.png',NULL,NULL,NULL,NULL,NULL),(31,'Poseidon','God of the Oceans','Greek','Mage',380,67,245,40,360,0,55,0,0.88,0.01,0.00,30.00,0.00,32.00,2.00,1.00,8.00,2.00,6.00,0.50,5.00,0.40,'poseidon.png',NULL,NULL,NULL,NULL,NULL),(32,'Aphrodite','Goddess of Beauty','Greek','Mage, Support',355,68,240,43,355,0,55,0,0.87,0.01,0.00,30.00,0.00,32.00,2.00,1.00,9.00,3.00,6.00,0.45,5.00,0.41,'aphrodite.png',NULL,NULL,NULL,NULL,NULL),(33,'Apollo','God of Music','Greek','Ranged, Carry',450,77,225,40,365,0,55,0,1.00,0.01,0.00,30.00,0.00,36.00,3.00,1.00,12.00,2.70,8.00,0.69,5.00,0.40,'apollo.png',NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `god` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-03-30 10:58:43
