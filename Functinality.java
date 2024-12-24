import java.util.HashMap;;
public class Functinality {
    HashMap<String,String> contactList = new HashMap<>();

    public int addContact(String name,String phone){
        if(contactList.containsKey(name)) return 1; 
        contactList.put(name,phone);
        return 0;
    }
    public void viewContacts(){
        if(contactList.isEmpty()) System.err.println("No Contacts");
        contactList.forEach((name,phone)->{
            System.out.println("Name -----> Phone Number");
            System.out.println(name+"----->"+phone);
            
        });
    }
    
}
