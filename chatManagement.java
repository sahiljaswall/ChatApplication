import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class chatManagement extends Functinality{
    //Functinality fun=new Functinality();
    LinkedList<Message> conversation=new LinkedList<>();
    HashMap<String,LinkedList<Message>> chatManager = new HashMap<>();
    Contact me=new Contact("Sahil Jaswal","987612XXXX","sahiljaswal3@gmail.com","10/04/2025");
    Pair notify = new Pair("Default", false);
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
        if(!chatManager.containsKey(mes.getReceiver())) chatManager.put(mes.getReceiver(), new LinkedList<>());
        chatManager.get(mes.getReceiver()).add(mes);
    }
    public String openConversation(String name){
        if(!chatManager.containsKey(name)) return "No Conversation Found";
        String chat="";
        if(notify.getName()==name){
            notify.SetName("Default");
            notify.SetNotify(false);
        }
        LinkedList<Message> messages = chatManager.get(name);
        for(Message message:messages){
            chat+=message;
        }
        return chat;
    }
    public void senderReply(Message mes){
        String reply=autoReply(chatManager.get(mes.getReceiver()).peek().getText());
        String timeStamp = LocalDate.now().toString();//edit the date and time
        conversation.offer(new Message(reply,me,contactList.get(mes.getReceiver()),timeStamp));
        saveConversation(conversation.peek());
        conversation.clear();;
        notify.SetName(me.getName());
        notify.SetNotify(true);
    }

    public String autoReply(String message){
        HashMap<String, String> keywords = new HashMap<>();
        keywords.put("amazing", "Glad you think so!");
        keywords.put("assist", "Sure! Let me know what you need help with.");
        keywords.put("awesome", "Glad you think so!");
        keywords.put("bye", "Goodbye! Take care!");
        keywords.put("cool", "Glad you think so!");
        keywords.put("cya", "Goodbye! Take care!");
        keywords.put("excellent", "Thank you! I appreciate it.");
        keywords.put("fantastic", "Glad you think so!");
        keywords.put("gm", "Good morning! Have a great day!");
        keywords.put("good afternoon", "Good afternoon! Hope you're having a productive day.");
        keywords.put("good evening", "Good evening! How's it going?");
        keywords.put("good morning", "Good morning! Have a great day!");
        keywords.put("good night", "Good night! Sweet dreams!");
        keywords.put("gn", "Good night! Sweet dreams!");
        keywords.put("great", "Glad you think so!");
        keywords.put("hello", "Hello! How are you?");
        keywords.put("hey", "Hello! How are you?");
        keywords.put("hi", "Hello! How are you?");
        keywords.put("how are you", "I'm doing great! How about you?");
        keywords.put("how r u", "I'm doing great! How about you?");
        keywords.put("hru", "I'm doing great! How about you?");
        keywords.put("hy", "Hello! How are you?");
        keywords.put("my bad", "No worries! It happens.");
        keywords.put("nah", "Alright, let me know if you need anything.");
        keywords.put("no", "Alright, let me know if you need anything.");
        keywords.put("nope", "Alright, let me know if you need anything.");
        keywords.put("perfect", "Glad you think so!");
        keywords.put("see you", "Goodbye! Take care!");
        keywords.put("sorry", "No worries! It happens.");
        keywords.put("support", "Sure! Let me know what you need help with.");
        keywords.put("sup", "Not much, just here to assist you! What about you?");
        keywords.put("thank you", "You're welcome! Happy to help.");
        keywords.put("thank you so much", "My pleasure!");
        keywords.put("thanks", "You're welcome! Happy to help.");
        keywords.put("thx", "You're welcome! Happy to help.");
        keywords.put("tysm", "My pleasure!");
        keywords.put("wassup", "Not much, just here to assist you! What about you?");
        keywords.put("what's up", "Not much, just here to assist you! What about you?");
        keywords.put("wonderful", "Glad you think so!");
        keywords.put("yeah", "Great! Let’s proceed.");
        keywords.put("yes", "Great! Let’s proceed.");
        keywords.put("yep", "Great! Let’s proceed.");
        keywords.put("yup", "Great! Let’s proceed.");
        for (String key:keywords.keySet()){
            String reply = keywords.get(key);
            return reply;
        }
        return "Sorry, I don’t understand.";
    }
}
