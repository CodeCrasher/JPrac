import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Welcome to MyTi!\n" +
                    "Choose an option:\n" +
                    "1. Buy a travel pass\n" +
                    "2. Charge my MyTi\n" +
                    "3. Show remaining credit 0. Quit\n" +
                    "Please make a selection:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Hello");
                    break;
                case 2:
                    System.out.println("Hello2");
                    break;
                case 3:
                    System.out.println("Hello3");
                    break;
                case 0:
                    System.out.println("Thank you for the purchase");
                    break;
                default:
                    System.out.println("Wrong Choice.");
                    break;
            }
        } while (true);
    }
}