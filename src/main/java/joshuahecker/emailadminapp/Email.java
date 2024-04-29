package joshuahecker.emailadminapp;
import java.util.Scanner;

public class Email {
    private String first_name;
    private String last_name;
    private String department;
    private String company = "company";
    private String email;
    private String password;
    private String alt_email;
    private int mailboxCap = 0;
    
    public Email(String f_name, String l_name)
    {
        this.first_name = f_name;
        this.last_name = l_name;
        
        System.out.println("EMAIL CREATED: " + this.first_name + " " + this.last_name);
        this.set_department();
        
        this.email = this.first_name.replaceAll("\\s", "").toLowerCase() + "." + 
                this.last_name.replaceAll("\\s", "").toLowerCase() + "@" + 
                this.department.toLowerCase() + this.company + ".com";
        
        System.out.println("Your email address is now: " + this.email);
        
        this.password = this.generatePassword();
    }
    
    private void set_department()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\nWhich department are you part of?");
        System.out.println("1. Sales");
        System.out.println("2. Development");
        System.out.println("3. Accounting");
        System.out.println("4. None");
        
        int dep_choice = input.nextInt();
        
        switch(dep_choice)
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
        String pass_string = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890~!@#$%^&*";
        int pass_length = (int) ((Math.random() * (17 - 8)) + 8);
        String pass = "";
        
        for (int i = 0; i < pass_length; i++)
        {
            pass += pass_string.charAt((int)(Math.random() * pass_string.length()));
        }
        
        return pass;
    }
}
