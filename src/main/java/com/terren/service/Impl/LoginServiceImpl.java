package com.terren.service.Impl;

import com.terren.dao.ILoginDao;
import com.terren.entity.User;
import com.terren.service.ILoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/1/6.
 */
@Service
public class LoginServiceImpl implements ILoginService {

    @Resource
    protected ILoginDao loginDao;

 public boolean login(User user) {
        User loginUser = loginDao.login();
        if(loginUser==null){
            return false;
        }else{
            return true;
        }
    }
}
