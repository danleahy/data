package algorithms.factorial;

public class Factorial {

    public static int factorial(int input){
        if (input == 1) return 1;
        else return input * factorial(input - 1);
    }


    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
