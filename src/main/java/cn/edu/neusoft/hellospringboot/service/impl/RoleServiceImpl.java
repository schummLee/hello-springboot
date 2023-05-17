package cn.edu.neusoft.hellospringboot.service.impl;

import cn.edu.neusoft.hellospringboot.domain.Role;
import cn.edu.neusoft.hellospringboot.mapper.RoleMapper;
import cn.edu.neusoft.hellospringboot.service.RoleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public void insert(Role role) {
        roleMapper.insert(role);
    }

    @Override
    public void update(Role role) {
        roleMapper.updateByPrimaryKeySelective(role);
    }

    @Override
    public void delete(Long id) {
        roleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public PageInfo<Role> page(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Role> roleList = roleMapper.list();
        return new PageInfo<>(roleList);
    }
}
