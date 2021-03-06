package com.lx.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lx.user.entity.User;

import java.util.List;

/**
 * <p>
 * 系统用户 Mapper 接口
 * </p>
 *
 * @author zhaowei
 * @since 2019-12-21
 */
public interface UserMapper extends BaseMapper<User> {


    List<User> queryList(User user);

}
