package cn.edu.neusoft.hellospringboot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags ="hello测试")
public class HelloController {

    @GetMapping("/hello")
    @ApiOperation(value = "你好", notes = "目前仅仅是作为测试")
    public String hello(@ApiParam("登陆账号") String username) {
        // TODO 等xxx的接口完事儿，再调整
        return "Hello " + username;
    }
}
