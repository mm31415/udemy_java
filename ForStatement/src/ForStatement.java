public class ForStatement {
    public static void main(String[] args) {
        System.out.println(calculateInterest(10000.0, 2.0));
        System.out.println(calculateInterest(10000.0, 3.0));
        System.out.println(calculateInterest(10000.0, 4.0));

        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }


        for(int i = 2; i < 9; i++) {
            // could use (double) i to coerce int to double but java does that already
            System.out.println(String.format("%.2f", calculateInterest(10000, i)));
        }

        for(int i = 8; i > 1; i--) {
            // could use (double) i to coerce int to double but java does that already
            System.out.println(String.format("%.2f", calculateInterest(10000, i)));
        }

        int count = 0;
        for (int i = 0; i < 15; i++) {
            if(isPrime(i)) {
                System.out.println(i);
                count++;
                if(count == 3) {
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for(int i = 2; i <= (long) Math.sqrt(n); i++) {
            if(n % 2 == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }


}
