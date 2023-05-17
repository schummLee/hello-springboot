package cn.edu.neusoft.hellospringboot.service;

import cn.edu.neusoft.hellospringboot.domain.User;
import cn.edu.neusoft.hellospringboot.vo.UserQueryBO;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface UserService {

    public User getById(Long id);

    public User getByUsername(String username);

    List<User> getAllUser();

    void insert(User u);

    void update(User u);

    List<User> list(User u);

    PageInfo<User> page(UserQueryBO u);
}
