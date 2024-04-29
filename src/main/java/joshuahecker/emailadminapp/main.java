package joshuahecker.emailadminapp;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get the user's first name
        System.out.println("Please enter your first name.");
        String fName = input.nextLine();
        
        // Get the user's last name
        System.out.println("Please enter your last name.");
        String lName = input.nextLine();
        
        // Instantiate the Email class
        Email em = new Email(fName, lName);
        // Set a new password, mailbox capacity, and alternate email address.
        em.setPassword();
        em.setMailboxCap();
        em.setAltEmail();
        
        // Get the email addresses, name, and mailbox capacity
        em.getEmail();
        em.getName();
        em.getMailboxCap();
    }
    
}
