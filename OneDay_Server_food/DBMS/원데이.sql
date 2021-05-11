-- food 접속
DROP TABLE tbl_foods;
CREATE TABLE tbl_foods(
    fd_code CHAR(7) PRIMARY KEY,
    fd_name nVARCHAR2(125) NOT NULL,
    fd_year	CHAR(4)	NOT NULL,
    fd_ccode	CHAR(6)	NOT NULL,
    fd_vcode	CHAR(4)	NOT NULL,
    fd_offer	NUMBER	NOT NULL,
    fd_volume	NUMBER	NOT NULL,
    fd_kcal	NUMBER	NOT NULL,
    fd_protein	NUMBER	NOT NULL,
    fd_roll	NUMBER	NOT NULL,
    fd_cbhd	NUMBER	NOT NULL,
    fd_sugar	NUMBER	NOT NULL
);

CREATE TABLE tbl_company(
    cp_code	CHAR(6)	NOT NULL	PRIMARY KEY,
    cp_cpname	nVARCHAR2(50)	NOT NULL	
);

CREATE TABLE tbl_items(
    vl_code	CHAR(4)	NOT NULL	PRIMARY KEY,
    vl_name	nVARCHAR2(20)	NOT NULL	
);

ALTER TABLE tbl_foods
ADD CONSTRAINT fk_company
FOREIGN KEY(fd_ccode)
REFERENCES tbl_company(cp_code);

ALTER TABLE tbl_foods
ADD CONSTRAINT fk_volume
FOREIGN KEY(fd_vcode)
REFERENCES tbl_items(vl_code);

CREATE VIEW view_식품정보
AS(
SELECT F.fd_year AS 출시년도, C.cp_code AS 제조사코드, I.vl_code AS 분류코드,
    F.fd_offer AS 제공량, F.fd_volume AS 총내용량, F.fd_kcal AS 에너지,
        F.fd_protein AS 단백질, F.fd_roll AS 지방, F.fd_cbhd AS 탄수화물,
            F.fd_sugar AS 총당류
FROM tbl_foods F
    LEFT JOIN tbl_company C
        ON F.fd_ccode = C.cp_code
    LEFT JOIN tbl_items I
        ON F.fd_vcode = I.vl_code
);

SELECT * FROM view_식품정보;

DROP TABLE tbl_myfoods;
CREATE TABLE tbl_myfoods(
    mf_date VARCHAR2(10) NOT NULL ,
    mf_code CHAR(6) NOT NULL,
    mf_offer NUMBER NOT NULL
);
