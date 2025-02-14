import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Random;

public class generatePrime {
    public int generatePrimes(String filePath, RabinMiller rm) {
        int[] bitLengths = {512, 1024, 2048, 4096};
        int numPrimes = 100;
        int k = 20;
        int primeCount = 0;
        Random rand = new Random();

        try {
            PrintWriter writer = new PrintWriter(filePath);
            
            for (int bitLength : bitLengths) {
                // Print message and flush immediately to prevent buffering issues
                System.out.println("Generating " + numPrimes + " primes of " + bitLength + " bits...");
                System.out.flush(); 

                // Debugging print to check if the loop reaches 4096
                if (bitLength == 4096) {
                    System.out.println("Debug: Entered 4096-bit prime generation loop.");
                    System.out.flush();
                }

                // Start timer for prime generation
                long genStartTime = System.nanoTime();

                for (int i = 0; i < numPrimes; i++) {
                    BigInteger prime;
                    do {
                        prime = BigInteger.probablePrime(bitLength, rand);
                    } while (!rm.isPrime(prime, k));

                    writer.println(prime);
                    primeCount++; // Count generated primes
                }

                // End timer and calculate elapsed time
                long genEndTime = System.nanoTime();
                double genElapsedTime = (genEndTime - genStartTime) / 1e6; // Convert to milliseconds
                System.out.println("Time to generate " + numPrimes + " primes of " + bitLength + " bits: " + genElapsedTime + " ms");
                System.out.flush();
            }

            writer.close();
            System.out.println("Primes saved to: " + filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return primeCount; // Return total primes written
    }
}
