package com.israel.ekpo.core;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CampusTest {

    private Employee employee;

    private Employee employee2;

    private Student student;

    @Before
    public void setUp(){

        this.employee = new Employee();
        this.employee2 = new Employee();
        this.student  = new Student();

        this.employee.setEmployeeId(4355039);
        this.employee.setName("Joshua Ekpo");
        this.employee.setAge(5);

        this.employee2.setEmployeeId(4355039);
        this.employee2.setName("Joshuo Ekpo");
        this.employee2.setAge(5);

        this.student.setStudentId(9870234);
        this.student.setName("Michael Edewor");
        this.student.setMarried(true);
        this.student.setAge(44);

    }

    @Test
    public void testEmployeeProperties() {

        Assert.assertFalse(employee.isMarried());
        Assert.assertEquals(5, employee.getAge());
    }

    @Test
    public void testStudentProperties() {
        Assert.assertTrue(student.isMarried());
        Assert.assertEquals(44, student.getAge());
    }

    @Test
    public void compareEmployees() {
        Assert.assertEquals(this.employee2, this.employee);
    }

    @Test
    public void testOffice() {
        Assert.assertTrue(employee2.isMarried());
        Assert.assertEquals(44, employee2.getAge());
    }
}
