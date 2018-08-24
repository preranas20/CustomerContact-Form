CREATE database CustomerDB;
CREATE table CustomerDB.Customer(
   id int NOT NULL auto_increment,
   firstname varchar(50) NOT NULL,
   lastname varchar(100) NOT NULL,
   phone varchar(10) NOT NULL,
   address varchar(500),
   email varchar(50) NOT NULL,
   message varchar(900),
   PRIMARY KEY (id)
)ENGINE=InnoDB auto_increment=1 DEFAULT CHARSET=utf8;
