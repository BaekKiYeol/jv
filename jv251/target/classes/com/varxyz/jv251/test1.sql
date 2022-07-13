CREATE TABLE customer1 (
	cid			BIGINT			PRIMARY KEY AUTO_INCREMENT,
	name	    VARCHAR(10)		NOT NULL,
	ssn		    VARCHAR(14)		NOT NULL,
	regDate		TIMESTAMP		NOT NULL	
) AUTO_INCREMENT = 1001;

SELECT * FROM Customer1;

CREATE TABLE Account1 (
	aid				BIGINT			PRIMARY KEY AUTO_INCREMENT,
	accType			CHAR(1)			NOT NULL	DEFAULT 'S',
	balance			DOUBLE			NOT NULL	DEFAULT 2000.0,
	interestRate	DOUBLE			NOT NULL	DEFAULT 0.03,
	overdraft		DOUBLE			NOT NULL	DEFAULT 0.0,
	customerId		BIGINT			NOT NULL,
	regDate			TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP, CONSTRAINT Account_customerId_FK1 FOREIGN KEY (customerId) REFERENCES Customer(cid)
)AUTO_INCREMENT = 3001;

SELECT * FROM Account1;

INSERT INTO Customer1 VALUES (1, 'James Bond', '900101-1234567');

INSERT INTO Account1 (balance, interestRate, overdraft, customerId)
VALUES (2000.0, 0.03, 0.0, 1001);

UPDATE Customer1 SET name='Jason Bourne' WHERE cid=1002;

DELETE FROM Customer1 WHERE cid=1002;

SELECT * FROM Account1 WHERE Account1.accType AND Account1.balance;

CREATE INDEX CustomerIndex ON Customer1(ssn);

SELECT aid, accountNum, accountType, balance, cid FROM Account a INNER JOIN Customer c ON a.customerId = c.cid WHERE c.ssn ='840104-1234567';
