import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    RabinMiller a = new RabinMiller();
    String filePath = "C:\\Users\\frikk\\Documents\\Primes.txt";

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
