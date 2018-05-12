package java8features.org.idemia.java8exercises.strategyPattern;

import java8features.org.idemia.java8exercises.model.Person;

public class PersonByAgeAndLength implements PersonPredicate, GenericPredicate<Person> {

	public boolean filterPerson(Person person) {
		return  person.getName().length() > 5 && person.getAge() > 20 ;
	}

	public boolean filter(Person person) {
		return person.getName().length() > 5 && person.getAge() > 20 ; 
	}

}
