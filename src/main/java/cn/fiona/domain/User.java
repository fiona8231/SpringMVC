package cn.fiona.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    private String username;
    public int age;
    public Date birthday;
    public User() {
    }

    public User(String username, Integer age, Date birthday) {
        this.username = username;
        this.age = age;
        this.birthday = birthday;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}
