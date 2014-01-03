package com.israel.ekpo.people;

public class Person {

	private static final int DRINKING_AGE = 21;
	
	private static final int ADULT_AGE = 18;
	
	private static final int TEEN_AGE  = 13;
	
	private static final int INFANT_AGE = 2;
	
    protected String name;

    protected int age;

    protected String gender;

    protected boolean married;

    public Person() {

        this.name = "";
        this.age  = 18;
        this.gender = "Male";
        this.married = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isAdult() {
    
    	return this.age >= ADULT_AGE;
    }
    
    public boolean isInfant() {
    	return this.age <= INFANT_AGE;
    }
    
    public boolean isAllowedToDrinkAlcohol() {
    	return this.age >= DRINKING_AGE;
    }
    
    public boolean isAllowedToSmokeCigarette() {
    	return this.age >= ADULT_AGE;
    }
    
    public boolean isTeenager() {
    	return this.age >= TEEN_AGE && this.age < ADULT_AGE;
    }
    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}
