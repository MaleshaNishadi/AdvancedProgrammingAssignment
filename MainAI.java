import java.util.Scanner;

public class MainAI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("[System Core]: UI initialization linked to StudentManagerAI engine...");
        StudentManagerAI manager = new StudentManagerAI();
        int choice;

        do {
            System.out.println("\n===== COGNITIVE STUDENT INTERFACE =====");
            System.out.println("1. Add Student (With Live AI Evaluation)");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            
            choice = ValidatorAI.getValidInt(sc, "Enter Choice : ");

            switch (choice) {
                case 1:
                    int id = ValidatorAI.getValidInt(sc, "Enter Student ID : ");
                    String name = ValidatorAI.getValidString(sc, "Enter Student Name : ");
                    int age = ValidatorAI.getValidInt(sc, "Enter Age : ");
                    String course = ValidatorAI.getValidString(sc, "Enter Course : ");

                    StudentAI s = new StudentAI(id, name, age, course);
                    manager.addStudent(s);
                    break;
                case 2:
                    manager.displayStudents();
                    break;
                case 3:
                    int searchId = ValidatorAI.getValidInt(sc, "Enter Student ID : ");
                    manager.searchStudent(searchId);
                    break;
                case 4:
                    int deleteId = ValidatorAI.getValidInt(sc, "Enter Student ID : ");
                    manager.deleteStudent(deleteId);
                    break;
                case 5:
                    System.out.println("System Shutdown. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid Option selected.");
            }
        } while (choice != 5);
        
        sc.close();
    }
}