package com.terren.action.Impl;

import com.terren.action.IUserAction;
import com.terren.entity.User;
import com.terren.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by hasee on 2017/1/1.
 */
@Controller
@RequestMapping("/userActions")
public class UserActionImpl implements IUserAction{

    @Resource
    protected  IUserService userService;

    @RequestMapping(value="/getAllUser",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView getAllUser(HttpServletRequest request, HttpServletResponse response) {
      List<User> lists=  userService.getAllUser();
        String ss = lists.get(0).getUserName();
        ModelAndView  modelAndView = new ModelAndView("DetailUser");
        modelAndView.addObject("users",lists);
       String nowDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        modelAndView.addObject("nowDate",nowDate);
        return  modelAndView;
    }

    @RequestMapping(value="/getAllUserTow",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView getAllUsetTow(Model model){
        List<User> lists=  userService.getAllUser();
        String ss = lists.get(0).getUserName();
        System.out.println(model);
        return new ModelAndView("DetailUser2","users",lists);
    }

    @RequestMapping(value="/getAllUserRedirect",method = {RequestMethod.GET,RequestMethod.POST})
    public String getAllUsetRedrect(User user, RedirectAttributes redirectAttributes){
        List<User> lists=  userService.getAllUser();
        String ss = lists.get(0).getUserName();
        redirectAttributes.addFlashAttribute("message","hello");
        return "redirect:/userActions/getAllUserTow";
    }
    public static void main(String[] args) {
        System.out.println("hello");
    }

}
