package com.israel.ekpo.core;

import com.israel.ekpo.people.Person;

public class Student extends Person {

    private int studentId;

    public Student() {
        super();
        this.studentId = 0;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
