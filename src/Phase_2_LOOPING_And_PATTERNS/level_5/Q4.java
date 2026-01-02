package Phase_2_LOOPING_And_PATTERNS.level_5;

public class Q4 {

    //Q) Print numbers between 1–100 whose digits add up to a multiple of 3.

    public static void main(String[] args) {

        System.out.println("All numbers whose sum of digits is even (1–100)");
        for (int i = 1; i <= 100; i++) {
            int result = sumOfDigits(i);

            if (result % 3 == 0) {
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
