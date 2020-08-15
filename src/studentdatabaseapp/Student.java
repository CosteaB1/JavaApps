package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName, lastName, courses,studentID;
    private int  tuitionbalance, gradeYear;
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
        System.out.println(firstName + " " + lastName + " " + gradeYear);

    }
    //Generate ID

    private void setStudentId () {
        // Grade level + static ID
        id++; // 1000 -> 1001 -> 1002-> ...
        this.studentID= gradeYear + "" + id;
    }

    //Enroll in courses

    //View balance

    // Pay tuition

    //Show status


}


// Application to manage student enrollments and balance.
// Ask the user how many new students will be added to the database.
//The User should be prompted t enter the name and year of each student.
//The student should have 5-digit unique ID, with the first number being their grade level.
//A student can en enroll in the following courses: History 101, Mathematics 101, English 101, Chemistry 101, Computer SCience 101.
// Each course cost $600 to enroll.
//The student should be able to view their balance and pay.
//To see the status of the student, we should see their name,ID,courses enrolled and balance.
