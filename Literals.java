public class Literals {
    public static void main(String[] ug) {
        // Literals
        // literals are the raw data which is stored in variables
        int num1 = 0b10111;// b denotes the binary ; output is 23 which is the value of the 10111 in binary
        int num2 = 0x4f;// x denotes the hexadecimal and 4f is the value in hd;
        int val = 1_00_00_000;// for flexibility of understanding
        char c = 'a';
        c++;// it increases the value to next one
        System.out.println(num1 + " " + num2 + " " + val + " " + c);
    }

}
