package com.terren.action.Impl.demotest;

import com.terren.action.ILoginAction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/1/9.
 */
@Controller
public class toJsp implements ILoginAction{
    @RequestMapping(value = "/toPage")
    public ModelAndView toPage(@RequestParam String [] dir, @RequestParam  String file){
        System.out.println("hello");
        StringBuilder builder =new StringBuilder("");
        for (int i=0;i<dir.length;i++) {
            if(i==0){
                builder.append(dir[i]);
            }else{
                builder.append("/");
                builder.append(dir[i]);
            }
        }
        String result= builder.toString().trim();
        if(result.isEmpty()){
            result = file;
        }else{
            result = result+"/"+file;
        }

        return new ModelAndView(result);
    }
}
