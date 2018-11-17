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
  `panno` int(20) default NULL,
  PRIMARY KEY  (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `details` */

insert  into `details`(`name`,`path`,`code`,`mean`,`max`,`accno`,`pin`,`seckey`,`mobileno`,`Email`,`sex`,`address`,`city`,`panno`) values ('Andy1','D:\\2012 Projects\\7.Real Time Surveillance Security\\2.23\\New iris web\\BankLoker\\images\\Andy 01.jpg','0.07013643909257551','578633.96875','8250119.0','1524134564','1236','7317047651e11c2f02b8b4fabb98107','454666565','a','Male','a','a',45662),('kani','E:\\Project-2012\\7.Real Time Surveillance Security\\2.23\\IRIS ALLNEW UPDATED (26-02-2013)\\IRIS ALLNEW UPDATED (26-02-2013)\\images\\Andy 02.jpg','0.09419403551611025','780164.265625','8282523.0','158423626352','1587','f32c5a606203642e80c195d6a92be471',NULL,NULL,NULL,NULL,NULL,NULL),('catherine','D:\\2012 Projects\\7.Real Time Surveillance Security\\2.23\\New iris web\\BankLoker\\images\\Catherine 01.jpg','0.1124481531573905','1048348.734375','9322952.0','123654789','1234','df3c1b8f2f23b42dfe2c9f4307d0c599','7896541236','mahi@gmail.com','Male','t,nagar','chennai',1234);

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
