package com.israel.ekpo.core;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {

    private Student student;

    // This will be call before every @Test is run
    @Before
    public void setUp(){

        this.student  = new Student();

        this.student.setStudentId(9870234);
        this.student.setName("Michael Edewor");
        this.student.setMarried(true);
        this.student.setAge(44);

    }

    @Test
    public void testStudentProperties() {
        Assert.assertTrue(student.isMarried());
        Assert.assertEquals(44, student.getAge());
    }
}
