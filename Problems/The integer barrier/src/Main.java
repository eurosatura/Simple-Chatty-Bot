import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int element = scanner.nextInt();
            if (element == 0) {
                break;
            }
            sum += element;
            if (sum >= 1000) {
                break;
            }
        }
        if (sum >= 1000) {
            System.out.println(sum - 1000);
        } else {
            System.out.println(sum);
        }
    }
}