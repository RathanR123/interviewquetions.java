import java.util.Scanner;
public class primeornot {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    boolean isPrime = isPrime(num);
    System.out.println(num + " is " + (isPrime ? "prime" : "not prime"));
    }

 public static boolean isPrime(int num) {
            if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
        return false;
         }
    }
    return true;
    }
}

