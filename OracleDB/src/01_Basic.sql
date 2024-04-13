-- SQL 파일에서 주석문은 '--' 표시하고 해당내용을 기술합니다.

​

-- Table : 데이터베이스에서 사용하는 데이터 집합의 단위, 흔히 알고 있는 "표" 양식

-- Field : 열에 해당하는 데이터 단위. (= 속성, 애트리뷰트)

-- Record : 행에 해당하는 데이터 단위. (= 튜플)

​

-- 위와 같이 표 형식의 데이터베이스를 "관계형 데이터베이스" 라고 부릅니다.

​

-- 현재 출시되어 데이터베이스로 활용하는 제품들 : 오라클, MySQL, MSSQL, MariaDB, MongiDB, Access 등

​

-- 데이터베이스 프로그램에는 저장하는 공간이나 기능이 있지만, 이를 가능하게 해주는 프로그램이 따로 있습니다.

-- 데이터베이스의 조작 운영을 가능하게 하는 프로그램 : DBMS(Database Management System)

-- 각 데이터베이스 제품들에는 자신의 데이터베이스를 관리할 수 있는 DBMS 가 존재합니다.

-- 오라클 데이터베이스에서 사용가능한 DBMS : SQL Developer, SQLPLUS, 이클립스 등

​

-- SQL 의 세 가지 종류

-- 1. DDL(Database Definition Language) - CREATE USER ~

-- 2. DML(Database Management Language)

-- 3. DCL(Database Control Language) GRANT DBA TO ~

​

-- DDL(Data Definition Language) - 데이터 정의어

-- 명령의 예 : CREATE, ALTER, DROP

-- CREATE : 테이블, 뷰, 사용자 등을 생성할 때 사용하는 명령

-- ALTER : 이미 생성되어 있는 테이블 또는 뷰, 사용자 등의 구조를 수정하기 위한 명령

-- DROP : 이미 생성되어 있는 테이블 또는 뷰, 사용자 등을 삭제하기 위한 명령

​

-- DML(Data Management Language) - 데이터 조작어(레코드 단위의 처리)

-- 명령의 예 : INSERT, UPDATE, DELETE, SELECT

-- INSERT : 테이블의 레코드를 추가 하기 위한 명령

-- UPDATE : 테이블에 있는 레코드 중 일부 도는 전부를 수정하기 위한 명령

-- DELETE : 테이블에 있는 레코드 중 일부 또는 전부를 삭제하기 위한 명령

-- SELECT : 테이블에 있는 레코드 중 일부 또는 전부를 조회(검색) 하여 열람하기 위한 명령

​

-- DCL(Data Control Language) - 데이터 제어어

-- 명령의 예 : GRANT, REVOKE

-- GRANT : 특정 사용자에게 권한을 설정

-- REVOKE : 특정 사용자에게 권한을 해제

​