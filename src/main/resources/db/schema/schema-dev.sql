-- 初始化数据库，取消外键约束检查
SET FOREIGN_KEY_CHECKS = 0;

-- 用户表
DROP TABLE IF EXISTS i_user;
CREATE TABLE `i_user`
(
  `id`            INT NOT NULL AUTO_INCREMENT PRIMARY KEY, -- 主键自增
  `user_name`     VARCHAR(30), -- 用户名
  `login_name`    VARCHAR(30), -- 登录名
  `user_type`     INT, -- 用户类型
  `password`      VARCHAR(255), -- 密码
  `enabled`       INT, -- 是否可用
  `phone`         VARCHAR(20), -- 联系电话
  `email`         VARCHAR(30), -- 电子邮箱
  `enterprise_id` INT -- 企业ID（外键 企业信息表主键）
);






