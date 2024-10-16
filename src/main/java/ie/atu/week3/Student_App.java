package ie.atu.week3;

import java.util.Scanner;

public class Student_App {
    public static void main(String[] args) {

        //Student 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name of the student: ");
        String name = sc.nextLine();
        System.out.println("Please enter the email of the student: ");
        String email = sc.nextLine();
        System.out.println("Please enter the course of the student: ");
        String course = sc.nextLine();

        //Student 2
        System.out.println("Please enter the name of the student: ");
        String name2 = sc.nextLine();
        System.out.println("Please enter the email of the student: ");
        String email2 = sc.nextLine();
        System.out.println("Please enter the course of the student: ");
        String course2 = sc.nextLine();

        //student 3
        System.out.println("Please enter the name of the student: ");
        String name3 = sc.nextLine();
        System.out.println("Please enter the email of the student: ");
        String email3 = sc.nextLine();
        System.out.println("Please enter the course of the student: ");
        String course3 = sc.nextLine();


        StudentName n = new StudentName();
        n.setName(name);
        n.setEmail(email);
        n.setCourse(course);

        StudentName n2 = new StudentName("eoin");
        n2.setName(email2);
        n2.setCourse(course2);

        StudentName n3 = new StudentName("eoin", "g00431577@atu.ie", "Software Engineering");

        System.out.println(n);
        System.out.println(n2);
        System.out.println(n3);

    }
}
