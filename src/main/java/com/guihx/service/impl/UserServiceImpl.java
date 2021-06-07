package com.guihx.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guihx.Entity.Users;
import com.guihx.mapper.UserMapper;
import com.guihx.service.UserService;
import org.springframework.stereotype.Service;

@Service
@DS("db2")
public class UserServiceImpl extends ServiceImpl<UserMapper, Users> implements UserService {

}

