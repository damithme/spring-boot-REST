# spring-boot-REST tutorial by MyDevGeek.com

##Create a User table
```sql
DROP TABLE IF EXISTS `user`;
 
CREATE TABLE `user` (
`id` int(11) unsigned NOT NULL AUTO_INCREMENT,
`first_name` varchar(11) DEFAULT NULL,
`last_name` varchar(11) DEFAULT NULL,
`username` varchar(11) DEFAULT NULL,
`created` datetime DEFAULT NULL,
`updated` datetime DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
 
LOCK TABLES `user` WRITE;
 
INSERT INTO `user` (`id`, `first_name`, `last_name`, `username`, `created`, `updated`)
VALUES
(1,'DAMITH','GANEGODA','test','2017-02-22 00:00:00','2017-02-22 00:00:00');
```

##Tutorial

Spring Boot REST web service – Part 1 – Spring Data and MySQL - http://mydevgeek.com/spring-boot-rest-web-service-part-1-spring-data-mysql/
