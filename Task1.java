import java.util.Scanner;

public class Task1 {
    public static boolean isFloat(String val) {
        try {
            Float.parseFloat(val);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static float valFloat () {
        Scanner scan = new Scanner(System.in);
        String num;
        do {
            System.out.println("Введите дробное число:");
            num = scan.nextLine();
        } while (!isFloat(num));
        scan.close();
        return Float.parseFloat(num);
    }

    public static void main(String[] args) {
        System.out.println(valFloat());
    }
}
