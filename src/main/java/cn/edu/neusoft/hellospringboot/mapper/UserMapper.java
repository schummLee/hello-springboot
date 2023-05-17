package cn.edu.neusoft.hellospringboot.mapper;

import cn.edu.neusoft.hellospringboot.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from t_user where id = #{id}")
    public User getById(Long id);

    public User getUserById(Long id);

    @Select("select * from t_user where username = #{username}")
    User getByUsername(String username);

    @Select("select * from t_user where age = #{age}")
    public List<User> getByAge(int age);

//    @Insert("insert into t_user values(null, #{username}, #{password}, #{age}, #{sex}, #{address})")
//    @Options(useGeneratedKeys = true, keyProperty = "id")
    public int insert(User user);



    @Update("update t_user set age = #{age} where id = #{id}")
    public int updateAge(User user);

    @Delete("delete from t_user where id = #{id}")
    public int deleteById(Long id);

    @Select("select * from t_user")
    List<User> getAllUser();

    void update(User u);

    List<User> list(User u);
}
