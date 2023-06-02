import java.util.*;

public class JaggedArray { /// it is an array in which array size is not same
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][];
        for (int i = 0; i < 3; ++i) {
            arr[i] = new int[sc.nextInt()];
        }
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int n[] : arr) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println(" ");
        }

    }

}
