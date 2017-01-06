package com.terren.service.Impl;

import com.terren.dao.IUserDao;
import com.terren.entity.User;
import com.terren.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by hasee on 2017/1/1.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;
    public List<User> getAllUser(){
        List<User> users = userDao.getAllUser();
        return users;
    }


}
