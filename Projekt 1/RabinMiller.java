import java.math.BigInteger;
import java.util.Random;

public class RabinMiller {

    public boolean isPrime(BigInteger n, int k) {

        // input n > 3, an odd integer to be tested for primality

        if (n.equals(BigInteger.valueOf(3))) {
            System.out.println(n + " :is Prime");
            return true;
        }

        if (n.equals(BigInteger.valueOf(2))) {
            System.out.println(n + " :is Prime");
            return true;
        }

        if (n.equals(BigInteger.valueOf(1))) {
            System.out.println(n + " :is not Prime");
            return false;
        }
        if (n.mod(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0))) {
            System.out.println(n + " is Composite");
            return false;
        }

        // Write n - 1 as 2^rs with s odd by factoring powers of 2 from n - 1
        BigInteger s = n.subtract(BigInteger.valueOf(1));
        int r = 0;

        while (s.mod(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0))) {
            s = s.divide(BigInteger.valueOf(2));
            r++;
        }

        Random rand = new Random();

        for (int i = 0; i < k; i++) {
            // Pick random integer a in the range [2, n-2] k times
            BigInteger a = BigInteger.valueOf(rand.nextInt(n.intValue() - 2) + 2);

            // x = a^s mod n
            BigInteger x = a.modPow(s, n);

            // if x = 1 or x = n-1 then return probably prime
            if (x.equals(BigInteger.valueOf(1)) || x.equals(n.subtract(BigInteger.valueOf(1)))) {
                System.out.println(n + " ProbablyPrime");
                return true;
            }

            for (int j = 0; j < r - 1; j++) {
                // x = a^s mod n

                x = x.modPow(BigInteger.valueOf(2), n);

                if (x.equals(BigInteger.valueOf(1))) {
                    System.out.println(n + " isComposite");
                    return false;
                } else if (x.equals(n.subtract(BigInteger.valueOf(1)))) {
                    System.out.println(n + " ProbablyPrime");
                    return true;
                }
            }

        }

        System.out.println("isComposite");
        return false;

    }

}
