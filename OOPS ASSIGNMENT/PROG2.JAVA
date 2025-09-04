package JAVA_PROGRAM;

public class prog2 {
    static class Circle {
        int radius;
        Circle(int radius){
            this.radius=radius;
        }
        void area(){
            System.out.println("the area is "+(this.radius*this.radius));
        }
        void Circumference(){
            System.out.println("the area is "+(2*3.14*this.radius));
        }
    
        
    }
    public static void main(String[] args) {
        Circle c1 = new Circle(6);
        c1.area();
        c1.Circumference();
    }
    
}
