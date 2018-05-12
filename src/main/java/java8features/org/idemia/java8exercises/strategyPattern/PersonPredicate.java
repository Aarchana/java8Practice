package java8features.org.idemia.java8exercises.strategyPattern;

import java8features.org.idemia.java8exercises.model.Person;

public interface PersonPredicate {
	public boolean filterPerson(Person person);
}