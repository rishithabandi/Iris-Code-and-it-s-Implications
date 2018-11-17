/*
SQLyog Community v8.4 RC2
MySQL - 5.0.15-nt : Database - iris
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`iris` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `iris`;

/*Table structure for table `acc_details` */

DROP TABLE IF EXISTS `acc_details`;

CREATE TABLE `acc_details` (
  `Acc_Name` varchar(15) default NULL,
  `Acc_Num` int(15) default NULL,
  `Balance` decimal(20,5) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `acc_details` */

insert  into `acc_details`(`Acc_Name`,`Acc_Num`,`Balance`) values ('Andy1',1524134564,'0.00000');

/*Table structure for table `details` */

DROP TABLE IF EXISTS `details`;

CREATE TABLE `details` (
  `name` varchar(25) default NULL,
  `path` varchar(150) default NULL,
  `code` varchar(150) NOT NULL,
  `mean` varchar(200) default NULL,
  `max` varchar(200) default NULL,
  `accno` varchar(15) default NULL,
  `pin` varchar(20) default NULL,
  `seckey` varchar(50) default NULL,
  `mobileno` varchar(10) default NULL,
  `Email` varchar(20) default NULL,
  `sex` varchar(10) default NULL,
  `address` varchar(30) default NULL,
  `city` varchar(10) default NULL,
  `panno` varchar(20) default NULL,
  PRIMARY KEY  (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `details` */

insert  into `details`(`name`,`path`,`code`,`mean`,`max`,`accno`,`pin`,`seckey`,`mobileno`,`Email`,`sex`,`address`,`city`,`panno`) values ('azee','D:\\D\\2014 java\\Real Time surveillance Security\\Iris_2014\\Code\\BankLoker\\images\\ONE.jpg','0.19100310233693096','2109040.59375','1.1041918E7','1234567890','1234','a42285aca4dc9f57bd1e870d8fdf6526','9788777777','azees@gmail.com','Male','kk nagar1','chennai','1234');

/*Table structure for table `transaction` */

DROP TABLE IF EXISTS `transaction`;

CREATE TABLE `transaction` (
  `Acc_Num` int(15) default NULL,
  `Transaction_type` varchar(10) default NULL,
  `Amount` int(10) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `transaction` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
