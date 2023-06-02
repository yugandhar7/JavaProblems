import java.util.*;

class Ug {
    public int max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }

    public int min(int[] arr) {
        int min = 0;
        for (int x = 0; x < arr.length; ++x) {
            min = arr[0];
            if (arr[x] < min) {
                min = arr[x];
            }

        }
        return min;
    }

}

public class P73 {
    public static void main(String[] jds) {
        Scanner sc = new Scanner(System.in);
        Ug ug = new Ug();
        int x = sc.nextInt();
        int[] arr = new int[x];
        for (int i = 0; i < x; ++i) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("max elemanr=" + ug.max(arr));
        System.out.println("min element=" + ug.min(arr));
    }
}