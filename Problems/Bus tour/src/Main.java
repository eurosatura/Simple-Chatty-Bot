import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();

        //System.out.println("Bus height is " + busHeight);
        //System.out.println("Number of bridges is " + numberOfBridges);
        int i = 1;
        while (scanner.hasNext()) {
            int bridgeHeight = scanner.nextInt();
            if (bridgeHeight <= busHeight) {
                System.out.println("Will crash on bridge " + i);
                break;
            }
            if (numberOfBridges == i) {
                System.out.println("Will not crash");
                break;
            }
            i++;
        }
    }
}