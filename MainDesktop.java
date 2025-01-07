import java.util.Scanner;
public class MainDesktop {
    public static void main(String[] args){
        chatManagement manager=new chatManagement();
        Scanner scanner = new Scanner(System.in);
        String name;
        while(true){
            if(manager.notify.getNotify()) System.out.println("\\u001B[31mCHECK MESSAGES : YOU HAVE NOTIFICATION FROM "+manager.notify.getName()+"\\u001B[0m");
            System.out.println("\n\nWelcome to Real-Time Chat Application");
            System.out.println("1. Add Contact");
            System.out.println("2. View/Manage Contacts");
            System.out.println("3. Send a Message");
            System.out.println("4. View Chat History");
            System.out.println("5. Recall Last Message");
            System.out.println("6. View Incoming Messages");
            System.out.println("7. Exit");
            System.out.print("\n\n Enter Choice :");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                System.out.println(manager.viewAddContacts());
                scanner.nextLine();
                break;
                case 2:
                manager.viewContacts();
                System.out.println("\nManage Contacts\n");
                System.out.println("1. Update Contact");
                System.out.println("2. Remove Contact");
                System.out.println("3. Undo last deleted Contact");
                System.out.println("4. Press enter to return");
                int contactChoice=scanner.nextInt();
                switch(contactChoice){
                    case 1:
                    manager.viewContacts();
                    System.out.println("\nWhich Contact you want to update ? ");
                    scanner.nextLine();
                    name=scanner.nextLine();
                    System.out.println(manager.manageContact(name));
                    break;
                    case 2:
                    System.out.println("\nWhich Contact you want to delete ? ");
                    scanner.nextLine();
                    name=scanner.nextLine();
                    System.out.println(manager.deleteContact(name));
                    scanner.nextLine();
                    case 3:
                    System.out.println(manager.undoDelete());
                    scanner.nextLine();
                    break;
                    case 4:
                    break;
                    default:
                    System.out.println("Invalid option");
                }
                break;
                case 3:
                System.out.println(manager.sendMessage());
                break;
                case 4:
                System.out.println(manager.viewConversation());
                System.out.println("\nWhich Conversation you want open? ");
                name=scanner.nextLine();
                System.out.println(manager.openConversation(name));
                scanner.nextLine();
                break;
                case 5:
                break;
                case 6:
                break;
                case 7:
                System.out.print("\n\nThank you");
                scanner.close();
                return;
                default:
                System.out.println("Invalid option");
            }
        }
    }
    
}
