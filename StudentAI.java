public class StudentAI {
    private int id;
    private String name;
    private int age;
    private String course;
    private String aiRecommendation;

    // Fixed: Constructor name must match the class name exactly
    public StudentAI(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.aiRecommendation = "Pending AI Analysis...";
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCourse() { return course; }
    public String getAiRecommendation() { return aiRecommendation; }
    public void setAiRecommendation(String aiRecommendation) { this.aiRecommendation = aiRecommendation; }

    public void displayStudent() {
        System.out.println("Student ID         : " + id);
        System.out.println("Student Name       : " + name);
        System.out.println("Age                : " + age);
        System.out.println("Course             : " + course);
        System.out.println("[AI Recommendation]: " + aiRecommendation);
    }
}