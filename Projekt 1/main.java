import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    RabinMiller a = new RabinMiller();
    String filePath = "C:\\Users\\frikk\\Documents\\Primes.txt";

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
     * while (scan.hasNext()) {
     * long start = System.nanoTime();
     * a.isPrime(scan.nextBigInteger(), 20);
     * long end = System.nanoTime();
     * 
     * long diff = end - start;
     * 
     * System.out.println("Tiden det tog är: " + diff);
     * }
     * 
     * } catch (Exception e) {
     * 
     * }
     */

  }
}
