public class AIEngineAI {
    // Fixed: Changed parameter from Student to StudentAI
    public String generateInsight(StudentAI student) {
        System.out.println("   -> [AIEngine]: Extracting profile metadata keywords...");
        String course = student.getCourse().toLowerCase();
        int age = student.getAge();
        String baseTrack;

        if (course.contains("computer") || course.contains("java") || course.contains("coding") || course.contains("software")) {
            baseTrack = "Advanced Tech Track. Recommendation: Focus on Neural Networks.";
        } else if (course.contains("data") || course.contains("math") || course.contains("statistics")) {
            baseTrack = "Data Science Pathway. Recommendation: Prioritize Big Data Pipelines.";
        } else if (course.contains("business") || course.contains("management") || course.contains("marketing")) {
            baseTrack = "Enterprise Operations Pathway. Recommendation: Study AI Automation Strategy.";
        } else {
            baseTrack = "General Academic Track. Recommendation: Complete GenAI Tools crash course.";
        }

        if (age < 20) {
            return baseTrack + " (Focus: Foundational algorithms & academic internships)";
        } else {
            return baseTrack + " (Focus: Production systems deployments & enterprise portfolio)";
        }
    }
}