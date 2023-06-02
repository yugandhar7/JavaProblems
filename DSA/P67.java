public class P67 {
    public static void main(String[] mshd) {
        int k = 0;
        for (int i = 1; i <= 4; i++) {
            k++;
            for (int j = 4; j >= i; --j) {
                System.out.print(" " + " ");
            }
            for (int x = 1; x <= i; ++x) {
                System.out.print(k + " ");

            }
            System.out.println();

        }

    }
}
