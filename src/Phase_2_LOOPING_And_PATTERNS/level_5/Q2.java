package Phase_2_LOOPING_And_PATTERNS.level_5;

public class Q2 {

    //Q)  Count how many numbers between 1–500 are divisible by 7 but not by 5

    public static void main(String[] args) {
        int count = 0;

        for (int i = 7; i <= 500; i += 7) {
            if (divisibleBy7ButNot5(i)) {
                count++;
            }
        }
        System.out.printf("There are %d numbers between 1 - 500 who are divisible by 7 but not divisible by 5", count);

    }

    private static boolean divisibleBy7ButNot5(int i) {
        return i % 7 == 0 && i % 5 != 0;
    }
}
