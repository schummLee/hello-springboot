package cn.edu.neusoft.hellospringboot.controller;

import cn.edu.neusoft.hellospringboot.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("user")
@Api(tags = "【普通用户】相关接口")
public class UserController {

    /**
     * 用户登录
     *
     * @param username 用户名
     * @param password 密码
     */
    @GetMapping("login")
    public void login(String username, String password) {
        System.out.println(username);
        System.out.println(password);
        // TODO 增加数据库保存逻辑

    }

    @GetMapping("loginById")
    public void loginById(@RequestParam(value = "username", required = false) String userId, String password) {
        System.out.println("userId: " + userId);
        System.out.println("password: " + password);
        // TODO 增加数据库保存逻辑

    }

    @GetMapping("loginPath/{username}/{password}")
    public void loginPath(@PathVariable(value = "username") String userId, @PathVariable String password) {
        System.out.println(userId);
        System.out.println(password);
        // TODO 增加数据库保存逻辑

    }

    @PostMapping("add")
    public void add(@RequestBody UserVO user) {
        System.out.println(user.getUsername());
        System.out.println(user.getAge());
        System.out.println(user.getSex());
        // TODO 其他数据处理逻辑
    }

    @PostMapping("addWithReq")
    public void addWithReq(HttpServletRequest req) {
        System.out.println(req.getParameter("username"));
        Map<String, String[]> paramMap = req.getParameterMap();
        System.out.println(paramMap.get("age")[0]);
        // TODO 增加数据库保存逻辑

    }

    @GetMapping("getById")
    @ApiOperation("根据ID查询用户")
    public UserVO getById(String userId) {
        System.out.println(userId);
        // TODO 从数据库获取用户信息
        UserVO userVO = new UserVO();
        userVO.setUsername("liudehua");
        userVO.setAge(18);
        userVO.setSex("男");
        return userVO;
    }

    @PostMapping("loginForm")
    public void loginForm(UserVO userVO) {
        System.out.println(userVO.getUsername());
        System.out.println(userVO.getPassword());
        // TODO 增加数据库保存逻辑

    }

    @PostMapping("loginAjax")
    public String loginAjax(@RequestBody UserVO userVO) {
        System.out.println(userVO.getUsername());
        System.out.println(userVO.getPassword());
        // TODO 增加数据库保存逻辑
        return "登录成功";
    }


}
