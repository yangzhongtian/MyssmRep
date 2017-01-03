package com.test.action;

import com.terren.entity.User;
import com.terren.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/1/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/*.xml"})
public class UserActionTest {
    @Resource
    private IUserService userService;

    @Test
    public void  userList(){
       List<User> userList =userService.getAllUser();
        System.out.println(userList.size());
        for(User user:userList){
            System.out.println(user.getUserName()+"=="+user.getPassword());
        }
    }
}
