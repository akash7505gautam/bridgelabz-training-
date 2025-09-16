import java.util.Arrays;

public class number_checker {
    public static void main(String[] args) {
        int n = 153;
        System.out.println("number: " + n);
        int d = count_digits(n);
        System.out.println("count of digits = " + d);
        int[] a = digits_array(n);
        System.out.println("digits array = " + Arrays.toString(a));
        boolean duck = is_duck(n, a);
        System.out.println("is duck number? " + duck);
        boolean arm = is_armstrong(n, a);
        System.out.println("is armstrong number? " + arm);
        int[] ls = largest_and_second_largest(a);
        System.out.println("largest = " + ls[0] + ", second largest = " + ls[1]);
        int[] sm = smallest_and_second_smallest(a);
        System.out.println("smallest = " + sm[0] + ", second smallest = " + sm[1]);
    }

    public static int count_digits(int x) {
        if (x == 0) {
            return 1;
        }
        int y = x < 0 ? -x : x;
        int c = 0;
        while (y > 0) {
            y = y / 10;
            c = c + 1;
        }
        return c;
    }

    public static int[] digits_array(int x) {
        int c = count_digits(x);
        int[] arr = new int[c];
        int y = x < 0 ? -x : x;
        for (int i = c - 1; i >= 0; i--) {
            arr[i] = y % 10;
            y = y / 10;
        }
        return arr;
    }

    public static boolean is_duck(int x, int[] arr) {
        String s = Integer.toString(x);
        if (s.length() > 0 && s.charAt(0) == '0') {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean is_armstrong(int x, int[] arr) {
        int c = arr.length;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + (long)Math.pow(arr[i], c);
        }
        return sum == x;
    }

    public static int[] largest_and_second_largest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException();
        }
        int l = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int v = arr[i];
            if (v > l) {
                sl = l;
                l = v;
            } else if (v > sl && v != l) {
                sl = v;
            }
        }
        return new int[]{l, sl};
    }

    public static int[] smallest_and_second_smallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException();
        }
        int s = Integer.MAX_VALUE;
        int ss = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int v = arr[i];
            if (v < s) {
                ss = s;
                s = v;
            } else if (v < ss && v != s) {
                ss = v;
            }
        }
        return new int[]{s, ss};
    }
}
