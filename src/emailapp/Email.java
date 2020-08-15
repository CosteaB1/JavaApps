package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName, lastName, password, department, alternateEmail, email , companySuffix="company.com";
    private int mailboxCapacity = 500, defaultPasswordLength = 10;

    //Constructor to receive the first name and last name;
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
//        System.out.println("Email Created: " + this.firstName + this.lastName);

        //call a method asking for the department and return it.
        this.department = setDepartment();
//        System.out.println("Department: " + this.department);

        //call a method for generating password and return it;
        this.password = randomPassword(defaultPasswordLength);
//        System.out.println("Your pasword is: " +this.password);

        //combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "."+ companySuffix;
//        System.out.println("Your email is: " + email);
    }

    //Ask for the department
    private String setDepartment() {
        System.out.print("New worker: " + firstName +" " + lastName + "\nDEPARTMENT CODES\n1 for Sale\n2 for Development\n3 for Accounting \n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoise = in.nextInt();
        if (depChoise == 1) {
            return "sales";
        } else if (depChoise == 2) {
            return "dev";
        } else if (depChoise == 3) {
            return "acct";
        } else {
            return "";
        }
    }

    //Generate random password.
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //Set the mailbox capacity.
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    //Set alternate email.
    public void setAlternateEmail (String altEmail){
        this.alternateEmail = altEmail;
    }

    //Change the password.

    public void changePasswrod (String password) {
        this.password = password;
    }

    public int getMailboxCapacity (){ return mailboxCapacity;}
    public String getAlternateEmail () {return alternateEmail;}
    public String getPassword () {return password;}

    public String showInfo () {
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nPassword: " + password +
                "\nCOMPANY EMAI: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";

    }


}
