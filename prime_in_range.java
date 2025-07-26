public class prime_in_range {

    public static boolean prime(int n) {
        if (n == 2) {
            return true;
        }

        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void primes_in_range(int n) {
        for (int i = 2; i <= n; i++) {
            if (prime(i)) {
                System.out.print(i + " ");  // changed println to print for better output
            }
        }
    }

    public static void main(String[] args) {
        primes_in_range(28);
    }
}
