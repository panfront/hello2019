package com.hollycrm.test.objecttransfer;

import java.io.Serializable;

public class Student implements Serializable{
    private static final long serialVersionUID = 3023306889871029865L;
    private  Integer id = 0;
    private  String name;
    private  String gender;
    private transient  Integer age=0;

    public Student(Integer id, String name, String gender, Integer age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  String getGender() {
        return gender;
    }

    public  void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}