public class Task2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = {45, 8, 0, 6, 15, -7, 48, 0, 45, -8};
            int catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: array index is out of bounds");
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: divide by zero");
        }
    }
}
