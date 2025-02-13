import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.*;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    RabinMiller a = new RabinMiller();
    String filePath = "C:\\Users\\frikk\\Documents\\Primes.txt";

    try {

      Scanner scan = new Scanner(new File(filePath));

      while (scan.hasNext()) {
        long startTime = System.nanoTime();
        a.isPrime(scan.nextBigInteger(), 20);
        long endTime = System.nanoTime();

      }

    } catch (Exception e) {

    }

  }
}
