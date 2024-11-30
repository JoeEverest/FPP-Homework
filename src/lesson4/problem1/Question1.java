package lesson4.problem1;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("2 to the power of 10 is = "+power(2,10));
    }

    static double power(double x, int n){
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        return x * power(x, n-1);
    }
}
