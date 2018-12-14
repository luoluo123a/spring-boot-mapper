package com.baizhi.lpm;

import com.baizhi.lpm.entity.User;
import com.baizhi.lpm.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMapperApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void test(){
        List<User> users = userMapper.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

}
