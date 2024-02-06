import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double studentGPA = 3.45;
        String studentFirstName = "Kayla";
        String studentLastName = "Hammon";
        System.out.println(studentFirstName +" "+ studentLastName + " has a GPA of "+ studentGPA);
        System.out.println("what name Do you want of the student");

        // print old gpa
        System.out.println(studentGPA);
        // create the input type scanner
        Scanner input = new Scanner(System.in);
        // find the next double of the scanner
        studentGPA = input.nextDouble();
        // print out the updated name of the input
        System.out.println(studentGPA);

        System.out.println(studentFirstName + " " + studentLastName + " now has gpa of " + studentGPA);
    }
}
