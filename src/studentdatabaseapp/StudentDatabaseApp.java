package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {

        System.out.print("Enter number of new students to enroll: ");

        //Ask how many new students we want to add


        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        //Create n number of new students

        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].showInfo());
        }

        for (int n = 0; n < numOfStudents; n++) {
            System.out.println(students[n].showInfo());
        }
    }


// Application to manage student enrollments and balance.
// Ask the user how many new students will be added to the database.
//The User should be prompted t enter the name and year of each student.
//The student should have 5-digit unique ID, with the first number being their grade level.
//A student can en enroll in the following courses: History 101, Mathematics 101, English 101, Chemistry 101, Computer SCience 101.
// Each course cost $600 to enroll.
//The student should be able to view their balance and pay.
//To see the status of the student, we should see their name,ID,courses enrolled and balance.


}
