public class storePrimes {
    public static void main(String[] args) {
       int output[] = prime_numbers(5);
        for(int i=0;i<output.length;i++)
            System.out.print(output[i]+" ");
    }
    public static int[] prime_numbers(int n) {
        /*
         * Function to store first n prime_numbers in an array
         * Return the array containing the prime numbers
         */
        int primes[] = new int[n];
        int num = 2;
        int counter = 0;
        while (counter < n) {
            if (isPrime(num)) {
                primes[counter] = num;
                counter++;
            }
            num++;
        }
        return primes;

        /* Dont change anything below. If changed click on reset. */

    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;

    }
}
