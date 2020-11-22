import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();
        String string2 = string1.substring(index1, index2 + 1);
        System.out.println(string2);
    }
}