package cn.edu.neusoft.hellospringboot.controller.manager;

import cn.edu.neusoft.hellospringboot.domain.User;
import cn.edu.neusoft.hellospringboot.service.UserService;
import cn.edu.neusoft.hellospringboot.vo.UserQueryBO;
import cn.edu.neusoft.hellospringboot.vo.UserVO;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "【管理员】用户管理接口")
@RequestMapping("manager/user")
public class MngUserController {

    @Autowired
    private UserService userService;

    @GetMapping("getAllUser")
    @ApiOperation("获取所有用户")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("list")
    @ApiOperation("按条件查询用户列表")
    public List<User> list(User u) {
        return userService.list(u);
    }

    @GetMapping("page")
    @ApiOperation("按条件分页查询用户列表")
    public PageInfo<User> page(UserQueryBO u) {
        return userService.page(u);
    }

    @PostMapping("insert")
    @ApiOperation("新增用户")
    public void insert(User u) {
        userService.insert(u);
    }

    @PostMapping("update")
    @ApiOperation("修改用户")
    public void update(User u) {
        userService.update(u);
    }

}
