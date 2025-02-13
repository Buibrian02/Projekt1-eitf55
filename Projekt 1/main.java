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
        "13407807929942597099574024998205846127479365820592393377723561443721764030073546976801874298166903427690031858186486050853753882811946569946433649006084171"),
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
