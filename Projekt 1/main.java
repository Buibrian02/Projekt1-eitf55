import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    RabinMiller a = new RabinMiller();
    String filePath = "C:\\Users\\Butte\\Documents\\Primes.txt";
    generatePrime generator = new generatePrime();

    int totalGenerated = generator.generatePrimes(filePath, a);
        System.out.println("Total primes written: " + totalGenerated);

        int totalVerified = 0;
    long start = System.currentTimeMillis();
    a.isPrime(new BigInteger(
        "321321321321312312321312312"),
        20);
    long end = System.currentTimeMillis();

    long diff = end - start;

    System.out.println("Tiden det tog är: " + diff);

    /*
     * try {
     * 
     * Scanner scan = new Scanner(new File(filePath));
     * 
     * while (scan.hasNextBigInteger()) {
     * long start = System.nanoTime();
     * a.isPrime(scan.nextBigInteger(), 20);
     * long end = System.nanoTime();
     *         System.out.println("Checked in " + (endTime - startTime) / 1e6 + " ms");
        totalVerified++;
     * long diff = end - start;
     * 
     * System.out.println("Tiden det tog är: " + diff);
     * }
     *       scan.close();
     * } 
      catch (Exception e) {
     *           e.printStackTrace();
     * }
     */
      System.out.println("Total primes verified: " + totalVerified);
  }
}
