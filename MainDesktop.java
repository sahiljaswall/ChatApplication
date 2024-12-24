import java.util.Scanner;
import java.time.LocalDate;
public class MainDesktop {
    public static void main(String[] args){
        Functinality fun = new Functinality();
        Scanner scanner = new Scanner(System.in);
        while(true){
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
                System.out.println("1. Add Contact");
                System.out.print("Name : ");
                String name = scanner.nextLine();
                System.out.print("Phone Number : ");
                String phoneNumber = scanner.nextLine();
                System.out.print("Email : ");
                String email = scanner.nextLine();
                String timeStamp = LocalDate.now().toString();
                String reply=fun.addContact(name,phoneNumber,email,timeStamp);
                System.out.println(reply);
                scanner.nextLine();
                break;
                case 2:
                fun.viewContacts();
                scanner.nextLine();

                break;
                case 3:
                break;
                case 4:
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
                break;
            }


        }
    }
    
}
