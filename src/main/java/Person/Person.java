package Person;

public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void print() {
        System.out.println("Persons by age: " + name + ", " + age + " ani");
    }

    @Override
    public int compareTo(Person person) {
        return this.age - person.getAge();
    }

    @Override
    public boolean equals(Object obj) {
        return name.equals(((Person) obj).getName());
    }

}
