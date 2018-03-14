public class Calculate {
    public static void main(String[] arg) {
        System.out.println("Calculate");
        int a = Integer.valueOf(arg [0]);
        int b = Integer.valueOf(arg [1]);
        int sum = a + b;
        int subst = a - b;
        int div = a / b;
        int mul = a * b;
        int power = (int)Math.pow(a, b);
        System.out.println("Sum: " + sum);
        System.out.println("Subst: " + subst);
        System.out.println("Div: " + div);
        System.out.println("Mult: " + mul);
        System.out.println("Power: " + power);

    }
}
