package com.qa.handler;

import java.util.ArrayList;

import java.util.List;

import com.qa.domain.Person;

public class PersonHandler {

	public List<Person> people = new ArrayList<>();

	// Default Constructor
	public PersonHandler() {
		super();
	}

	// Everything Constructor
	public PersonHandler(List<Person> people) {
		this.people = people;
	}

	// Add Person Method

	public void addPerson(Person person) {
		this.people.add(person);
	}

	// Remove Person Method
	public void removePerson(Person person) {
		this.people.remove(person);
	}

	// Search By Name Variable Method

	public Person searchByName(String name) {
		for (Person p : people) {
			if (p.getName().equalsIgnoreCase(name)) {
				return p;

			}
		}
		System.out.println("This list does not have anyone by the name of " + name + ".");
		return null;
	}

	// Print by name using Search method

	public void printInfo(String name) {
		((PersonHandler) this.people).searchByName(name);
	}

	// Print Whole List Method

	public void printList() {
		for (Person p : people) {
			System.out.println(p);
		}

	}
}
