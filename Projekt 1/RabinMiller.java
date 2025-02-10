import java.util.Random;

public class RabinMiller {

    public boolean rabinMiller(int n, int k) {

        // input n > 3, an odd integer to be tested for primality
        if (n < 3) {
            return false;
        }

        // Write n - 1 as 2^rs with s odd by factoring powers of 2 from n - 1
        int s = n - 1;
        int r = 0;

        while (s % 2 == 0) {
            s = s / 2;
            r++;
        }

        // Pick random integer a in the range [2, n-2]
        Random rand = new Random();
        int a = rand.nextInt(n - 2) + 2;

        // x = a^s mod n
        int x = (int) Math.pow(a, s) % n;

        // if x = 1 or x = n-1 then return probably prime
        if (x == 1 || x == n - 1) {
            System.out.println("probablyPrime");
            return true;
        }

        // for j=1 to r-1
        for (int j = 1; j < r - 1; j++) {
            // x = a^s mod n
            x = (int) Math.pow(a, Math.pow(2, j) * s) % n;
        }

        if (x == 1) {
            System.out.println("isComposite");
            return false;
        } else if (x == n - 1) {
            System.out.println("ProbablyPrime");
            return true;
        }

        System.out.println("isComposite");
        return false;

    }

}
