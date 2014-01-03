package com.israel.ekpo.core;

import com.israel.ekpo.people.Person;


public class Employee extends Person {

    private int employeeId;

    public Employee() {
        super();
        this.employeeId = 0;
    }

    @Override
    public boolean equals(Object o) {

        Employee p = (Employee) o;

        boolean equals = p.getName().equals(this.getName()) &&
                p.getAge() == this.getAge() &&
                p.getEmployeeId() == this.getEmployeeId() &&
                p.getGender().equals(this.getGender()) &&
                p.isMarried() == this.isMarried();

        return equals;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
