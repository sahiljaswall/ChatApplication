import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;


public class chatManagement extends Functinality{
    //Functinality fun=new Functinality();
    LinkedList<Message> conversation=new LinkedList<>();
    HashMap<String,LinkedList<Message>> chatManager = new HashMap<>();
    Contact me=new Contact("Sahil Jaswal","987612XXXX","sahiljaswal3@gmail.com","10/04/2025");
    Scanner scanner=new Scanner(System.in);
    public String sendMessage(){
        System.out.println("Sending to: ");
        String name =scanner.nextLine();
        System.out.println(checkContactList(name));
        System.out.println("\nEnter your text: ");
        String message = scanner.nextLine();
        String timeStamp = LocalDate.now().toString();//edit the date and time
        conversation.offer(new Message(message,contactList.get(name),me,timeStamp));
        saveConversation(conversation.peek());
        System.out.println(conversation.peek().toString());
        conversation.clear();
        return "Message sent";
    }
    public Set<String> viewConversation(){
        //if(chatManager.isEmpty()) return "No Conversation Found" ;
        return chatManager.keySet();//edit
    }
    public void saveConversation(Message mes){
        if(!chatManager.containsKey(mes.getSender())) chatManager.put(mes.getReceiver(), new LinkedList<>());
        chatManager.get(mes.getReceiver()).add(mes);
    }
    public String openConversation(String name){
        if(!chatManager.containsKey(name)) return "No Conversation Found";
        return "-------"+chatManager.get(name).peek().toString()+"-------";
    }
}
