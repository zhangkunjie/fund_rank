package com.fundrank.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * Created by user on 2018/1/8.
 */
@Controller
@RequestMapping("/")
public class IndexController {
    private Logger logger = LoggerFactory.getLogger(IndexController.class);

    //返回主页面
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() throws Exception {
        return "index";
    }
}
