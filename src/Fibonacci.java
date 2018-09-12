import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int sum;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        n = scanner.nextInt();
        System.out.print(first +" "+ second+ " 1001");
        for(int i = 0; i<n-2;i++){
            sum = first + second;

            first = second;
            second = sum;
            System.out.print(sum + " ");


        }

    }
}
