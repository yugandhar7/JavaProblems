public class Type_CC {
    public static void main(String[] ug) {
        int a = 256;
        int c = a;// implicite conversion;
        byte b = (byte) a;// explicit conversion
        System.out.println(b + " " + c);

        int num = 300;
        byte num2 = (byte) num;
        System.out.println(num2);// output is 44 here range of byte is 256 so it
        // divides 300 % 256=44;

        float val1 = 3.14f;
        int val2 = (int) val1;
        System.out.println(val2);
        byte num4 = 300;
        System.out.println(num4);// lossy conversion it wont take the value because out of range

    }

}
