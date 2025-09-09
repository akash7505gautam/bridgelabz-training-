public class Course {
    private String courseName;
    private int duration;    
    private double fee;

    private static String instituteName = "GLA VISHVIDHYALAY";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName +
                           ", Duration: " + duration +
                           ", Fee: $" + String.format("%.2f", fee) +
                           ", Institute: " + instituteName);
    }

    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Mathematics", 40, 250.0);
        Course c2 = new Course("Physics", 45, 300.0);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("Global Tech Academy");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
