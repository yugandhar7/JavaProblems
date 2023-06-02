public class P64 {
    public static void main(String[] sdhf) {
        for (int i = 2; i < 100; ++i) {
            int count1 = 0;
            int count2 = 0;
            for (int j = 2; j < i; ++j) {
                if (i % j == 0) {
                    count1++;
                }
            }
            if (count1 == 0) {
                int num = i + 2;
                for (int in = 2; in < num; ++in) {
                    if (num % in == 0) {
                        count2++;
                    }

                }
                if (count1 == count2) {
                    System.out.println(i + " " + num);
                }
            }

        }
    }
}