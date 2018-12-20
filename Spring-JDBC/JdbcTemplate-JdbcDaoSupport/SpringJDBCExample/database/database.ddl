DROP TABLE IF EXISTS `arcagile`.`customer`;
CREATE TABLE  `arcagile`.`customer` (
  `CUST_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `NAME` varchar(100) NOT NULL,
  `AGE` smallint(5) unsigned NOT NULL,
  PRIMARY KEY (`CUST_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


INSERT INTO `customer` (`CUST_ID`,`NAME`,`AGE`) VALUES 
 (1,'Syed',28),
 (2,'Sandhya',28),
 (3,'Tanmoy&Aman',28);