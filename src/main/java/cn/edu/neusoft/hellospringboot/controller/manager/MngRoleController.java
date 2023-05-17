package cn.edu.neusoft.hellospringboot.controller.manager;

import cn.edu.neusoft.hellospringboot.domain.Role;
import cn.edu.neusoft.hellospringboot.service.RoleService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("manager/role")
@Api(tags = "【管理员】角色管理接口")
public class MngRoleController {

    @Autowired
    private RoleService roleService;

    @ApiOperation("新增角色")
    @PostMapping("insert")
    public Long insert(Role role) {
        roleService.insert(role);
        return role.getRoleId();
    }

    @ApiOperation("修改角色")
    @PostMapping("update")
    public void update(Role role) {
        roleService.update(role);
    }

    @ApiOperation("删除角色")
    @DeleteMapping("delete")
    public void delete(Long id) {
        roleService.delete(id);
    }

    @ApiOperation("分页查询角色列表")
    @GetMapping("page")
    public PageInfo<Role> page(Integer pageNum, Integer pageSize) {
        return roleService.page(pageNum, pageSize);
    }
}
