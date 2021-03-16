package com.bs.entity;

/**
 * @author zzf
 * @description
 * @create: 2021-03-15 18:15
 */
public class User {
    /**
     *员工id
     */
    private int uid;
    /**
     *员工姓名
     */
    private  String user_name;
    /**
     *员工年龄
     */
    private int age;
    /**
     *员工性别
     */
    private  String sex;
    /**
     *用户密码
     */
    private String password;

    public User(int uid, String user_name, int age, String sex, String password) {
        this.uid = uid;
        this.user_name = user_name;
        this.age = age;
        this.sex = sex;
        this.password = password;
    }

    public User() {
    }

    public int getUid() {
        return uid;
    }

    public String getUser_name() {
        return user_name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getPassword() {
        return password;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
            "uid=" + uid +
            ", user_name='" + user_name + '\'' +
            ", age=" + age +
            ", sex='" + sex + '\'' +
            ", password='" + password + '\'' +
            '}';
    }
}
