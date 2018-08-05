import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int min = 0;
//        int max = 0;
//        boolean first = true;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int num = scanner.nextInt();

//                if (first) {
//                    first = false;
//                    min = num;
//                    max = num;
//                } else if (min > num) {
                if (min > num) {
                    min = num;
                } else if (max < num) {
                    max = num;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);


        scanner.close();
    }
}
