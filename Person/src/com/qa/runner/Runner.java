package com.qa.runner;

import com.qa.domain.Person;

import com.qa.handler.PersonHandler;

public class Runner extends Person {

	public static void main(String[] args) {

		// Creates a new ArrayList named people

		PersonHandler people = new PersonHandler();

		// Creates Person objects

		Person personOne = new Person("Liam Thomas", 26, "Teacher");
		Person personTwo = new Person("William Partridge", 28, "Accountant");
		Person personThree = new Person("Nicole Davies", 31, "Solicitor");
		Person personFour = new Person("Isabelle Flinch", 43, "Chef");

		// Adds the newly created Person objects to the people list

		people.addPerson(personOne);
		people.addPerson(personTwo);
		people.addPerson(personThree);
		people.addPerson(personFour);

		// Prints people List

		people.printList();

		// Search and Print by name
		System.out.println("\n =================================");
		System.out.println(people.searchByName("Liam Thomas"));

		// Search and Print by name for name not on list
		System.out.println("\n ================================= \n");
		System.out.println(people.searchByName("Liam Jhomas"));

		// Print Person object using toStiring method
		System.out.println("\n =================================");
		System.out.println(personFour.toString());

	}

}
