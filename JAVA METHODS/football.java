import java.util.Random;

public class football_team_hieghts {
    public static void main(String[] args) {
        int[] a = new int[11];
        fill(a, 150, 250);
        
        int s = sum(a);
        double m = mean(a);
        int min = shortest(a);
        int max = tallest(a);
        
        System.out.println("Hieghts of players:");
        for (int h : a) {
            System.out.print(h + " cm ");
        }
        System.out.println();
        
        System.out.println("Sum of hieghts = " + s + " cm");
        System.out.println("Mean hieght = " + m + " cm");
        System.out.println("Shortest hieght = " + min + " cm");
        System.out.println("Tallest hieght = " + max + " cm");
    }
    
    private static void fill(int[] a, int l, int u) {
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(u - l + 1) + l;
        }
    }
    
    private static int sum(int[] a) {
        int s = 0;
        for (int h : a) {
            s += h;
        }
        return s;
    }
    
    private static double mean(int[] a) {
        int s = sum(a);
        return (double) s / a.length;
    }
    
    private static int shortest(int[] a) {
        if (a.length == 0) {
            throw new IllegalArgumentException("array must have at least one element");
        }
        int m = a[0];
        for (int h : a) {
            if (h < m) {
                m = h;
            }
        }
        return m;
    }
    
    private static int tallest(int[] a) {
        if (a.length == 0) {
            throw new IllegalArgumentException("array must have at least one element");
        }
        int M = a[0];
        for (int h : a) {
            if (h > M) {
                M = h;
            }
        }
        return M;
    }
}
