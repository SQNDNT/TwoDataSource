package com.guihx;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.guihx.Entity.Files;
import com.guihx.Entity.Users;
import com.guihx.service.FilesService;
import com.guihx.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class testMybatis {

    @Autowired
    UserService userService;

    @Autowired
    FilesService filesService;


    @Test
    public void getUser(){
        for (Users users : userService.list()) {
            System.out.println(users);
        }
        System.out.println("------------------------------");
        for (Files files : filesService.list()) {
            System.out.println(files);
        }
    }

}
