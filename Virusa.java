public class Virusa {
    // 2d array
    class Main {
        public static void main(String[] args) {
            int arr[][] = new int[2][2];
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    arr[i][j] = sc.nextInt();

                }
            }
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.println(arr[i][j]);
                }
            }

        }
    }

    ////////////////////////////////////////////////////////////////////////////////////
    // class
    class Student {
        String name = "";
        int age;
        char gender;

        public void info() {
            System.out.println(name);
            System.out.println(age);
            System.out.println(gender);
        }

        public static void main(String[] args) {
            Student in = new Student();
            in.name = "yuganhar";
            in.age = 22;
            in.gender = 'm';

            in.info();
        }
    }

}
