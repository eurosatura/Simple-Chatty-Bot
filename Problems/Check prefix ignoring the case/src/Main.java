import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        //boolean checkString = string1.toUpperCase().startsWith("J");
        //System.out.println(checkString);
        System.out.println(string1.toUpperCase().charAt(0) == 'J');
    }
}