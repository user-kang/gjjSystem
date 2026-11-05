package com.yibin.gjjsystem.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 用户实体类（与数据库 user 表一一对应）
 *
 * 规范说明：
 * 1. 字段名用小驼峰，数据库字段用下划线，MyBatis 自动转换
 * 2. 用 @Data 注解代替手写 getter/setter/toString/equals/hashCode
 * 3. Entity 是数据库表的映射，不应该直接返回给前端（敏感字段问题）
 * 4. 前端传参用 DTO，数据库操作用 Entity，两者要分开
 */
@Data
public class User {

    /** 主键ID */
    private Long id;

    /** 用户名 */
    private String username;

    /** 密码（加密存储，严禁直接返回给前端） */
    private String password;

    /** 姓名 */
    private String realName;

    /** 手机号 */
    private String phone;

    /** 邮箱 */
    private String email;

    /** 状态：0-禁用，1-正常 */
    private Integer status;

    /** 创建时间 */
    private LocalDateTime createTime;

    /** 更新时间 */
    private LocalDateTime updateTime;

    /** 逻辑删除标记：0-未删除，1-已删除 */
    private Integer deleted;
}
