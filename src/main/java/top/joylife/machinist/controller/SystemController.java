package top.joylife.machinist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import top.joylife.machinist.model.entity.Test;
import top.joylife.machinist.service.TestService;

import javax.annotation.Resource;

/**
 * Created by WuHaiming on 2017/5/30 0030.
 */

@Controller
@RequestMapping("/")
public class SystemController {

    @Resource
    private TestService testService;

    @RequestMapping("")
    public String index(){
        return "index";
    }

    @RequestMapping("test")
    @ResponseBody
    public Test gettest(){
        Test test = testService.getTest();
        return test;
    }
}
