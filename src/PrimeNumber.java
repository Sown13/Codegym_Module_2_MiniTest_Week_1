import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int range;
        do {
            System.out.println("Enter your range of Prime: ");
            range = scanner.nextInt();
            if (range < 3) {
                System.out.println("There is no Prime number in your range, please enter the other range: ");
                range = scanner.nextInt();
            }
        } while (range < 3);
        System.out.println("Your list of Prime number is: ");
        for (int i = 0; i < range; i++){
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        else {
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
        }
        return true;
    }
}
