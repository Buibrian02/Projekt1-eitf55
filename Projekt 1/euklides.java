import java.math.BigInteger;

public class euklides {
    private BigInteger p;
    private BigInteger q;
    private BigInteger n;
    private BigInteger e;
    private BigInteger m;
    private BigInteger d;

    public euklides(BigInteger p, BigInteger q){
        this.p = p;
        this.q = q;
        this.n = p.multiply(q); //p*q
        this.e = BigInteger.valueOf(2).pow(16).add(BigInteger.ONE); // e = a = 2^16 + 1; 
        this.m = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE)); //(p-1)(q-1);
        this.d = algorithm(e, m);
    }

    public BigInteger algorithm(BigInteger a, BigInteger m){
        BigInteger d1 = m;
        BigInteger v1 = BigInteger.ZERO;
        BigInteger v2 = BigInteger.ONE;
        BigInteger d2 = a;

        while (!d2.equals(BigInteger.ZERO)) {
            BigInteger q = d1.divide(d2);  
            BigInteger t2 = v1.subtract(q.multiply(v2));  
            BigInteger t3 = d1.subtract(q.multiply(d2));  

            v1 = v2;  
            d1 = d2;  
            v2 = t2;  
            d2 = t3;  
        }   
        
        BigInteger v = v1;
        BigInteger d = d1;

        if (d.equals(BigInteger.ONE)) {
            if (v.compareTo(BigInteger.ZERO) < 0) {
                v = v.add(m);  
            }
            return v;  
        } 
        else {
                System.out.println("No inverse");
            return null;
        }
    }
}
