package ApplicationPhone;

public class Phone implements AllPhones {

    String manufacturer;
    String model;

    String sms;

    public Phone() {
    }

    @Override
    public Contact addNewContact(Contact contact) {
        return contact;
    }

    public Contact displayContact(Contact contact) {
        return contact;
    }

    @Override
    public void sendMessage(Contact contact, String sms) {
    }
    @Override
    public String getMessage(String sms) {
        return this.sms;
    }

    public String getSms() {
        return sms;
    }

    @Override
    public String toString() {
        return "Phone: " + manufacturer + " " + model + '\n';
    }

    public Phone(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }


}
