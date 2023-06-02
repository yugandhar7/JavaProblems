package DSA;

import java.util.*;

public class VoConsonent {
    public static void main(String[] hsyfh) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is  vowels");
        } else {
            System.out.println(ch + "  is  consoent");
        }

    }

}
