package com.horn.home.mapper;

import com.horn.home.entity.User;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2021-04-05
 */
public interface UserMapper extends BaseMapper<User> {

    List<User> getAll();

    User getOne(Long id);

    int insert(User entity);

    void update(User user);

    void delete(Long id);

}
