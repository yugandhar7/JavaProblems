import java.util.*;

public class P52 {
    public static void main(String[] bsdyf) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int x, y, z = 0;
        String[] ones = { " ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String[] Tens = { " ", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eigthty", "ninty" };
        String[] Hundreds = { " ", "OneHundred", "TwoHundred", "ThreeHundred", "FourHundred", "FiveHundred",
                "SixHundred", "sevenHundred", "EightHundred", "NineHundred" };
        if (num < 10) {
            System.out.println(ones[num]);
        } else if (num > 10 && num < 100) {
            x = num / 10;
            y = num % 10;
            System.out.println(Tens[x] + " " + ones[y]);

        } else if (num >= 100 && num <= 999) {
            x = num / 100;
            y = (num % 100) / 10;
            z = num % 10;

            System.out.println(Hundreds[x] + " " + Tens[y] + " " + ones[z]);

        }
    }
}