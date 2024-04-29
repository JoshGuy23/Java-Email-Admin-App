package joshuahecker.emailadminapp;
import java.util.Scanner;

public class Email {
    private String firstName;           // The first name of the user
    private String lastName;            // The last name of the user
    private String department;          // The department the user works in
    private String company = "company"; // The company the user works at
    private String email;               // The user's email address
    private String password;            // The user's password
    private String altEmail = "n/a";    // The user's alternate email.
    private int mailboxCap = 0;         // The user's mailbox capacity. Set to 0 by default.
    
    // This constructor stores the user's name and department, and creates their
    // email address and password.
    public Email(String fName, String lName)
    {
        // Store the user's name.
        this.firstName = fName;
        this.lastName = lName;
        
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
        // Set the user's department
        this.setDepartment();
        
        // Create the user's email address
        this.email = this.firstName.replaceAll("\\s", "").toLowerCase() + "." + 
                this.lastName.replaceAll("\\s", "").toLowerCase() + "@" + 
                this.department.toLowerCase() + this.company + ".com";
        
        System.out.println("Your email address is now: " + this.email);
        
        // Create the user's password
        this.password = this.generatePassword();
        System.out.println("Password: " + this.password);
    }
    
    // This function gets the user's department.
    private void setDepartment()
    {
        Scanner input = new Scanner(System.in);
        
        // Ask the user which department they work in
        System.out.println("\nWhich department are you part of?");
        System.out.println("1. Sales");
        System.out.println("2. Development");
        System.out.println("3. Accounting");
        System.out.println("4. None");
        
        int depChoice = input.nextInt();
        
        // Store the user's choice of department. If they have no department,
        // store an empty string.
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
    
    // This function generates a random password for the user.
    private String generatePassword()
    {
        String passString = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890~!@#$%^&*";
        // Get a random password length of 8 to 16 characters.
        int passLength = (int) ((Math.random() * (17 - 8)) + 8);
        String pass = "";
        
        // Randomly select characters from passString to form the password.
        for (int i = 0; i < passLength; i++)
        {
            pass += passString.charAt((int)(Math.random() * passString.length()));
        }
        
        // Return the new password
        return pass;
    }
    
    
    // This function sets a new password for the user.
    public void setPassword()
    {
        this.password = this.generatePassword();
        System.out.println("Password: " + this.password);
    }
    
    // This function allows the user to set up their mailbox capacity.
    public void setMailboxCap()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How much mailbox capacity would you like to have?");
        this.mailboxCap = input.nextInt();
    }
    
    // This function allows the user to set up an alternate email address.
    public void setAltEmail()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please set an alternate email address:");
        this.altEmail = input.nextLine();
    }
    
    // This function display's the user's name.
    public void getName()
    {
        System.out.println("The user's name is " + this.firstName + " " + this.lastName);
    }
    
    // This function displays the user's email addresses.
    public void getEmail()
    {
        System.out.println("Your main email is: " + this.email);
        System.out.println("Your alt email is: " + this.altEmail);
    }
    
    // This function displays the user's mailbox capacity.
    public void getMailboxCap()
    {
        System.out.println("Your current mailbox capacity is: " + this.mailboxCap);
    }
}
