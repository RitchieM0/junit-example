package com.israel.ekpo.core;

import com.israel.ekpo.people.Person;


public class Employee extends Person {

	private int employeeId;

    public Employee() {
        super();
        this.employeeId = 0;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
