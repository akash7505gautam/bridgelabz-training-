public class Student {
    public int rollNumber;        
    protected String name;        
    private double CGPA;       

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        setCGPA(CGPA); 
    }

    // Getter for CGPA
    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. Must be between 0.0 and 10.0.");
        }
    }

    public void displayStudentDetails() {
        System.out.println("Roll No: " + rollNumber +
                           ", Name: " + name +
                           ", CGPA: " + CGPA);
    }
}

public class PostgraduateStudent extends Student {
    private String researchTopic;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
        super(rollNumber, name, CGPA);
        this.researchTopic = researchTopic;
    }

    public void displayPostgraduateDetails() {
        // Accessing protected member 'name' from superclass
        System.out.println("PG Student: " + name +
                           ", Roll No: " + rollNumber +
                           ", CGPA: " + getCGPA() +
                           ", Research: " + researchTopic);
    }
}

public class Main {
    public static void main(String[] args) {
        Student undergrad = new Student(1001, "Alice", 8.5);
        undergrad.displayStudentDetails();

        PostgraduateStudent grad = new PostgraduateStudent(2001, "Bob", 9.2, "AI");
        grad.displayPostgraduateDetails();

        grad.setCGPA(11.0);  
        grad.setCGPA(9.5);   
        grad.displayPostgraduateDetails();
    }
}
