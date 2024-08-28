import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        switch (age) {
            case 18:
                System.out.println("You are an adult.");
                break;
            case 17:
                System.out.println("You are a teenager.");
                break;
            case 16:
                System.out.println("You are a child.");
                break;
            default:
                System.out.println("Invalid age.");
                break;

        }
    }
}
