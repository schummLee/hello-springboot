package cn.edu.neusoft.hellospringboot;

import cn.edu.neusoft.hellospringboot.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

//@RunWith(SpringRunner.class)
@SpringBootTest
class HelloSpringBootApplicationTests {

    @Autowired
    private HelloController helloController;

    @Test
    void contextLoads() {
        System.out.println(helloController.hello("王五"));
    }

}
