import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

          while (true) {
            System.out.println("Type a number to get its corresponding day (1-7)");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
            System.out.println("Check another integer (1-7)? (yes/no)");
            String decision = scanner.nextLine();
            if (!decision.equalsIgnoreCase("yes") && !decision.equalsIgnoreCase("yup"))
                break;
        }
    }
}