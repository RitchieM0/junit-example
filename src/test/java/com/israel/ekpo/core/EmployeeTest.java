package com.israel.ekpo.core;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

    private Employee employee;

    @Before
    public void setUp(){

        this.employee = new Employee();

        this.employee.setEmployeeId(4355039);
        this.employee.setName("Joshua Ekpo");
        this.employee.setAge(5);
    }

    @Test
    public void testEmployeeProperties() {

        Assert.assertFalse(employee.isMarried());
        Assert.assertEquals(5, employee.getAge());
    }
}
