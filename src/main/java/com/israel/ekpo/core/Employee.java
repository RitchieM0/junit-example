package com.israel.ekpo.core;


public class Employee extends com.israel.ekpo.people.Person {

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
