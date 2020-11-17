-- SQL
CREATE TABLE member_tbl (
	memberSsn VARCHAR2(13) PRIMARY KEY,
	memberName VARCHAR2(15) NOT NULL,
	memberGender CHAR(1) NOT NULL,
	memberBirthDay DATE NOT NULL,
	memberRegistDay TIMESTAMP(9) NOT NULL, -- ��/��/��/��/��/�� 
	memberAge NUMBER(7, 2) NOT NULL
);

-- �÷� �߰�
ALTER TABLE member_tbl 
ADD memberAddr VARCHAR2(20) NULL;

ALTER TABLE member_tbl
MODIFY memberRegistDay TIMESTAMP(6);

INSERT INTO member_tbl(memberSsn, memberName, memberGender, memberBirthDay, memberRegistDay, memberAge) 
VALUES ('6666', '������', 'F', sysdate, sysdate, 12);


DROP TABLE member_tbl PURGE;

-- %, �̸��� �� ���ڰ� �ϳ��� �ִ� ȸ�� �˻�
SELECT * FROM member_tbl
WHERE memberName LIKE "%��%";

-- -, �̸��� ��_�� �� ��� ��� ���
SELECT * FROM member_tbl
WHERE memberName LIKE "��_��";

-- AND, OR
SELECT * FROM member_tbl
WHERE memberGender = "F" AND memberAge > 25;

-- BETWEEN AND
SELECT * FROM member_tbl
WHERE memberAge BETWEEN 15 AND 20;

-- �̸��� �������̰ų� �������̸� �˻�
SELECT * FROM member_tbl
WHERE memberName IN ("������", "������");



