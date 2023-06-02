class Demo {
    public int method(int x, int y) {
        return x + y;
    }

    public int method(int x, int y, int l) {
        return x * y * l;
    }

    public String method(String str) {
        return str;
    }
}

public class MethodOL {
    public static void main(String[] gadsgcfhv) {
        Demo ug = new Demo();
        System.out.println(ug.method(5, 7));
    }
}