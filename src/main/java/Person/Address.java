package Person;

public class Address {

    private String location;

    public Address(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return location;
    }
}

