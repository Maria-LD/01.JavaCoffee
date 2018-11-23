import java.util.Scanner;

public class JavaCoffee {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        try {
        System.out.print("Enter number from 3 to 27: ");
        int n = Integer.parseInt(scanner.nextLine());

        if (n < 3 || n > 27) {
            System.out.println("Invalid input! Pay attention that number must be in the range from 3 to 27!");
            n = Integer.parseInt(scanner.nextLine());
        }
            int w = 3 * n + 6;
            int h = 3 * n + 1;

            for (int i = 1; i <= n; i++) {
                System.out.print(repeatStr(" ", n));
                System.out.println("~" + " " + "~" + " " + "~");
            }
            System.out.println(repeatStr("=", w - 1));

            //java sign loop
            int spacesRight = n - 1;
            int curls = w - (3 + spacesRight);
            for (int i = 0; i < n - 2; i++) {
                if (i != (n - 2) / 2) {
                    System.out.print("|");
                    System.out.print(repeatStr("~", curls));
                    System.out.print("|");
                    System.out.print(repeatStr(" ", spacesRight));
                    System.out.println("|");

                } else if (i == (n - 2) / 2) {
                    System.out.print("|");
                    System.out.print(repeatStr("~", curls / 2 - 2));
                    System.out.print("JAVA");
                    System.out.print(repeatStr("~", curls / 2 - 2));
                    System.out.print("|");
                    System.out.print(repeatStr(" ", spacesRight));
                    System.out.println("|");
                }
            }
            System.out.println(repeatStr("=", w - 1));

            for (int i = 0; i < n; i++) {
                System.out.print(repeatStr(" ", i));
                System.out.print("\\");
                System.out.print(repeatStr("@", (2 * n + 4) - 2 * i));
                System.out.println("/");
            }
            System.out.println(repeatStr("=", w - n));

        } catch (Exception ex) {
            System.out.println("Invalid input! Start the program again! Pay attention that number must be in the range from 3 to 27!");
        }
    }


    static String repeatStr(String text, int countToRepeat) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < countToRepeat; i++) {
            result.append(text);
        }
        return result.toString();
    }
}