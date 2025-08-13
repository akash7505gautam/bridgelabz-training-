import java.util.*;
public class prog5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextInt();
        double height = sc.nextInt();
        double volume=3.14*radius*radius*height;
        System.out.println("volume is " +volume);
    }
    
}
