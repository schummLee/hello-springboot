package cn.edu.neusoft.hellospringboot;

import cn.edu.neusoft.hellospringboot.domain.User;
import cn.edu.neusoft.hellospringboot.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserMapperTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void insert() {
        User u = new User();
        u.setAge(11);
        u.setSex("男");
        u.setAddress("北京");
        u.setUsername("bb1");
        u.setPassword("123");
        userMapper.insert(u);
    }

    @Test
    public void updateAge() {
        User u = new User();
        u.setAge(100);
        u.setId(8L);
        userMapper.updateAge(u);
    }

    @Test
    public void deleteById() {
        int num = userMapper.deleteById(8L);
        System.out.println(num);
    }

    @Test
    public void getById() {
        User u = userMapper.getById(1L);
        System.out.println(u.getUsername());
    }

    @Test
    public void getUserById() {
        User u = userMapper.getUserById(3L);
        System.out.println(u.getUsername());
    }

    @Test
    public void getByAge() {
        List<User> uList = userMapper.getByAge(18);
        System.out.println(uList.size());
    }
}
