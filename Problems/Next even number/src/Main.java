import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = a + (((a + 1) % 2) * 2) + ((a + 2) % 2);
        System.out.println(b);
    }
}
