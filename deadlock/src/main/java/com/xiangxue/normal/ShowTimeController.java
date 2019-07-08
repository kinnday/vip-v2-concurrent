package com.xiangxue.normal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *@author Mark老师   享学课堂 https://enjoy.ke.qq.com
 *
 *往期视频咨询芊芊老师  QQ：2130753077  VIP课程咨询 依娜老师QQ：2133576719
 *
 *类说明：刷新时间到客户端
 */
@Controller
public class ShowTimeController {
	

    private static Logger logger
            = LoggerFactory.getLogger(ShowTimeController.class);

    @RequestMapping("/time")
    public String normal(){
        return "showtime";
    }

    @RequestMapping(value="/showTime",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getTime(){
        SimpleDateFormat formatter
                = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formatter.format(new Date());
    }
}
