package com.example.springApplication.realty.springControllers.classes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/index")
    public String getIndexPage(){
        return "index";
    }
}
