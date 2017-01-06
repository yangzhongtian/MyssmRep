package com.terren.action.Impl;

import com.terren.action.ILoginAction;
import com.terren.entity.User;
import com.terren.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/1/6.
 */
@Controller
public class LoginActionImpl implements ILoginAction {

    @Autowired
     protected  ILoginService loginService;

    /**
     * 登录功能
     * @param name
     * @param password
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "login",method = {RequestMethod.POST})
    public String  login(@RequestParam String  name , @RequestParam String password,
                         HttpServletRequest request, HttpServletResponse response){
        User user = new User();
        boolean flag = loginService.login(user);
        return "main";
    }

    /**
     * 注销功能
     * @return
     */
    @RequestMapping(value="loginOut")
    public String loginOut(){

        return "login";
    }
}
