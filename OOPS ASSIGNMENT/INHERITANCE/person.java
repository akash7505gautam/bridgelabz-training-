package INHERITANCE;

public class prog5 {
    static class Person{
        String name;
        int age;
        Person(String name,int age){
            this.name=name;
            this.age=age;
        }
    }
    static class Teacher extends Person{
        String subject;
        Teacher(String name,int age,String subject){
            super(name,age);
            this.subject=subject;
        }
        void displayRole(){
            System.out.println("teacher have subjects");
        }
    }
    static class Student extends Person{
        String grade;
        Student(String name,int age,String grade){
            super(name, age);
            this.grade=grade;
        }
        void displayRole(){
            System.out.println("students have grades");
        }
    }
    public static void main(String[] args) {
        Student s = new Student("bhavtosh", 21,"a+");
        s.displayRole();
    }
    
}
