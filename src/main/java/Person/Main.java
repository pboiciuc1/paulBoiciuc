package Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        final Person person1 = new Person("Vasile", 30);
        final Person person2 = new Person("Ion", 25);

        Set<Person> persons = new TreeSet<>();

        persons.add(person1); //30
        persons.add(person2); //25

        System.out.println();
        for (Person person : persons) {
            person.print();
        }

        System.out.println();
        System.out.println("The persons have the same name: " + person1.equals(person2));
        System.out.println();


        final Tennis tennis = new Tennis("Tennis", 2);
        final Swimming swimming = new Swimming("Swimming", 2);
        final Skiing skiing = new Skiing("Skiing", 1);

        List<Hobby> hobbyList = new ArrayList<>();
        hobbyList.add(tennis);
        hobbyList.add(swimming);
        hobbyList.add(skiing);

        System.out.println("List of hobbies:");
        for (Hobby hobby : hobbyList) {
            hobby.print();
        }
        System.out.println();

        Address country1 = new Address("Romania");
        Address country2 = new Address("Bulgaria");
        Address country3 = new Address("Ungaria");


        Map<Address, Hobby> hobbies = new HashMap();

        hobbies.put(country1, tennis);
        hobbies.put(country2, swimming);
        hobbies.put(country3, skiing);

        System.out.println("These are all the countries where the hobbies can be practiced");
        for (Address country : hobbies.keySet()) {
            System.out.println(country);
        }

        System.out.println();
        System.out.println("These are all the Hobbies");
        for (Hobby person : hobbies.values()) {
            person.print();
        }

        System.out.println();
        System.out.println("These are all the countries where the hobbies can be practiced:");
        for (Map.Entry<Address, Hobby> personEntry : hobbies.entrySet()) {
            System.out.println(personEntry.getKey() + " ");
            personEntry.getValue().print();
            System.out.println();
        }

    }
}

