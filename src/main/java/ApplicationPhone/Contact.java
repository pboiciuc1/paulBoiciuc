package ApplicationPhone;

public class Contact {

    String contactIndex;
    String phoneNumber;
    String firstName;
    String lastName;

    public Contact(String contactIndex, String phoneNumber, String firstName, String lastName) {
        this.contactIndex = contactIndex;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getContactIndex() {
        return contactIndex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Contact " + contactIndex + ". " + firstName + " " + lastName + " - " + phoneNumber;
    }
}
