import java.util.*;
public class prog6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double p = sc.nextInt();
        double r = sc.nextInt();
        double t = sc.nextInt();
        double si = (p*r*t)/100;
        System.out.println("the total si is" +si);
    }
}
