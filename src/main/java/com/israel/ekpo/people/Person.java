package com.israel.ekpo.people;

public class Person {

    protected String name;

    protected int age;

    protected String gender;

    protected boolean married;

    public Person() {

        this.name = "";
        this.age  = 18;
        this.gender = "Male";
        this.married = false;
    }

    public String getName() {
        return name;
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

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}
