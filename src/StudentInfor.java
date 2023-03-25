import java.util.Scanner;

public class StudentInfor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student name");
        String name = scanner.nextLine();
        System.out.println("Enter the student class");
        String sClass = scanner.nextLine();
        System.out.println("Enter the student age");
        byte age = scanner.nextByte();
        Student studentWhoKnow = new Student(name, sClass, age);
        System.out.print("The student: " + studentWhoKnow.getStudentName());
        System.out.print(" of class " + studentWhoKnow.getStudentClass());
        System.out.print(" is " + studentWhoKnow.getStudentAge() + " years old");
    }
}
