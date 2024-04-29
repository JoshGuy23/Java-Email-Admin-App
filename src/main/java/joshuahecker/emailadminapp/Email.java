package joshuahecker.emailadminapp;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String company = "company";
    private String email;
    private String password;
    private String altEmail;
    private int mailboxCap = 0;
    
    public Email(String fName, String lName)
    {
        this.firstName = fName;
        this.lastName = lName;
        
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
        this.setDepartment();
        
        this.email = this.firstName.replaceAll("\\s", "").toLowerCase() + "." + 
                this.lastName.replaceAll("\\s", "").toLowerCase() + "@" + 
                this.department.toLowerCase() + this.company + ".com";
        
        System.out.println("Your email address is now: " + this.email);
        
        this.password = this.generatePassword();
        System.out.println("Password: " + this.password);
    }
    
    private void setDepartment()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\nWhich department are you part of?");
        System.out.println("1. Sales");
        System.out.println("2. Development");
        System.out.println("3. Accounting");
        System.out.println("4. None");
        
        int depChoice = input.nextInt();
        
        switch(depChoice)
        {
            case 1:
                this.department = "Sales.";
                break;
            case 2:
                this.department = "Development.";
                break;
            case 3:
                this.department = "Accounting.";
                break;
            default:
                this.department = "";
        }
    }
    
    private String generatePassword()
    {
        String passString = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890~!@#$%^&*";
        int passLength = (int) ((Math.random() * (17 - 8)) + 8);
        String pass = "";
        
        for (int i = 0; i < passLength; i++)
        {
            pass += passString.charAt((int)(Math.random() * passString.length()));
        }
        
        return pass;
    }
    
    public void setPassword()
    {
        this.password = this.generatePassword();
        System.out.println("Password: " + this.password);
    }
    
    public void setMailboxCap()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How much mailbox capacity would you like to have?");
        this.mailboxCap = input.nextInt();
    }
    
    public void setAltEmail()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please set an alternate email address:");
        this.altEmail = input.nextLine();
    }
}
