import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;

        while (count <= 10) {
            System.out.println("Enter number #" + count);
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                sum += scanner.nextInt();
                count++;
            } else {
                System.out.println("Input was invalid");
            }
            scanner.nextLine();
        }

        System.out.println("Total is " + sum);

        scanner.close();
    }
}