import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double p = scanner.nextDouble();
        double k = scanner.nextDouble();
        int years = 0;
        while (m < k) {
            m += (m * p) / 100;
            years++;
        }
        /*for (int i = 1; m < k; i++) {
            m += (m * p) / 100;
            years = i;
        }

         */
        System.out.println(years);
    }
}