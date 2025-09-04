package JAVA_PROGRAM;

public class prog6 {
    static class Student {
        String name;
        int roll;
        double marks;
        Student(String name,int roll,double marks){
            this.name=name;
            this.roll=roll;
            this.marks=marks;
        }
        void calcgrade(){
            if(marks>=90){
                System.out.println("grade is O");
            }
            else if(marks>80 && marks<=89){
                System.out.println(" garde is A+");
            }
            else{
                System.out.println("grade is A");
            }
        }
        void displaydetails(){
            System.out.println("student name is "+this.name+" roll no is "+this.roll);
            calcgrade();
        }
    
        
    }
    public static void main(String[] args) {
        Student s1 = new Student("hemant",20,70);
        s1.displaydetails();
    }
    
}
