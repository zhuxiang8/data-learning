-- 默认用户表数据

-- ----------------------------
-- Records of i_user
-- ----------------------------
INSERT INTO `i_user` VALUES ('1', '超级管理员', 'admin', '1', '{bcrypt}$2a$10$4HKmn2xLILP1gbG83rlC6.IgSNtJMqeTjSLVLbc9OYu7u9rMGFYkm', '1', '18901541234', '111@qq.com', null);
-- INSERT INTO `i_user` VALUES ('2', '企业管理员', 'qiyeAdmin', '2', '{bcrypt}$2a$10$4HKmn2xLILP1gbG83rlC6.IgSNtJMqeTjSLVLbc9OYu7u9rMGFYkm', '1', '18901541234', '111@qq.com', 1);
-- INSERT INTO `i_user` VALUES ('3', '企业管理员1', 'qiyeAdmin1', '2', '{bcrypt}$2a$10$4HKmn2xLILP1gbG83rlC6.IgSNtJMqeTjSLVLbc9OYu7u9rMGFYkm', '1', '18901541234', '111@qq.com', 2);

-- 创建完表格后外键约束生效
SET FOREIGN_KEY_CHECKS = 1;
