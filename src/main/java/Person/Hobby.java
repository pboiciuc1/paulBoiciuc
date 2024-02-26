package Person;

public class Hobby {

    private String hobby;
    private int frequency;

    public Hobby(String hobby, int frequency) {
        this.hobby = hobby;
        this.frequency = frequency;
    }

    public void print() {
        System.out.println(hobby + ", practiced " + frequency + " /week");
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "hobby='" + hobby + '\'' +
                ", frequency=" + frequency +
                '}';
    }
}
