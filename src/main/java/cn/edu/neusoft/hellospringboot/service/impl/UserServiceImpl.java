package cn.edu.neusoft.hellospringboot.service.impl;

import cn.edu.neusoft.hellospringboot.domain.User;
import cn.edu.neusoft.hellospringboot.mapper.UserMapper;
import cn.edu.neusoft.hellospringboot.service.UserService;
import cn.edu.neusoft.hellospringboot.vo.UserQueryBO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getById(Long id) {
        return userMapper.getById(id);
    }

    @Override
    public User getByUsername(String username) {
        return userMapper.getByUsername(username);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public void insert(User u) {
        userMapper.insert(u);
        System.out.println(u.getId());
    }

    @Override
    public void update(User u) {
        userMapper.update(u);
    }

    @Override
    public List<User> list(User u) {
        return userMapper.list(u);
    }

    @Override
    public PageInfo<User> page(UserQueryBO u) {
        PageHelper.startPage(u.getPageNum(), u.getPageSize());
        List<User> userList = userMapper.list(u);
        return new PageInfo<User>(userList);
    }


}
