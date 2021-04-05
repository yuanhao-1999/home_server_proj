package com.horn.home.user.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2021-04-05
 */
@Data
@Accessors(chain = true)
@Getter
@Setter
public class User {

    public static final long serialVersionUID = 1L;

    /**
     * id
     */
    public long id;

    /**
     * 姓名
     */
    public String name;

    /**
     * 年龄
     */
    public Integer age;

    /**
     * 邮箱
     */
    public String email;


}
