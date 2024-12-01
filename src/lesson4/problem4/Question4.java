package lesson4.problem4;

public class Question4 {
    public static void main(String[] args) {
        int num = 121;

        System.out.println("Is "+num+" a palindrome? "+ isPalindrome(num));
    }

    public static boolean isPalindrome(int number) {
        int divisor = 1;
        while (number / divisor >= 10) {
            divisor *= 10;
        }

        return isPalindrome(number, divisor);
    }

    private static boolean isPalindrome(int number, int divisor){
        if (number < 10) {
            return true;
        }

        int firstDigit = number / divisor;
        int lastDigit = number % 10;

        if (firstDigit != lastDigit) {
            return false;
        }

        number = (number % divisor) / 10;
        divisor /= 100;

        return isPalindrome(number, divisor);
    }
}
