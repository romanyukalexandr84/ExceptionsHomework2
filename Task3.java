public class Task3 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Массив выходит за пределы своего размера");
        } catch (NullPointerException e) {
            System.out.println("Указатель не может указывать на null");
        } catch (Throwable e) {
            System.out.println("Что-то пошло не так");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
