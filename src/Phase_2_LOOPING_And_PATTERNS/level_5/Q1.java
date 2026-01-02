package Phase_2_LOOPING_And_PATTERNS.level_5;

public class Q1 {

    //Q) Print all numbers whose sum of digits is even (1–100)

    public static void main(String[] args) {

        System.out.println("All numbers whose sum of digits is even (1–100)");
        for (int i = 1; i <= 100; i++) {
            int result = sumOfDigits(i);

            if (result % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }
    static int sumOfDigits(int num) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }
}
