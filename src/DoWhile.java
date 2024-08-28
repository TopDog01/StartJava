import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int value = scanner.nextInt();
//        while (value !=5) {
//            System.out.println("Please enter a number 5:");
//            value = scanner.nextInt();
//        }
//        System.out.println("You've entered 5!");
        int value;
        do {
            System.out.println("Please enter a number 5:");
            value = scanner.nextInt();
        } while (value != 5);
        System.out.println("You've entered 5!");
    }
}
