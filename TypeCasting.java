public class TypeCasting {
    public static void main(String[] args) {
        // Implicit type casting
        int num = 100;
        double doubleNum = num; // int to double
        System.out.println("Implicit type casting (int to double): " + doubleNum);

        // Explicit type casting
        double anotherDoubleNum = 100.99;
        int anotherNum = (int) anotherDoubleNum; // double to int
        System.out.println("Explicit type casting (double to int): " + anotherNum);
    }
}