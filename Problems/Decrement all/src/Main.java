import java.util.Scanner;

class Decrement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.println(--a + " " + --b  + " " + --c  + " " + --d);
    }
}