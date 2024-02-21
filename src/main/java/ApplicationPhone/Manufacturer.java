package ApplicationPhone;

public class Manufacturer extends Phone {

    String manufacturer;

    @Override
    public String toString() {
        return "Manufacturer: " + manufacturer + '\n';
    }

    public Manufacturer(String manufacturer) {
        this.manufacturer = manufacturer;



    }
}
