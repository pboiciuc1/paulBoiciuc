import ApplicationPhone.*;

public class Main {

    String phone;
    static void main(String[] args) {

        Phone brand1 = new Manufacturer("Samsung");
        Phone brand2 = new Manufacturer("Apple");

        System.out.println(STR."\{brand1}\{brand2}");

        Phone model1 = new Model("Galaxy S22");
        Phone model2 = new Model("Flip 5");
        Phone model3 = new Model("iPhone 14");
        Phone model4 = new Model("iPhone SE");

        System.out.println(STR."\{model1}\{model2}\{model3}\{model4}");

        Phone phone1 = new Phone("Samsung", "Galaxy S22");
        Phone phone2 = new Phone("Apple", "iPhone 14");

        System.out.println(STR."The 2 phones:\n \{phone1} \{phone2}");

        Contact contact1 = phone1.addNewContact(new Contact("1", "0949111000", "Marcel", "Avram"));
        Contact contact2 = phone1.addNewContact(new Contact("2", "0944503450", "Costel", "Escu"));

        System.out.println(phone1 + "" + contact1 + '\n' + contact2);
        System.out.println();

        Contact contact3 = phone2.addNewContact(new Contact("1", "0949111000", "Viorel", "Ilici"));
        Contact contact4 = phone2.addNewContact(new Contact("2", "0944503450", "Ionel", "Rus"));

        System.out.println(phone2 + "" + contact3 + '\n' + contact4);
        System.out.println();

        System.out.println();

// Displaying Contacts
        System.out.println(phone1.displayContact(contact1));
        System.out.println(phone1.displayContact(contact2));
        System.out.println();

//And/or

        Contact[] contactsPhone2 = {contact3, contact4};

        for (Contact contact: contactsPhone2) {
            System.out.println(contact.getContactIndex() + ". " + contact.getFirstName() + " " + contact.getLastName() + " - " + contact.getPhoneNumber());
        }

        phone1.sendMessage(contact1, "this is text 1 we are sending");
        phone1.sendMessage(contact2, "this is text 2 we are sending");

        System.out.println(phone1.getMessage(phone1.getSms()));


    }
}









