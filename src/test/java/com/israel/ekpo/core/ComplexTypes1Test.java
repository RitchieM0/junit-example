package com.israel.ekpo.core;

import org.junit.Assert;

import org.junit.Test;

/**
 * Comparison of Objects
 *
 * @author iekpo
 *
 */
public class ComplexTypes1Test {

    @Test
    public void compareStudents1() {

        // In this test we are going to create 2 students with the same property values and compare them
    	Student student1 = new Student();
    	Student student2 = new Student();
    	
    	student1.setName("Joshua Ekpo");
    	student2.setName("Joshua Ekpo");
    	
    	student1.setAge(5);
    	student2.setAge(5);
    	
    	student1.setGender("male");
    	student2.setGender("male");
    	
    	Assert.assertEquals(student1, student2);
    	
    }

    @Test
    public void compareStudents2() {

        // In this test we are going to create 2 students with only one different property and compare them
    	
    	Student student1 = new Student();
    	Student student2 = new Student();
    	
    	student1.setName("Joshua Ekpo");
    	student2.setName("Joshua Ekpo");
    	
    	student1.setAge(5);
    	student2.setAge(5);
    	
    	student1.setGender("male");
    	student2.setGender("male");
    	
    	Assert.assertNotEquals(student1, student2);
    }

    @Test
    public void compareEmployees1() {

    }

    @Test
    public void compareHouseWifes1() {

    }
}
