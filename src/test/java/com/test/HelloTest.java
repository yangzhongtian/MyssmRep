package com.test;

import com.terren.dao.IUserDao;
import com.terren.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


/**
 * Created by hasee on 2017/1/1.
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/*.xml"})
public class HelloTest {
    @Autowired
    private IUserDao mUserDao;
    @Test
    public void findAll() {
        List<User> userList = mUserDao.getAllUser();
        for (User user : userList) {
            System.out.println(user.getUserName());
        }
    }

}
