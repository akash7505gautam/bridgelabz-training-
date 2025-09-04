package JAVA_PROGRAM;

public class prog1 {
    static class Employee {
        String name;
        int id;
        double salary;
        Employee(String name,int id,double salary){
            this.name=name;
            this.id=id;
            this.salary=salary;

            
        }
        void displaydetails(){
                System.out.println("name is "+name +" and id is "+id +"and salary is "+this.salary);
            }

    
        
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("bhavtosh",1,150000);
        e1.displaydetails();
    }
    
}
