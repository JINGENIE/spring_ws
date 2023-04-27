package com.kbstar.controller;

import com.kbstar.dto.Cust;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
   @RequestMapping("/")
    public String main(){
        return "index";
    }
    @RequestMapping("/about")
    public String ab(){
        return "about";
    }
    @RequestMapping("/singlepost")
    public String singlepost(){
        return "singlepost";
    }
    @RequestMapping("/category")
    public String category(){
        return "category";
    }
    //quics?page=bs01
    //? 는 구분자이다. 서버에 요청하는 명령어이고 물음표, 뒤에는 데이터
    @RequestMapping("/quics")
    public String quics(String page){
        return page;
    }
}
