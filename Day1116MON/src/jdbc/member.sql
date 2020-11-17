-- SQL
CREATE TABLE member_tbl (
	memberSsn VARCHAR2(13) PRIMARY KEY,
	memberName VARCHAR2(15) NOT NULL,
	memberGender CHAR(1) NOT NULL,
	memberBirthDay DATE NOT NULL,
	memberRegistDay TIMESTAMP(9) NOT NULL, -- 연/월/일/시/분/초 
	memberAge NUMBER(7, 2) NOT NULL
);

-- 컬럼 추가
ALTER TABLE member_tbl 
ADD memberAddr VARCHAR2(20) NULL;

ALTER TABLE member_tbl
MODIFY memberRegistDay TIMESTAMP(6);

INSERT INTO member_tbl(memberSsn, memberName, memberGender, memberBirthDay, memberRegistDay, memberAge) 
VALUES ('6666', '박정원', 'F', sysdate, sysdate, 12);


DROP TABLE member_tbl PURGE;

-- %, 이름에 재 문자가 하나라도 있는 회원 검색
SELECT * FROM member_tbl
WHERE memberName LIKE "%재%";

-- -, 이름이 오_원 인 사람 모두 출력
SELECT * FROM member_tbl
WHERE memberName LIKE "오_원";

-- AND, OR
SELECT * FROM member_tbl
WHERE memberGender = "F" AND memberAge > 25;

-- BETWEEN AND
SELECT * FROM member_tbl
WHERE memberAge BETWEEN 15 AND 20;

-- 이름이 오정원이거나 박정원이면 검색
SELECT * FROM member_tbl
WHERE memberName IN ("오정원", "박정원");



