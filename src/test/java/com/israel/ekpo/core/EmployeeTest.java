package com.israel.ekpo.core;

import org.junit.Assert;


import org.junit.Test;

public class EmployeeTest {

	@Test
	public void testEmployeeAgeLimits1() {
	
		// In this method, create an employee of age 19 and retrieve the age after it has been specified.
		// After the age is retrieved from the object, do the following tests
		
		// (a) Verify that the employee age is actually the same as what we specified on the object
		// (b) Verify that the employee is allowed to smoke
		// (c) Verify that the employee is not a teenager
		// (d) Verify that the employee is not an infant
		// (e) Verify that the employee is an adult
		// (f) Verify that the employee is not allowed to drink alcohol
		
		Employee emp = new Employee();
		emp.setAge(19);
		
		Assert.assertEquals(19, emp.getAge());
		Assert.assertTrue(emp.isAllowedToSmokeCigarette());
		Assert.assertFalse(emp.isTeenager());
		Assert.assertFalse(emp.isInfant());
		Assert.assertTrue(emp.isAdult());
		Assert.assertFalse(emp.isAllowedToDrinkAlcohol());
	}
	
	@Test
	public void testEmployeeAgeLimits2() {
		
		// Repeat same as in method testEmployeeAgeLimits1 but for age 15
	}
	
	
	
	
	@Test 
	public void testEmployeeName() {
		
		//create an instance of the Employee class
		Employee emp = new Employee();
		
		//Specify the employee name for the object
		emp.setName("Femi");
		
		//Fetch the employee name from the object
		String employeeName = emp.getName();
		
		
		//Verify that the retrieved value for the name is accurate
		Assert.assertEquals("Femi", employeeName);
	}
	
	
    @Test
    public void testEmployeeIdValue() {
    	
    	// Type variable = value;
    	// ClassName variableName = new ClassName();
    	Employee emp = new Employee();
    	
    	// To use any method on the object: objectName.methodName();
    	emp.setEmployeeId(200);
    	
    	int actualEmpolyeeId = emp.getEmployeeId();
    	
    	Assert.assertEquals(200, actualEmpolyeeId);
    	
    }
    
    @Test
    public void testEmployeeMaritalStatus() {

    	// Type variable = value;
    	// ClassName variableName = new ClassName();
    	Employee emp = new Employee();
    	
    	// To use any method on the object: objectName.methodName();
    	emp.setMarried(true);
    	
    	boolean actualEmployeeMaritalStatus = emp.isMarried();
    	
    	Assert.assertEquals(true, actualEmployeeMaritalStatus);
    	
    	
    }
}
