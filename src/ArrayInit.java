import java.util.Arrays;
import java.util.Scanner;

public class ArrayInit {
    public static void main(String[] args) {
        int[] arr = initArray();
        System.out.println(Arrays.toString(arr));
        System.out.println("Sum of this array is: " + sumArray(arr));
        System.out.println("The max of this array is: " + findMax(arr));
    }
    public static int[] initArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your length ");
        int length = scanner.nextInt();
        int[] customArr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.printf("Enter your array[%d] ", i);
            customArr[i] = scanner.nextInt();
        }
        return customArr;
    }
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr){
            if (max < num){
                max = num;
            }
        } return max;
    }
}
