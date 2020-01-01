/*
 Navicat Premium Data Transfer

 Source Server         : 本地linux
 Source Server Type    : MySQL
 Source Server Version : 50716
 Source Host           : 10.211.55.55:3306
 Source Schema         : springBootTest

 Target Server Type    : MySQL
 Target Server Version : 50716
 File Encoding         : 65001

 Date: 29/12/2019 16:07:07
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sqlBatchInject
-- ----------------------------
DROP TABLE IF EXISTS `sqlBatchInject`;
CREATE TABLE `sqlBatchInject` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `editTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sqlBatchInject
-- ----------------------------
BEGIN;
INSERT INTO `sqlBatchInject` VALUES (1, 'zhang', '2019-12-11 16:06:03', '2019-12-29 16:06:08');
INSERT INTO `sqlBatchInject` VALUES (2, 'LI', '2019-12-03 16:06:23', '2019-12-29 16:06:28');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
