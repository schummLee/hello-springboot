package cn.edu.neusoft.hellospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//    @RequestMapping(value = "/page")
public class FirstController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test() {

        return "ThyemeleafTest";
    }

    @GetMapping("/page")
    public String testPage() {
        return "ThyemeleafTest";
    }

}
