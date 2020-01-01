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

 Date: 30/12/2019 14:10:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `lastName` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `gender` int(2) DEFAULT NULL,
  `d_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
