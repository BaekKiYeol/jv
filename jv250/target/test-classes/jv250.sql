DROP TABLE Sample10; -- 테이블 삭제
SHOW DATEBASES; -- 데이터베이스 확인

CREATE TABLE Sample10 (
   no         INT(11)    	DEFAULT NULL,
   name       VARCHAR(20)	DEFAULT NULL,
   birthday   DATE       	DEFAULT NULL,
   address	  VARCHAR(40)	DEFAULT NULL
);

SELECT * FROM Sample10;

INSERT INTO Sample10 VALUES (1, '유비', '1996-10-25', '대구 중구 반월당');
INSERT INTO Sample10 VALUES (2, '관우', '1996-11-25', '대구 중구 반월당2');
INSERT INTO Sample10 VALUES (3, '장비', '1996-12-25', '대구 중구 반월당3');
--(자바)가나다"마바"사 -> (SQL)"가나다\"마바\"사"
--(자바)Tom's house -> (SQL)'Toms''s house'
DELETE FROM Sample10 WHERE name = "관우";


DROP TABLE Customer;
CREATE TABLE Customer (
	cid			BIGINT			PRIMARY KEY AUTO_INCREMENT,
	name	    VARCHAR(20)		NOT NULL,
	ssn		    VARCHAR(14)		NOT NULL,
	phone	    VARCHAR(14)		NOT NULL,
	customerId  VARCHAR(16)		NOT NULL,
	passwd 		VARCHAR(60)		NOT NULL,
	regDate		TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
) AUTO_INCREMENT = 1001;

ALTER TABLE Customer CHANGE customerId userId VARCHAR(16) NOT NULL;

DELETE FROM Customer WHERE name = '여포';
SELECT * FROM Customer;

INSERT INTO Customer (name, ssn, phone, customerId, passwd)
VALUES ('유비','961025-1234567','010-1234-1234','java','a1234');

INSERT INTO Customer (name, ssn, phone, customerId, passwd)
VALUES ('관우','961125-1234567','010-1234-1234','java','a1234');

INSERT INTO Customer (name, ssn, phone, customerId, passwd)
VALUES ('장비','961225-1234567','010-1234-1234','java','a1234');

UPDATE Customer SET ssn='961025-1234567', phone='010-1234-5678' WHERE cid=1001;


DROP TABLE Account;
CREATE TABLE Account(
	aid				BIGINT			PRIMARY KEY AUTO_INCREMENT,
	accountNum		VARCHAR(11)		NOT NULL,	-- 111-11-1111
	balance			DOUBLE			NOT NULL	DEFAULT 0.0,
	interestRate	DOUBLE			NOT NULL	DEFAULT 0.0,
	overdraft		DOUBLE			NOT NULL	DEFAULT 0.0,
	accountType		CHAR(1)			NOT NULL	DEFAULT 'S',
	customerId		BIGINT			NOT NULL,
	regDate			TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP,
	
	CONSTRAINT Account_customerId_FK FOREIGN KEY (customerId) REFERENCES Customer(cid)
)AUTO_INCREMENT = 3001;

SELECT * FROM Customer;
SELECT * FROM Account;

DELETE FROM Customer WHERE name = '여포';

INSERT INTO Account (accountNum, balance, interestRate, overdraft, accountType, customerId)
VALUES ('123-45-6789', 3000.0, 0.03, 0.0, 'S', 1001),
('234-56-7890', 5000.0, 0.0, 3000.0, 'C', 1002),
('345-67-8901', 1000.0, 0.03, 0.03, 'S', 1003);

-- inner join
SELECT * FROM Account, Customer
WHERE Account.customerId = Customer.cid AND Customer.ssn * '961025-1234567';

SELECT * FROM Account a INNER JOIN Customer c ON a.customerId = c.cid;

SELECT * FROM Account a INNER JOIN Customer c ON a.customerId = c.cid WHERE c.ssn = '961025-1234567';

--DROP TABLE if exists account1; -- 다른 테이블(ex.account1)이 있을 경우 삭제 방법

CREATE TABLE User2 (
	uid			BIGINT			PRIMARY KEY AUTO_INCREMENT,
	username	VARCHAR(20)		NOT NULL,
	userId  	VARCHAR(16)		NOT NULL,
	passwd 		VARCHAR(60)		NOT NULL,
	ssn		    VARCHAR(14)		NOT NULL,
	email1	    VARCHAR(14)		NOT NULL,
	regDate		TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
)
SELECT * FROM User2;
DROP TABLE User2;
DELETE FROM User2 WHERE username = '자바1';