CREATE DATABASE IF NOT EXISTS BOOK_STORE;
USE BOOK_STORE;

DROP TABLE IF EXISTS ADMIN_DETAIL;
DROP TABLE IF EXISTS ADDRESS_DETAIL;
DROP TABLE IF EXISTS ROLES_DETAIL;
DROP TABLE IF EXISTS ADMIN_ROLES_DETAIL;
DROP TABLE IF EXISTS CATEGORIES_DETAIL;
DROP TABLE IF EXISTS BRAND_DETAIL;
DROP TABLE IF EXISTS ITEMS_DETAIL;

CREATE TABLE IF NOT EXISTS ADMIN_DETAIL (
  ADMIN_ID int(11) NOT NULL AUTO_INCREMENT,
  FIRST_NAME varchar(50) NOT NULL,
  LAST_NAME varchar(50) DEFAULT NULL,
  PHONE_NUMBER varchar(20) NOT NULL,
  EMAIL_ID varchar(255) NOT NULL,
  PASSWORD varchar(50) NOT NULL,
  CREATED_DATE TIMESTAMP NOT NULL DEFAULT 0,
  MODIFIED_DATE TIMESTAMP NOT NULL DEFAULT 0,
  CREATED_BY INTEGER DEFAULT 1 NOT NULL,
  MODIFIED_BY INTEGER DEFAULT 1 NOT NULL,
  DELETED CHAR(1) DEFAULT 'N' NOT NULL,
  PRIMARY KEY (ADMIN_ID)
);

CREATE TABLE IF NOT EXISTS ADDRESS_DETAIL (
  ADDRESS_ID int(11) NOT NULL AUTO_INCREMENT,
  ADDRESS1 varchar(255) NOT NULL,
  ADDRESS2 varchar(255) DEFAULT NULL,
  CITY varchar(50) NOT NULL,
  STATE varchar(50) NOT NULL,
  POSTAL_CODE varchar(12) NOT NULL,
  COUNTRY_CODE varchar(5)  NOT NULL,
  ADMIN_ID int(11) NOT NULL,
  CREATED_DATE TIMESTAMP NOT NULL DEFAULT 0,
  MODIFIED_DATE TIMESTAMP NOT NULL DEFAULT 0,
  CREATED_BY INTEGER DEFAULT 1 NOT NULL,
  MODIFIED_BY INTEGER DEFAULT 1 NOT NULL,
  DELETED CHAR(1) DEFAULT 'N' NOT NULL,
  PRIMARY KEY (ADDRESS_ID) USING BTREE,
  KEY fk_admin_id (ADMIN_ID) USING BTREE,
  CONSTRAINT fk_admin_id FOREIGN KEY (ADMIN_ID) REFERENCES ADMIN_DETAIL(ADMIN_ID)
);

CREATE TABLE IF NOT EXISTS ROLES_DETAIL (
  ROLE_ID int(10) NOT NULL AUTO_INCREMENT,
  ROLE_NAME varchar(20) DEFAULT NULL,
  CREATED_DATE TIMESTAMP NOT NULL DEFAULT 0,
  MODIFIED_DATE TIMESTAMP NOT NULL DEFAULT 0,
  CREATED_BY INTEGER DEFAULT 1 NOT NULL,
  MODIFIED_BY INTEGER DEFAULT 1 NOT NULL,
  DELETED CHAR(1) DEFAULT 'N' NOT NULL,
  PRIMARY KEY (ROLE_ID) USING BTREE
);

CREATE TABLE IF NOT EXISTS ADMIN_ROLES_DETAIL (
  ID int(2) NOT NULL AUTO_INCREMENT,
  ADMIN_ID int(20) NOT NULL,
  ROLE_ID int(10) NOT NULL,
  CREATED_DATE TIMESTAMP NOT NULL DEFAULT 0,
  MODIFIED_DATE TIMESTAMP NOT NULL DEFAULT 0,
  CREATED_BY INTEGER DEFAULT 1 NOT NULL,
  MODIFIED_BY INTEGER DEFAULT 1 NOT NULL,
  DELETED CHAR(1) DEFAULT 'N' NOT NULL,
  PRIMARY KEY (ID),
  KEY fk_role_id (ROLE_ID),
  KEY fk_admin_id2 (ADMIN_ID),
  CONSTRAINT fk_role_id FOREIGN KEY (ROLE_ID) REFERENCES ROLES_DETAIL (ROLE_ID),
  CONSTRAINT fk_admin_id2 FOREIGN KEY (ADMIN_ID) REFERENCES ADMIN_DETAIL (ADMIN_ID)
);

CREATE TABLE IF NOT EXISTS CATEGORIES_DETAIL (
  CATEGORY_ID INTEGER(10) NOT NULL AUTO_INCREMENT,
  CATEGORY_NAME varchar(50) NOT NULL,
  CREATED_DATE TIMESTAMP NOT NULL DEFAULT 0,
  MODIFIED_DATE TIMESTAMP NOT NULL DEFAULT 0,
  CREATED_BY INTEGER DEFAULT 1 NOT NULL,
  MODIFIED_BY INTEGER DEFAULT 1 NOT NULL,
  DELETED CHAR(1) DEFAULT 'N' NOT NULL,
  PRIMARY KEY (CATEGORY_ID)
);

