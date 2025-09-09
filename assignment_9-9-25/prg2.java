public class Circle {
    private double radius;

   
    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle[radius=" + radius + "]";
    }

    public static void main(String[] args) {
        Circle defaultCircle = new Circle();        
        Circle customCircle = new Circle(2.5);    

        System.out.println(defaultCircle);  
        System.out.println("Area = " + defaultCircle.getArea());
        System.out.println("Circumference = " + defaultCircle.getCircumference());

        System.out.println();

        System.out.println(customCircle);
        System.out.println("Area = " + customCircle.getArea());
        System.out.println("Circumference = " + customCircle.getCircumference());
    }
}
