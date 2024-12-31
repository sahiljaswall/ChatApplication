import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
public class Functinality{
    HashMap<String,Contact> contactList = new HashMap<>();
    Stack<Contact> st=new Stack<>();
    Contact me=new Contact("Sahil Jaswal","987612XXXX","sahiljaswal3@gmail.com","10/04/2025");
    LinkedList<Message> conversation=new LinkedList<>();
    Scanner scanner=new Scanner(System.in);
    //Function to Add Contacts
    public String addContact(String name,String phone,String email, String timeStamp){
        if(contactList.containsKey(name)) return "Contact list already contains "+name+"! Please change/update name and TRY AGAIN!";
        if(name.isEmpty()||phone.isEmpty()) return "Name and Phone Number are required";
        if(!phone.matches("\\d{10}")) return "Phone Number should be 10 digits";
        contactList.put(name,new Contact(name,phone,email,timeStamp));
        return "Phone Number is Saved!";
    }
    //Function to View Contacts
    public void viewContacts(){
        if(contactList.isEmpty()) System.out.println("No Contacts");
        System.out.println("Name -----> Phone Number----->email----->----->Last Updated");
        contactList.forEach((name,contact)->{
            
            System.out.println(contact.getName()+"----->"+contact.getPhone()+"----->"+contact.getEmail()+"----->"+contact.getTimeStamp());
            
        });
    }
    //Update Contact
    public String manageContact(String name){
        if(!contactList.containsKey(name)) return "No Contact Found";
        deleteContact(name);
        return viewAddContacts();
    }
    //Delete Contact
    public String deleteContact(String name){
        if(!contactList.containsKey(name))  System.out.println("Contact Not Found");
        st.push(contactList.get(name));
        contactList.remove(name);
        return(name+"'s Contact is deleted");

    }
    //View Page
    public String viewAddContacts(){
        System.out.println("1. Add Contact");
        System.out.print("Name : ");
        String name = scanner.nextLine();
        System.out.print("Phone Number : ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Email : ");
        String email = scanner.nextLine();
        String timeStamp = LocalDate.now().toString();
        return addContact(name,phoneNumber,email,timeStamp);
        
    }
    //UNDO Funtion
    public String undoDelete(){
        if(st.isEmpty()) return "Nothing Avaiable to UNDO";
        //contactList.remove(undo.getName());
        contactList.put(st.peek().getName(),st.peek());
        st.clear();
        return("Contact is added back");

    }
    public String sendMessage(){
        System.out.println("Add Contact Name: ");
        String name =scanner.nextLine();
        if(!contactList.containsKey(name))  System.out.println("Contact Not Found");
        System.out.println("Enter your text: ");
        String message = scanner.nextLine();
        String timeStamp = LocalDate.now().toString();//edit the date and time
        conversation.offer(new Message(message,contactList.get(name),me,timeStamp));
        return "Message sent";
    }
    public String autoReplyMachine(){
        
    }
    
}
