import java.util.List;

public class StudentManagerAI {
    private DatabaseAI db; 
    private AIEngineAI ai; 

    public StudentManagerAI() {
        System.out.println("[Manager Init]: Bounding data store repository components...");
        this.db = new DatabaseAI();
        System.out.println("[Manager Init]: Bounding cognitive engine analyzer components...");
        this.ai = new AIEngineAI();
    }

    public void addStudent(StudentAI student) { 
        System.out.println("[Manager Router]: Pushing payload parameters to AI pipeline...");
        String insight = ai.generateInsight(student);
        
        System.out.println("[Manager Router]: Merging computed predictive metrics with profile metadata...");
        student.setAiRecommendation(insight);
        
        System.out.println("[Manager Router]: Saving finalized record package to backend storage...");
        db.save(student);
        System.out.println("[System Alert]: Record synchronized completely across modules.");
    }

    public void displayStudents() {
        List<StudentAI> list = db.getAll();
        if (list.isEmpty()) {
            System.out.println("Database empty. No data frame registries indexed.");
            return;
        }
        for (StudentAI s : list) {
            s.displayStudent();
            System.out.println("----------------------------------------");
        }
    }

    public void searchStudent(int id) {
        StudentAI s = db.findById(id);
        if (s != null) {
            s.displayStudent();
        } else {
            System.out.println("Registry Miss: ID " + id + " does not match any allocated objects.");
        }
    }

    public void deleteStudent(int id) {
        boolean removed = db.removeById(id);
        if (removed) {
            System.out.println("Registry Altered: Record dropped successfully.");
        } else {
            System.out.println("Registry Miss: ID " + id + " cannot be cleared because it does not exist.");
        }
    }
}