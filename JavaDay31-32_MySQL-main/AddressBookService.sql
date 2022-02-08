CREATE DATABASE addressBookService;
SHOW DATABASES;
USE addressBookService;
CREATE TABLE addressBook (firstName VARCHAR(29) NOT NULL, lastName VARCHAR(20) NOT NULL,       /* TO CREATE TABLE */
		address VARCHAR(60) NOT NULL, city VARCHAR(10) NOT NULL, state VARCHAR(20) NOT NULL, 
        zip VARCHAR(6) , phoneNumber VARCHAR(10) ) ;
        
INSERT INTO addressbook VALUES ("RAO", "DHOTRE", "INDAPUR MAHARASHTRA", "INDAPUR", "MAHARASHTRA", 413511, "9766652331");
describe addressBook;
ALTER TABLE addressBook DROP COLUMN zip;
ALTER TABLE addressBook ADD COLUMN zip VARCHAR(6) AFTER state;
INSERT INTO addressbook VALUES ("RAO", "DHOTRE", "INDAPUR MAHARASHTRA", "INDAPUR", "MAHARASHTRA", "413315", "9766652331");      /* TO ADD VALUES IN TABLE */
INSERT INTO addressbook VALUES ("Naveen","Patekar","Pune Maharashtra","Pune","MAharashtra",411030,"9876543210");
DELETE FROM addressbook WHERE firstName = "RAO";
INSERT INTO addressbook  VALUES ("RAO", "DHOTRE", "INDAPUR MAHARASHTRA", "INDAPUR", "MAHARASHTRA", "413315", "9766652331") ON  DUPLICATE KEY UPDATE  firstName="RAO";
INSERT INTO addressbook VALUES ("SHANKAR", "PATIL", "SOLAPUR MAHARASHTRA", "SOLAPUR", "MAHARASHTRA", "413315", "12313");      /* TO ADD VALUES IN TABLE */
UPDATE addressbook SET firstName = "Kishor", lastName = "Bodakhe", address = "Ahmednagar Maharashtra", city = "Ahmednagar", zip = 454501 WHERE firstName = "Naveen" ;
INSERT INTO addressbook VALUES ("Naveen","Patekar","Pune Maharashtra","Pune","MAharashtra",411030,"9876543210");
DELETE FROM addressbook WHERE firstName = "Kishor";
INSERT INTO addressbook VALUES ("Anil","Bodakhe","Ahmednagar Maharashtra","Ahmednagar","MAharashtra",422030,"9874563210");
SELECT * FROM addressbook WHERE city = "Pune";
SELECT firstName, lastName FROM addressbook WHERE city = "Pune";
SELECT count(city or state) FROM addressbook;
SELECT city, firstName FROM addressbook ORDER BY (firstName);
ALTER TABLE addressbook ADD COLUMN relation VARCHAR(6) AFTER zip;  
ALTER TABLE addressbook ADD COLUMN name VARCHAR(6) AFTER zip;  
UPDATE addressbook SET name = 'Naveen', relation = 'friend' WHERE firstName = 'Anil';
UPDATE addressbook SET name = 'Naveen', relation = 'family' WHERE firstName = 'Rao';
ALTER TABLE addressbook CHANGE name name VARCHAR(20); 
ALTER TABLE addressbook CHANGE relation relation VARCHAR(20);
UPDATE addressbook SET name = 'Deepak', relation = 'Profession,' WHERE firstName = 'Naveen';
UPDATE addressbook SET name = 'Deepak', relation = 'Profession' WHERE firstName = 'Naveen';
SELECT count(relation) FROM addressbook;
SELECT * FROM addressbook;

CREATE TABLE PersonName( Id INT AUTO_INCREMENT PRIMARY KEY, firstName VARCHAR(10), lastName VARCHAR(10),
			addressId INT);
            
INSERT INTO PersonName VALUES ('1001', 'RAO', 'DHOTRE', '2001');
INSERT INTO PersonName VALUES ('','AJAY', 'DHOTRE', '2001');
INSERT INTO PersonName VALUES ('','NAVEEN', 'PATEKAR', '2003');
INSERT INTO PersonName VALUES ('','ANZER', 'SHAIKH', '2004');
SELECT * FROM PersonName;

CREATE TABLE Address ( Id INT PRIMARY KEY AUTO_INCREMENT , city VARCHAR(10), state VARCHAR(10), zip varchar(6), phoneNo VARCHAR(10), personId INT);
INSERT INTO Address VALUES ('2001', 'SOLAPUR', 'MAHARASHTRA', '413315', '122231', '1001');
INSERT INTO Address VALUES ('', 'INDAPUR', 'MAHARASHTRA', '410615', '9766531', '1001');
INSERT INTO Address VALUES ('', 'PUNE', 'MAHARASHTRA', '413333', '867854', '1003');
INSERT INTO Address VALUES ('', 'HYDERABAAD', 'TELANGANA', '432131', '9874651', '1004');

SELECT * FROM Address;
ALTER TABLE Address ADD FOREIGN KEY (personId) REFERENCES PersonName(Id);
ALTER TABLE PersonName ADD FOREIGN KEY (addressId) REFERENCES Address(Id);

CREATE TABLE Connections(personId INT , relativeName VARCHAR(20), relation VARCHAR(20), FOREIGN KEY (personId) REFERENCES PersonName(Id));
INSERT INTO Connections VALUES ( '1001', 'NAVEEN', 'FRIEND');
INSERT INTO Connections VALUES ( '1002', 'RAO', 'Family');
INSERT INTO Connections VALUES ( '1003', 'RAO', 'FRIEND');
SELECT * FROM Connections;

SELECT * FROM (PersonName INNER JOIN  Address ON PersonName.Id = Address.personId) 
		INNER JOIN Connections ON Connections.personId = PersonName.Id;
SELECT * FROM PersonName RIGHT JOIN  Address ON PersonName.Id = Address.personId;
SELECT * FROM PersonName LEFT JOIN  Address ON PersonName.Id = Address.personId;
