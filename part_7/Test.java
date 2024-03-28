package part_7;

public class Test {
    public static void main(String[] args) {
        System.out.println("printing the sum of multiple arguments");
        m1(1, 2, 3, 4, 5, 6, 7, 8, 9, 56);

        System.out.println("just two arguments printed");
        m1(1, 2);
        // System.out.println("main: before the simple method call");
        // simpleCall();
        // System.out.println("after the simple method call");
    }

    // public static void simpleCall() {
    // System.out.println("the simple method call");
    // }

    // public static int performCalc(int x, int y, String operation) {
    // int result = switch (operation) {
    // case "+" -> x + y;
    // case "-" -> x - y;
    // case "*" -> x * y;
    // case "/" -> x / y;
    // case "%" -> x % y;
    // default -> {
    // System.out.println("Unknown operation: " + operation);
    // yield -1;
    // }
    // };
    // return result;
    // }

    public static void m1(int... args) {
        int sum = 0;
        for (int i : args) {
            sum += i;
        }
        System.out.println(sum);
    }
}
