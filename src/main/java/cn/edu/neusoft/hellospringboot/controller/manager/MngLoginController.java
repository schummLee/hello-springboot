package cn.edu.neusoft.hellospringboot.controller.manager;

import cn.edu.neusoft.hellospringboot.domain.User;
import cn.edu.neusoft.hellospringboot.service.UserService;
import cn.edu.neusoft.hellospringboot.vo.UserVO;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("manager")
@Api(tags = "【管理员】登录登出接口")
public class MngLoginController {

    @Autowired
    private UserService userService;

    @GetMapping("login")
    public String login(Model mode) {
        mode.addAttribute("currentYear", LocalDate.now().getYear());
        return "manager/login";
    }

    @PostMapping("doLogin")
    public ModelAndView doLogin(UserVO userVO, HttpSession session) {

        User userDB = userService.getByUsername(userVO.getUsername());
        System.out.println(userVO.getPassword());
        if (userDB == null) {
            throw new RuntimeException("用户不存在");
        }
        if (userVO.getPassword().equals(userDB.getPassword())) {
            UserVO u = new UserVO();
            u.setUsername(userDB.getUsername());
            u.setAge(userDB.getAge());
            u.setSex(userDB.getSex());
            u.setAddress(userDB.getAddress());

            session.setAttribute("userId", userDB.getId());

            return new ModelAndView("manager/userInfo", "user", u);
        } else {
            // TODO 提示用户密码输入错了
            return null;
        }

    }
}
