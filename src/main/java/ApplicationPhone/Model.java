package ApplicationPhone;

public class Model extends Manufacturer{

    String model;

    @Override
    public String toString() {
        return "Model: " + model + '\n';

    }
    public Model(String model) {
        super(model);
        this.model = model;
    }

}


