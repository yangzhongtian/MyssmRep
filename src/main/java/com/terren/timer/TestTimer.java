package com.terren.timer;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/1/9.
 * pring  定时任务，1）配置文件形式定时调用 spring-mybatis   中
 * http://www.springframework.org/schema/task
 *http://www.springframework.org/schema/task/spring-task-3.0.xsd  以及  第 4行   13-16行
 */

public class TestTimer {

    public  void perMinPrint(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String time =simpleDateFormat.format(new Date());
       System.out.println(time);
    }
}
