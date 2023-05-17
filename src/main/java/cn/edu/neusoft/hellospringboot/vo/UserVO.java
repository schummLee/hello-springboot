package cn.edu.neusoft.hellospringboot.vo;

import io.swagger.annotations.ApiModelProperty;

public class UserVO {
    // 用户名
    @ApiModelProperty(value = "账号", example = "xiaoli")
    private String username;
    // 密码
    @ApiModelProperty("密码")
    private String password;
    // 年龄
    @ApiModelProperty("年龄")
    private int age;
    // 性别
    @ApiModelProperty("性别")
    private String sex;

    @ApiModelProperty("地址")
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
