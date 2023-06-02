package DSA;

import java.util.*;

public class Alphabets {
    public static void main(String[] ahk) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);

        if (c > 65 && c < 132) {
            System.out.println("Alphabet");
        } else {
            System.out.println("not alphabet");
        }
    }
}