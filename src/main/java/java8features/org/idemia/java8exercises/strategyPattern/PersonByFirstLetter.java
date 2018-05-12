package java8features.org.idemia.java8exercises.strategyPattern;

import java8features.org.idemia.java8exercises.model.Person;

public class PersonByFirstLetter implements PersonPredicate, GenericPredicate<Person> {

	public boolean filter(Person person) {
		return person.getName().startsWith("a") || person.getName().startsWith("m");
	}

	public boolean filterPerson(Person person) {
		 return person.getName().startsWith("a") || person.getName().startsWith("m");
	}

}
