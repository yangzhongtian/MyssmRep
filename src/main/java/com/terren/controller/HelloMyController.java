package com.terren.controller;


import com.terren.entity.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/1/5.
 */
public class HelloMyController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        User user  = new User();
        user.setUserName("hello");
        return new ModelAndView("hellomycontroller","user",user);

    }
}
