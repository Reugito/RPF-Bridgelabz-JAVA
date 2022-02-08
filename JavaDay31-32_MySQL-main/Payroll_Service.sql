CREATE DATABASE payroll_service;
USE payroll_service;
CREATE TABLE employee_payroll( Id INT NOT NULL AUTO_INCREMENT,
			Name VARCHAR(15) NOT NULL, 
            Gender CHAR(1),
            salary Decimal(10, 2) Null,
            START  Date NOT NULL,
            primary key (id));
            
SELECT * FROM employee_payroll;
ALTER TABLE payroll_service.employee_payroll CHANGE START start date;
INSERT INTO payroll_service.employee_payroll (name, salary, gender, start) VALUES ('Reugito', 10000.12, 'M', '2021-06-13');
INSERT INTO payroll_service.employee_payroll (name, salary, gender, start) VALUES ('Lucy', 10000.12, 'M', '2021-05-29');
INSERT INTO payroll_service.employee_payroll (name, salary, Gender, start) VALUES ('Deepak', 20000.12, 'M', '2021-01-06');
INSERT INTO payroll_service.employee_payroll (name, salary, Gender, start) VALUES ('Naveen', 30000.12, 'M', '2021-02-11');
SELECT `salary` from employee_payroll where `Name` = 'Reugito';
DESCRIBE payroll_service.employee_payroll;
SELECT * FROM payroll_service.employee_payroll;
SELECT * FROM payroll_service.employee_payroll  WHERE start BETWEEN CAST('2021-06-13' AS DATE) AND DATE (NOW());
SET SQL_SAFE_UPDATES=0;
UPDATE `payroll_service`.`employee_payroll` SET Gender = 'F'  WHERE name = 'Lucy';
UPDATE payroll_service.employee_payroll SET salary = 15000.00 WHERE Name = 'Lucy';
SELECT SUM(salary) FROM payroll_service.employee_payroll WHERE Gender = 'M' GROUP BY Gender;
SELECT AVG(salary) FROM payroll_service.employee_payroll WHERE Gender = 'F' GROUP BY Gender;
SELECT MIN(salary) FROM payroll_service.employee_payroll WHERE Gender = 'M' GROUP BY Gender;
SELECT MAX(salary) FROM payroll_service.employee_payroll WHERE Gender = 'M' GROUP BY Gender;
SELECT COUNT(id) AS numberOfEmployees FROM payroll_service.employee_payroll;
ALTER TABLE employee_payroll ADD Phone_Number VARCHAR(250) AFTER Name;
ALTER TABLE employee_payroll ADD Address VARCHAR(250) AFTER Phone_Number;
ALTER TABLE employee_payroll ADD Department VARCHAR(250) AFTER Address;
ALTER TABLE employee_payroll CHANGE Phone_Number Phone_Number VARCHAR(10);
ALTER TABLE `employee_payroll` change  Department  Department VARCHAR(250) NOT NULL ;
ALTER TABLE `employee_payroll`  change  Department  Department VARCHAR(250) NOT NULL DEFAULT 'T&D' ;
describe employee_payroll;
ALTER TABLE `employee_payroll`  change  salary  BasicPay decimal(10, 2) DEFAULT 00.00;
ALTER TABLE employee_payroll ADD Deductions decimal(10, 2) AFTER BasicPay;
ALTER TABLE employee_payroll ADD TaxablePay decimal(10, 2) DEFAULT 00.00 AFTER Deductions;
ALTER TABLE employee_payroll ADD incometax decimal(10, 2) DEFAULT 00.00 AFTER Taxablepay;
ALTER TABLE employee_payroll ADD NetPay decimal(10, 2) DEFAULT 00.00 AFTER Incometax;
ALTER TABLE employee_payroll ADD City VARCHAR(20) AFTER start;
ALTER TABLE employee_payroll ADD Country VARCHAR(20) AFTER City;
ALTER TABLE `employee_payroll` change  start  StartDate DATE NOT NULL ;
SELECT * FROM employee_payroll;
INSERT INTO `payroll_service`.`employee_payroll` (`Name`, `Phone_Number`, `Address`, `Department`, `Gender`, `BasicPay`, `NetPay`, `StartDate`, `City`, `Country`) 
	VALUES ('RAO', '3620044', 'INDAUR MAHARASHTRA', 'T&D', 'M', '40000', '40000', '2021-09-04', 'INDAPUR', 'INDIA');
