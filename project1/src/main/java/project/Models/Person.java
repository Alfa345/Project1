package project.Models;

public class Person {

    private int ID;
    private String Name;
    private String Address;
    private String Contact;  
   

    public Person(int ID, String Name, String Address, String Contact) {
        this.ID = ID;
        this.Name = Name;
        this.Address = Address;
        this.Contact = Contact;  
       
    }

    public String getInfos() {
        return "ID: " + ID +
         ", Name: " + Name +
          ", Address: " + Address +
           ", Contact: " + Contact;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public String getContact() {
        return Contact;
    }
 

}
