package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName, lastName, courses ="" , studentID;
    private int tuitionbalance = 0, gradeYear;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Constructor prompt user to enter student's name and yeear
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - freshmen\n2 - for Sophmore\n3 - for Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();

        setStudentId();

        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

    }
    //Generate ID

    private void setStudentId() {
        // Grade level + static ID
        id++; // 1000 -> 1001 -> 1002-> ...
        this.studentID = gradeYear + "" + id;
    }

    //Enroll in courses

    public void enroll() {
        //get inside a loop, user hits 0
        do {
            System.out.print("Enter course to enroll(Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuitionbalance = tuitionbalance + costOfCourse;
            } else {
                break;
            }

        } while (1 != 0);

        System.out.println("ENROLLEDIN: " + courses);
    }

    //View balance
    public void viewBalance() {
        System.out.println("Your balance is : $" + tuitionbalance);
    }

    // Pay tuition
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionbalance = tuitionbalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();

    }

    //Show status

    public String showInfo() {
        return  "Name: "+ firstName + " " + lastName +
                "\nGrade level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionbalance;

    }


}


