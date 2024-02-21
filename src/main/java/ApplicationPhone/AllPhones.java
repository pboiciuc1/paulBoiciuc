package ApplicationPhone;
public interface AllPhones {

    Contact addNewContact(Contact contact);
    Contact displayContact(Contact contact);
    void sendMessage(Contact contact, String sms);
    String getMessage(String sms);

}
//    make a call
//    see all calls history


