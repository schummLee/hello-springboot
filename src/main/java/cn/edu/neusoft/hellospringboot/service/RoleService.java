package cn.edu.neusoft.hellospringboot.service;

import cn.edu.neusoft.hellospringboot.domain.Role;
import com.github.pagehelper.PageInfo;

public interface RoleService {
    void insert(Role role);

    void update(Role role);

    void delete(Long id);

    PageInfo<Role> page(Integer pageNum, Integer pageSize);
}
