/*
 Navicat Premium Data Transfer

 Source Server         : Wine
 Source Server Type    : Oracle
 Source Server Version : 110200
 Source Host           : 127.0.0.1:1521
 Source Schema         : WINE

 Target Server Type    : Oracle
 Target Server Version : 110200
 File Encoding         : 65001

 Date: 31/05/2021 15:10:51
*/


-- ----------------------------
-- Table structure for WINE
-- ----------------------------
DROP TABLE "WINE"."WINE";
CREATE TABLE "WINE"."WINE" (
  "ID" NUMBER(10,0) NOT NULL,
  "LATITUDE" FLOAT(126),
  "LONGITUTDE" FLOAT(126),
  "COUNTRY" VARCHAR2(255 CHAR),
  "DESCRIPTION" VARCHAR2(255 CHAR),
  "GRAPES" VARCHAR2(255 CHAR),
  "NAME" VARCHAR2(255 CHAR),
  "REGION" VARCHAR2(255 CHAR),
  "YEAR" VARCHAR2(4 CHAR)
)
TABLESPACE "SYSTEM"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  FREELISTS 1
  FREELIST GROUPS 1
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of WINE
-- ----------------------------
INSERT INTO "WINE"."WINE" VALUES ('1', '0.0000000000000000', '0.0000000000000000', 'string', 'string', 'string', 'string', 'string', '2001');
INSERT INTO "WINE"."WINE" VALUES ('2', '0.0000000000000000', '0.0000000000000000', 'string', 'string', 'string', 'Bordeaux', 'string', '1995');
INSERT INTO "WINE"."WINE" VALUES ('41', '0.0000000000000000', '0.0000000000000000', 'France', 'string', 'Grenache / Syrah', 'CHATEAU DE SAINT COSME', 'Southern Rhone / Gigondas', '2009');
INSERT INTO "WINE"."WINE" VALUES ('43', '0.0000000000000000', '0.0000000000000000', 'USA', 'string', 'Sauvignon Blanc', 'MARGERUM SYBARITE', 'California Central Cosat', '2010');
INSERT INTO "WINE"."WINE" VALUES ('42', '0.0000000000000000', '0.0000000000000000', 'Spain', 'string', 'Tempranillo', 'LAN RIOJA CRIANZA', 'Rioja', '2006');
INSERT INTO "WINE"."WINE" VALUES ('44', '0.0000000000000000', '0.0000000000000000', 'USA', 'string', 'Pinot Noir', 'REX HILL', 'Oregon', '2009');
INSERT INTO "WINE"."WINE" VALUES ('45', '0.0000000000000000', '0.0000000000000000', 'Italy', 'string', 'Sangiovese Merlot', 'VITICCIO CLASSICO RISERVA', 'Tuscany', '2007');
INSERT INTO "WINE"."WINE" VALUES ('46', '0.0000000000000000', '0.0000000000000000', 'France', 'string', 'Merlot', 'CHATEAU LE DOYENNE', 'Bordeaux', '2005');
INSERT INTO "WINE"."WINE" VALUES ('47', '0.0000000000000000', '0.0000000000000000', 'France', 'string', 'Merlot', 'DOMAINE DU BOUSCAT', 'Bordeaux', '2009');
INSERT INTO "WINE"."WINE" VALUES ('48', '0.0000000000000000', '0.0000000000000000', 'USA', 'string', 'Pinot Noir', 'BLOCK NINE', 'California', '2009');
INSERT INTO "WINE"."WINE" VALUES ('49', '0.0000000000000000', '0.0000000000000000', 'USA', 'string', 'Pinot Noir', 'DOMAINE SERENE', 'Oregon', '2007');
INSERT INTO "WINE"."WINE" VALUES ('50', '0.0000000000000000', '0.0000000000000000', 'Argentina', 'string', 'Pinot Gris', 'BODEGA LURTON', 'Mendoza', '2011');
INSERT INTO "WINE"."WINE" VALUES ('51', '0.0000000000000000', '0.0000000000000000', 'France', 'string', 'Chardonnay', 'LES MORIZOTTES', 'Burgundy', '2009');

-- ----------------------------
-- Sequence structure for HIBERNATE_SEQUENCE
-- ----------------------------
DROP SEQUENCE "WINE"."HIBERNATE_SEQUENCE";
CREATE SEQUENCE "WINE"."HIBERNATE_SEQUENCE" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 CACHE 20;

-- ----------------------------
-- Primary Key structure for table WINE
-- ----------------------------
ALTER TABLE "WINE"."WINE" ADD CONSTRAINT "SYS_C007989" PRIMARY KEY ("ID");

-- ----------------------------
-- Checks structure for table WINE
-- ----------------------------
ALTER TABLE "WINE"."WINE" ADD CONSTRAINT "SYS_C007988" CHECK ("ID" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
