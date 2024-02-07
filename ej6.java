import java.util.Arrays;
    public class ej6 {
        public static void main(String[] args) {
            int N = 10; // Change N to the desired number of prime numbers

            int[] primes = getFirstNPrimes(N);

            System.out.println("First " + N + " prime numbers:");
            System.out.println(Arrays.toString(primes));
        }

        public static int[] getFirstNPrimes(int N) {
            int[] primes = new int[N];
            int count = 0;
            int number = 2;

            while (count < N) {
                if (isPrime(number)) {
                    primes[count] = number;
                    count++;
                }
                number++;
            }

            return primes;
        }

        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }
