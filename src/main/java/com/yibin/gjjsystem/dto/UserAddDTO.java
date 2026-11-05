package com.yibin.gjjsystem.dto;

import lombok.Data;

import javax.validation.constraints.*;

/**
 * 用户新增 DTO（接收前端传参，做参数校验）
 *
 * 常用校验注解一览：
 *   @NotNull      → 不能为 null（对象类型用）
 *   @NotBlank     → 不能为 null 且不能是空字符串（String 类型用）
 *   @NotEmpty     → 不能为 null 且不能为空（集合/数组/字符串用）
 *   @Size         → 字符串长度或集合大小范围
 *   @Min / @Max   → 数字最小/最大值
 *   @Pattern      → 正则表达式校验
 *   @Email        → 邮箱格式校验
 *   @Past / @Future → 日期必须在过去/未来
 */
@Data
public class UserAddDTO {

    /** 用户名：必填，长度 3-20 */
    @NotBlank(message = "用户名不能为空")
    @Size(min = 3, max = 20, message = "用户名长度必须在 3-20 之间")
    private String username;

    /** 密码：必填，长度 6-20 */
    @NotBlank(message = "密码不能为空")
    @Size(min = 6, max = 20, message = "密码长度必须在 6-20 之间")
    private String password;

    /** 姓名：必填 */
    @NotBlank(message = "姓名不能为空")
    private String realName;

    /** 手机号：选填，但填了必须符合格式 */
    @Pattern(regexp = "^1[3-9]\\d{9}$", message = "手机号格式不正确")
    private String phone;

    /** 邮箱：选填，但填了必须符合格式 */
    @Email(message = "邮箱格式不正确")
    private String email;

    /** 年龄：选填，范围 0-150 */
    @Min(value = 0, message = "年龄不能小于 0")
    @Max(value = 150, message = "年龄不能大于 150")
    private Integer age;
}
