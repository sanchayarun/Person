package com.qa.domain;

public class Person {

	// Variables

	private String name;
	private int age;
	private String jobTitle;

	// Default Constructor

	public Person() {

	}

	// Everything Constructor

	public Person(String name, int age, String jobtitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobtitle;
	}

	// Getter and Setter

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

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobtitle) {
		this.jobTitle = jobtitle;
	}

	// toString() Method for Person

	@Override
	public String toString() {
		return "\n Name = " + name + ", \n Age = " + age + ",\n Job Title = " + jobTitle;
	}

}
