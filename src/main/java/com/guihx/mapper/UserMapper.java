package com.guihx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guihx.Entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<Users> {

    @Select("SELECT id,name,age,email,createTime,updateTime,version FROM t_users LIMIT #{page},#{size}")
    List<Users> fenye(int page, int size);

    @Select("SELECT * FROM t_users where age = #{age} and name like '%${name}%' LIMIT #{page},#{size}")
    List<Users> fenye1(Integer age,String name,int page, int size);
}
