class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));

        System.out.println("a > 5 && b < 5: " + (a > 5 && b < 5));
    }
}