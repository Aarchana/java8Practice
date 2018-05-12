package java8features.org.idemia.java8exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java8features.org.idemia.java8exercises.model.Person;
import java8features.org.idemia.java8exercises.strategyPattern.GenericPredicate;
import java8features.org.idemia.java8exercises.strategyPattern.PersonByAgeAndLength;
import java8features.org.idemia.java8exercises.strategyPattern.PersonByFirstLetter;
// import java8features.org.idemia.java8exercises.strategyPattern.PersonPredicate;

/**
 * filter list of Person based on defined criteria
 *
 */
public class App 
{
	public static List<Person> persons = Arrays.asList(new Person("meera", 20), new Person("sameera", 40), new Person("hana", 30), new Person("arc", 44));
	
    public static void main( String[] args )
    {	
    	GenericPredicate<Person> personPredicateByAgeAndNameLength =  new GenericPredicate<Person>() {
	
	    		public boolean filter(Person person) {
	    			return person.getName().length() > 5 && person.getAge() > 20;
	    		} 
	    	};
	    	
	    	GenericPredicate<Person> personPredicateByfirstLetter =  new GenericPredicate<Person>() {
	    		
	    		public boolean filter(Person person) {
	    			return person.getName().startsWith("a") || person.getName().startsWith("m");
	    		} 
	    	};
	    	System.out.println("\n Results from Anonymous class: \n");
	    	
    	 	List<Person> filteredPersonsByAgeAndNameLength = filterPersons(persons, personPredicateByAgeAndNameLength);
    	 	System.out.println("The list of persons with age greater than 20 and name length greater than 5 are \n" +  filteredPersonsByAgeAndNameLength);
    	 	
    	 	List<Person> filteredPersonsByletter = filterPersons(persons, personPredicateByfirstLetter);
    	 	System.out.println("The list of persons with letter starting a or m are \n" +  filteredPersonsByletter);
    	 	
    	 	System.out.println("\n Results from strategy pattern: \n");
    	 	
    	 	List<Person> filteredPersons = filterPersons(persons, new PersonByAgeAndLength());
    	 	System.out.println("The list of persons with age greater than 20 and name length greater than 5 are \n" +  filteredPersons);
    	 	
    	 	List<Person> filteredPersonsByfirstLetter = filterPersons(persons, new PersonByFirstLetter());
    	 	System.out.println("The list of persons with letter starting a or m are  \n" +  filteredPersonsByfirstLetter);
    	 	
    	 	System.out.println("\n Results from standalone methods: \n");
    	 	
    	 	List<Person> filteredPersonsy = new PersonSelector().filterPersonsByAgeAndLengthofTheName(persons);
    	 	System.out.println("The list of persons with age greater than 20 and name length greater than 5 are \n" +  filteredPersonsy);
    	 	List<Person> filteredPersonsx = new PersonSelector().filterPersonsByNameWithAorM(persons);
    	 	System.out.println("The list of persons with letter starting a or m are  \n" +  filteredPersonsx);

    }
    
    public static List<Person> filterPersons(List<Person> personsList, GenericPredicate<Person> personPredicate) {
    		List<Person> personsPercriteria = new ArrayList<Person>();
    		for(Person person: personsList) {
    			if(personPredicate.filter(person)) {
    				personsPercriteria.add(person);
    			}
    		}
    		return personsPercriteria;
    }
}
