import java.util.HashMap;;
public class Functinality extends Contact{
    public Functinality() {
        super(null, null, null, null); // Call the superclass constructor
    }
    HashMap<String,Contact> contactList = new HashMap<>();
    //Function to Add Contacts
    public String addContact(String name,String phone,String email, String timeStamp){
        if(contactList.containsKey(name)) return "Contact list already contains "+name+"! Please change/update name and TRY AGAIN!";
        if(name.isEmpty()||phone.isEmpty()) return "Name and Phone Number are required";
        if(!phone.matches("\\d{10}")) return "Phone Number should be 10 digits";
        contactList.put(name,new Contact(name,phone,email,timeStamp));
        return "Phone Number is Saved!";
    }
    public void viewContacts(){
        if(contactList.isEmpty()) System.err.println("No Contacts");
        System.out.println("Name -----> Phone Number----->email----->----->Last Updated");
        contactList.forEach((name,contact)->{
            
            System.out.println(contact.getName()+"----->"+contact.getPhone()+"----->"+contact.getEmail()+"----->"+contact.getTimeStamp());
            
        });
    }
    
}
