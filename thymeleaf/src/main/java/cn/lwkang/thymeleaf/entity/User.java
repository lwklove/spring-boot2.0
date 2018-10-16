package cn.lwkang.thymeleaf.entity;

public class User {
    private String name;
    private int age;
    private String gender;

    public User() {
    }

    public String getName() {
        return name;
    }

    public User(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
