public class StudentManager {

    Student[] students = new Student[20];
    int count = 0;

    public void addStudent(Student s) {

        if (count < students.length) {
            students[count] = s;
            count++;
            System.out.println("Student Added Successfully.");
        } else {
            System.out.println("Student List is Full.");
        }

    }

    public void displayStudents() {

        if (count == 0) {
            System.out.println("No Students Available.");
        } else {

            for (int i = 0; i < count; i++) {
                students[i].displayStudent();
                System.out.println("----------------------");
            }

        }

    }

    public void searchStudent(int id) {

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (students[i].getId() == id) {
                students[i].displayStudent();
                found = true;
                break;
            }

        }

        if (!found) {
            System.out.println("Student Not Found.");
        }

    }

    public void deleteStudent(int id) {

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (students[i].getId() == id) {

                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }

                students[count - 1] = null;
                count--;

                System.out.println("Student Deleted.");
                found = true;
                break;
            }

        }

        if (!found) {
            System.out.println("Student Not Found.");
        }

    }

}