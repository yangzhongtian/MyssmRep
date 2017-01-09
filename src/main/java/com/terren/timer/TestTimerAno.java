package com.terren.timer;

/**
 * Created by Administrator on 2017/1/9.
 */

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * spring  定时执行器 基于注解形式
 */
@Component("hello")
public class TestTimerAno {
    /**
     *  秒 分 时  天 月 天(星期) 年(可选) ---最少6个 最多七个
     *  0/15"表示从第0分钟开始，每15分钟.
     */
    @Scheduled(cron = "0/5 * * * * ?")
    public void perMinPrint(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String time =simpleDateFormat.format(new Date());
        System.out.println("每分钟开始执行"+time);
    }
}
