import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            } else if (n % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }

        }
    }
}