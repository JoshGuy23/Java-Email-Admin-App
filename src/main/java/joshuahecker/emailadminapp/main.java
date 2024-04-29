package joshuahecker.emailadminapp;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your first name.");
        String fName = input.nextLine();
        
        System.out.println("Please enter your first name.");
        String lName = input.nextLine();
        
        Email em = new Email(fName, lName);
        em.setPassword();
        em.setMailboxCap();
        em.setAltEmail();
        
        em.getEmail();
        em.getName();
        em.getMailboxCap();
    }
    
}
