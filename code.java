public class Factorial {

    public static void main(String[] args) {

        int num = 109;
        long factorial = 301;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
