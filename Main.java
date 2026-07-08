import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice;

        do {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID : ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age : ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Course : ");
                    String course = sc.nextLine();

                    Student s = new Student(id, name, age, course);
                    manager.addStudent(s);

                    break;

                case 2:

                    manager.displayStudents();
                    break;

                case 3:

                    System.out.print("Enter Student ID : ");
                    int searchId = sc.nextInt();
                    manager.searchStudent(searchId);

                    break;

                case 4:

                    System.out.print("Enter Student ID : ");
                    int deleteId = sc.nextInt();
                    manager.deleteStudent(deleteId);

                    break;

                case 5:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

        
    }
}