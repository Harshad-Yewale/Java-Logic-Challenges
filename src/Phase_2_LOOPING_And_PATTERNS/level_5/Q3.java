package Phase_2_LOOPING_And_PATTERNS.level_5;

public class Q3 {

    //Q3) Print all numbers that are palindromes between 1–500.

    public static void main(String[] args) {

        System.out.println("Numbers between 1-500 who are palindrome are:");
        for (int i = 1; i <= 500; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }

    }

    private static boolean isPalindrome(int i) {
        int temp = i, reverse = 0;

        while (temp > 0) {
            int digit = temp % 10;
            reverse *= 10;
            reverse += digit;
            temp /= 10;
        }
        return i == reverse;

    }

}
