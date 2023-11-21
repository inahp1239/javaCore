package org.example;


// here we are creating a class with two private String variables firstName and secondName 
// We will using this class as a bean
// a bean class have a getter and setter in it

public class User {
	private String firstName ;
	private String lastName ;
	
	public User(){
		firstName = "first Name";
		lastName = "last Name";
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
