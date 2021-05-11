-- 여기는 food접속

CREATE TABLE tbl_myfoods(
    mf_date CHAR(10) NOT NULL,
    mf_code CHAR(6) NOT NULL,
    mf_intake CHAR(1) NOT NULL
);

CREATE VIEW view_식품섭취정보
AS (
SELECT M.mf_date AS 날짜, F.fd_name AS 식품명, M.mf_intake AS 섭취량,
    F.fd_volume AS 내용량 , F.fd_kcal AS 에너지, F.fd_protein AS 단백질,
    F.fd_roll AS 지방, F.fd_cbhd AS 탄수화물, F.fd_sugar AS 당류
FROM tbl_myfoods M
    LEFT JOIN tbl_foods F
        ON M.mf_code = F.fd_ccode
);