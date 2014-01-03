package com.israel.ekpo.core;

import com.israel.ekpo.people.Person;

public class Student extends Person {

    private int studentId;

    public Student() {
        super();
        this.studentId = 0;
    }

    @Override
    public boolean equals(Object o) {

        Student p = (Student) o;

        boolean equals = p.getName().equals(this.getName()) &&
                p.getAge() == this.getAge() &&
                p.getStudentId() == this.getStudentId() &&
                p.getGender().equals(this.getGender()) &&
                p.isMarried() == this.isMarried();

        return equals;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
