import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();

            System.out.print("Enter the target sum B: ");
            int B = scanner.nextInt();

            int[] A = new int[n];
            System.out.println("Enter the elements:");
            for (int j = 0; j < n; j++) {
                A[j] = scanner.nextInt();
            }

            HashSet<Integer> set = new HashSet<>();
            boolean hasGoodPair = false;

            for (int num : A) {
                if (set.contains(B - num)) {
                    hasGoodPair = true;
                    break;
                }
                set.add(num);
            }

            System.out.println(hasGoodPair ? 1 : 0);
        }

        scanner.close();
    }
}
