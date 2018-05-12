//package java8features.org.idemia.java8exercises;
//
//import java.util.Arrays;
//import java.util.List;
//
//import java8features.org.idemia.java8exercises.model.Person;
//import java8features.org.idemia.java8exercises.strategyPattern.PersonByAgeAndLength;
//import static java8features.org.idemia.java8exercises.PersonSelector.*;
//
///**
// * Unit test for Person Selector
// */
//public class AppTest {
//	@Before
//	List<Person> persons;
//	public void init() {
//		// Given list of persons
//		initializePersonArray();
//	}
//	public void initializePersonArray() {
//		persons = Arrays.asList(new Person("meera", 20), new Person("sameera", 40), new Person("hana", 30), new Person("arc", 44));
//	}
//	
//	@Test
//	public void filterByPersonPredicate() {
//		List<person> filteredPersons = filterPerson(persons, new PersonByAgeAndLength());
//		for(Person person: filteredPersons) {
//			assertThat(person.getName().length()).isGreaterThan(5);
//			assertThat(person.getAge()).isGreaterThan(20);
//		}
//		
//	}
//}
