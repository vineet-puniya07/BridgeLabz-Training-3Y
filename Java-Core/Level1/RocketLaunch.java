import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter countdown start number: ");
        int counter = sc.nextInt();

        // Countdown loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--; 
        }

        System.out.println("🚀 Rocket Launched!");
        sc.close();
    }
}