INSERT INTO `payroll_service`.`employee_payroll` (`Name`, `Phone_Number`, `Address`, `Department`, `Gender`, `BasicPay`, `NetPay`, `StartDate`, `City`, `Country`) 
	VALUES ('AJAY', '12212', 'SOLAPUR MAHARASHTRA', 'R&D', 'M', '90000', '90000', '2021-11-23', 'SOLAPUR', 'INDIA');

CREATE TABLE Compnay ( compnayId INT PRIMARY KEY NOT NULL, compnayName VARCHAR(20) NOT NULL);
INSERT INTO Compnay VALUES( '1001', 'BridgeLabz');
INSERT INTO Compnay VALUES( '1002', 'TCS');
INSERT INTO Compnay VALUES( '1003', 'DELL');
SELECT * FROM Compnay;

CREATE TABLE Employee ( empId INT PRIMARY KEY NOT NULL,  name VARCHAR(30) NOT NULL, SEX CHAR(1));
ALTER TABLE Employee ADD COLUMN compnayId INT ;
ALTER TABLE Employee ADD FOREIGN KEY(compnayId) REFERENCES Compnay(compnayId);
INSERT INTO Employee VALUES( '2001', 'RAO', 'M','1001');
INSERT INTO Employee VALUES( '2002', 'ANZER', 'M','1002');
INSERT INTO Employee VALUES( '2003', 'NAVEEN', 'M','1003');
INSERT INTO Employee VALUES( '2004', 'DEEPAK', 'M','1003');
SELECT * FROM Employee;

CREATE TABLE Payroll ( payId INT PRIMARY KEY NOT NULL, salary DECIMAL(10,2) DEFAULT '00.00', incomtax DECIMAL(10,2) DEFAULT '00.00', netPay DECIMAL(10,2) DEFAULT '00.00');
ALTER TABLE Payroll ADD FOREIGN KEY (payId) REFERENCES Employee(empId);
INSERT INTO Payroll VALUES ( '2001', '10000.00', '100.00', '9900.00');
INSERT INTO Payroll VALUES ( '2002', '20000.00', '1000.00', '20000.00'-'1000.00');
INSERT INTO Payroll VALUES ( '2003', '40000.00', '400.00', '40000.00'- '400.00');
INSERT INTO Payroll VALUES ( '2004', '90000.00', '4000.00', '90000.00'- '4000.00');
SELECT * FROM Payroll;

CREATE TABLE Department ( DeptId INT PRIMARY KEY NOT NULL, DeptName VARCHAR(20) DEFAULT 'SERVICE');
ALTER TABLE Department ADD COLUMN compnayId INT;
ALTER TABLE Department ADD FOREIGN KEY (compnayId) REFERENCES Compnay(compnayId);
ALTER TABLE Department ADD COLUMN empId INT;
ALTER TABLE Department ADD FOREIGN KEY (empId) REFERENCES Employee(empId);
DESCRIBE Department;
INSERT INTO Department VALUES ('3001', 'FULLSTACK', '1003', '2001');
INSERT INTO Department VALUES ('3002', 'FRONTEND', '1003', '2001');
INSERT INTO Department VALUES ('3003', 'backend-development', '1002', '2002');
INSERT INTO Department VALUES ('3004', 'WEB-DEVELOPER', '1001', '2003');
INSERT INTO Department VALUES ('3005', 'AI-DEVELOPER', '1001', '2004');

SELECT * FROM Compnay INNER JOIN Employee  INNER JOIN Department INNER JOIN Payroll ON Compnay.compnayId = Employee.compnayId
		AND  Employee.empId = Department.empId AND Payroll.payId = Employee.empId;

SELECT Compnay.compnayId, Compnay.compnayName, Employee.empId, Employee.name,Department.DeptId, Department.DeptName, Payroll.payId, Payroll.netPay 
		FROM Compnay INNER JOIN Employee  INNER JOIN Department INNER JOIN Payroll ON Compnay.compnayId = Employee.compnayId
		AND  Employee.empId = Department.empId AND Payroll.payId = Employee.empId;
        
SELECT * FROM Compnay  LEFT JOIN  Employee ON Compnay.compnayId = Employee.compnayId;

SELECT * FROM Compnay  RIGHT JOIN  Employee ON Compnay.compnayId = Employee.compnayId;
