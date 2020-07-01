package FindPrime;

public class FindPrime {

    public static boolean isPrime(int num) {
        return num > 1 && java.math.BigInteger.valueOf(num).isProbablePrime(1);
    }

}
