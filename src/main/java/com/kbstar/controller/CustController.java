package com.kbstar.controller;

import com.kbstar.dto.Cust;
import com.kbstar.service.CustService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Slf4j
@Controller
   @RequestMapping("/cust")
   public class CustController {
    @Autowired
    CustService service;
       Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
       String dir = "cust/";
       @RequestMapping("")
    public String main(Model model){
       model.addAttribute("left",dir + "left");
       model.addAttribute("center",dir + "center");
      // logger.info("-----------------------------------");
           //slf4j로그찍기
           Random r = new Random();
           int inx = r.nextInt(1000)+1;
           log.info(inx+"");//string 만 들어감
        return "index";
    }
    @RequestMapping("add")
    public String add(Model model){
        model.addAttribute("left",dir + "left");
        model.addAttribute("center",dir + "add");
        return "index";
    }
    @RequestMapping("get")
    public String get(Model model , String id){
            Cust cust = null;
            try {
                cust = service.get(id);
            } catch (Exception e) {
                log.info("error...");
                e.printStackTrace();
            }
           model.addAttribute("gcust", cust);
            model.addAttribute("left",dir + "left");
            model.addAttribute("center",dir + "get");
            return "index";
    }
    @RequestMapping("all")
    public String all(Model model){

              List<Cust> list=null;
            try {
            list= service.get();
             //   service.get();
            } catch (Exception e) {
                log.info("error...");
                e.printStackTrace();
            }

        model.addAttribute("clist",list);
        model.addAttribute("left",dir + "left");
        model.addAttribute("center",dir + "all");
        return "index";
    }


}
