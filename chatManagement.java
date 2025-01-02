import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;


public class chatManagement extends Functinality{
    //Functinality fun=new Functinality();
    LinkedList<Message> conversation=new LinkedList<>();
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
        System.out.println(conversation.peek().toString());
        return "Message sent";
    }
    public String viewConversation(){
        if(!conversation.isEmpty()) return "No Conversation Found" ;
        return conversation.toString();//edit
    }
}
