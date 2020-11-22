import java.util.Scanner;

class CheckDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean checkValues = num1 != num2 && num2 != num3 && num3 != num1;
        System.out.println(checkValues);
    }
}
