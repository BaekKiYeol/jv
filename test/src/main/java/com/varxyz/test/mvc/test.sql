CREATE TABLE Customer(
	userId		VARCHAR(20) 	PRIMARY KEY,
	email		VARCHAR(20) 	NOT NULL,
	passwd		VARCHAR(20) 	NOT NULL,
	name		VARCHAR(20) 	NOT NULL,
	ssn			VARCHAR(14) 	NOT NULL, -- 123456-1234567
	phone		VARCHAR(13)		NOT NULL, -- 010-1234-1234
	regDate		TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
);

SELECT * FROM Customer;

SELECT count(*) FROM Customer;

DROP TABLE Customer;
DELETE FROM Customer WHERE userId = "test3";

CREATE TABLE Account(
	aid				BIGINT		PRIMARY KEY AUTO_INCREMENT,
	userId			VARCHAR(20)	NOT NULL,
	accountNum		CHAR(15)	NOT NULL,  -- 000-00-0000
	accType			VARCHAR(10)	NOT NULL 	DEFAULT 'S',
	balance			DOUBLE		NOT NULL 	DEFAULT 0,
	interestRate	DOUBLE		NOT NULL 	DEFAULT 0.0,
	overAmount		DOUBLE		NOT NULL 	DEFAULT 0.0,
	regDate			TIMESTAMP	NOT NULL	DEFAULT CURRENT_TIMESTAMP,
	
	CONSTRAINT Account_userId_FK FOREIGN KEY(userId) REFERENCES Customer(userId)
);

SELECT * FROM Account;

DROP TABLE Account;

DELETE FROM Account WHERE userId = "test2";

SELECT * FROM Account a INNER JOIN Customer c ON a.customerId = c.cid WHERE c.ssn = '880808-1234567';

SELECT aid, customerId, accountNum, accType, balance, interestRate, overAmount, a.regDate, ssn FROM Account a INNER JOIN Customer c ON a.customerId = c.cid WHERE ssn = '990909-1234567';