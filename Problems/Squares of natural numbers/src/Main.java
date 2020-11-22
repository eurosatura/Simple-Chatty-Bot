import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        /*
        int s = 0;
        int i = 1;
        do {
            s = i * i;
            i++;
            if (s <= n) {
                System.out.println(s);
            }
        } while (s < n);

         */
        for (int i = 1; i * i < n; i++) {
            System.out.println(i * i);
        }
    }
}
