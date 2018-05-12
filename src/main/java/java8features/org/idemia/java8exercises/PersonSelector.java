package java8features.org.idemia.java8exercises;

import java.util.ArrayList;
import java.util.List;

import java8features.org.idemia.java8exercises.model.Person;
import java8features.org.idemia.java8exercises.strategyPattern.PersonPredicate;

public class PersonSelector {
	List<Person> personsFiltered = new ArrayList<Person>();
	
	public List<Person> filterPersonsByNameWithAorM(List<Person> persons) {
		for(Person person: persons) {
			if( person.getName().startsWith("a") || person.getName().startsWith("m") ) {
				personsFiltered.add(person);
			}
		}
		return personsFiltered;
	}
	
	public List<Person> filterPersonsByAgeAndLengthofTheName(List<Person> persons) {
		for(Person person: persons) {
			if( person.getName().length() > 5 && person.getAge() > 20 ) {
				personsFiltered.add(person);
			}
		}
		return personsFiltered;
	}
	
	public List<Person> filterPerson(List<Person> persons, PersonPredicate personPredicate) {
		for(Person person: persons) {
			if( personPredicate.filterPerson(person) ) {
				personsFiltered.add(person);
			}
		}
		return personsFiltered;
	}

}
