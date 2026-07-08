import java.util.ArrayList;
import java.util.List;

public class DatabaseAI {
    // Fixed: Using StudentAI instead of Student
    private List<StudentAI> studentList = new ArrayList<>();

    public void save(StudentAI student) { 
        System.out.println("   -> [Database]: Allocating storage slot for Student ID #" + student.getId());
        studentList.add(student); 
    }
    
    public List<StudentAI> getAll() { return studentList; }

    public StudentAI findById(int id) {
        for (StudentAI s : studentList) {
            if (s.getId() == id) return s;
        }
        return null;
    }

    public boolean removeById(int id) {
        StudentAI s = findById(id);
        if (s != null) {
            studentList.remove(s);
            return true;
        }
        return false;
    }
}