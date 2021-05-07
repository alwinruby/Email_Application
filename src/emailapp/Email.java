package emailapp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    //Constructor to receive the first and last names
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        //Call a method asking for the department - return the department
        this.department = setDepartment();
    }

    //Ask for the department
    private String setDepartment(){
        System.out.print("Enter the department\n1 for Sales\n2 for Develoment\n3 for Accounting\n0 for none");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();

        if (depChoice == 1){
            return "sales";
        }

        else if (depChoice == 2){
            return "dev";
        }

        else if (depChoice == 3){
            return "acc";
        }
        else
            return "";
    }
    //Generate a random password

    //Set the mailbox capacity

    //Set the alternate email

    //Change the password


}