CREATE TABLE IF NOT EXISTS BRAND_DETAIL (
  BRAND_ID INTEGER(10) NOT NULL AUTO_INCREMENT,
  BRAND_NAME varchar(20) NOT NULL,
  CREATED_DATE TIMESTAMP NOT NULL DEFAULT 0,
  MODIFIED_DATE TIMESTAMP NOT NULL DEFAULT 0,
  CREATED_BY INTEGER DEFAULT 1 NOT NULL,
  MODIFIED_BY INTEGER DEFAULT 1 NOT NULL,
  DELETED CHAR(1) DEFAULT 'N' NOT NULL,
  PRIMARY KEY (BRAND_ID)
);

CREATE TABLE IF NOT EXISTS ITEMS_DETAIL (
  ITEM_ID INTEGER(11) NOT NULL AUTO_INCREMENT,
  ITEM_PART_NUMBER VARCHAR(50) NOT NULL, 
  ITEM_NAME VARCHAR(50) NOT NULL, 
  ITEM_BRAND_ID INTEGER(11) NOT NULL,
  ITEM_CATEGORY_ID INTEGER(11) NOT NULL,
  ITEM_ACTUAL_PRICE INTEGER(11) NOT NULL,
  ITEM_SELLING_PRICE INTEGER(11) NOT NULL,
  ITEM_AVAILABLE_QUANTITY INTEGER(11) NOT NULL,
  ITEM_TOTAL_QUANTITY INTEGER(11) NOT NULL,
  ITEM_IMAGE BLOB NOT NULL,
  CREATED_DATE TIMESTAMP NOT NULL DEFAULT 0,
  MODIFIED_DATE TIMESTAMP NOT NULL DEFAULT 0,
  CREATED_BY INTEGER DEFAULT 1 NOT NULL,
  MODIFIED_BY INTEGER DEFAULT 1 NOT NULL,
  DELETED CHAR(1) DEFAULT 'N' NOT NULL,
  PRIMARY KEY (ITEM_ID),
  KEY fk_category_id (ITEM_CATEGORY_ID),
  KEY fk_brand_id (ITEM_BRAND_ID),
  CONSTRAINT fk_category_id FOREIGN KEY (ITEM_CATEGORY_ID) REFERENCES CATEGORIES_DETAIL (CATEGORY_ID),
  CONSTRAINT fk_brand_id FOREIGN KEY (ITEM_BRAND_ID) REFERENCES BRAND_DETAIL (BRAND_ID)
);

INSERT INTO ROLES_DETAIL (ROLE_ID, ROLE_NAME) values ('1', 'ADMIN MANAGER');

INSERT INTO CATEGORIES_DETAIL (CATEGORY_ID, CATEGORY_NAME) values ('1', 'PENS');
INSERT INTO CATEGORIES_DETAIL (CATEGORY_ID, CATEGORY_NAME) values ('2', 'PENCILS');
INSERT INTO CATEGORIES_DETAIL (CATEGORY_ID, CATEGORY_NAME) values ('3', 'ART SUPPLIES');
INSERT INTO CATEGORIES_DETAIL (CATEGORY_ID, CATEGORY_NAME) values ('4', 'BOOKS');
INSERT INTO CATEGORIES_DETAIL (CATEGORY_ID, CATEGORY_NAME) values ('5', 'FILES & FOLDERS');
INSERT INTO CATEGORIES_DETAIL (CATEGORY_ID, CATEGORY_NAME) values ('6', 'CALCULATORS');
INSERT INTO CATEGORIES_DETAIL (CATEGORY_ID, CATEGORY_NAME) values ('7', 'KEY CHAINS');
INSERT INTO CATEGORIES_DETAIL (CATEGORY_ID, CATEGORY_NAME) values ('8', 'MARKERS & HIGHLIGHTERS');
INSERT INTO CATEGORIES_DETAIL (CATEGORY_ID, CATEGORY_NAME) values ('9', 'PRINTER PAPERS');
INSERT INTO CATEGORIES_DETAIL (CATEGORY_ID, CATEGORY_NAME) values ('10', 'CHARTS');
INSERT INTO CATEGORIES_DETAIL (CATEGORY_ID, CATEGORY_NAME) values ('11', 'ERASERS');

INSERT INTO BRAND_DETAIL (BRAND_ID, BRAND_NAME) values ('1', 'Classmate');
INSERT INTO BRAND_DETAIL (BRAND_ID, BRAND_NAME) values ('2', 'Nataraj');
INSERT INTO BRAND_DETAIL (BRAND_ID, BRAND_NAME) values ('3', 'Chandras');
INSERT INTO BRAND_DETAIL (BRAND_ID, BRAND_NAME) values ('4', 'Camlin');
INSERT INTO BRAND_DETAIL (BRAND_ID, BRAND_NAME) values ('5', 'Apsara');




