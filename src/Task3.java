import java.math.BigInteger;

public class Task3 {
    public static BigInteger result;

    public static BigInteger factorial(long n) {
        if (n <= 0) {
            return result = BigInteger.ONE;
        } else {
            return result = BigInteger.valueOf(n).multiply(factorial(n - 1));
        }

    }

    public static long sumDigit(BigInteger result){
        String resultBigInt = String.valueOf(result);
        char[] resultCharFromBigInt = resultBigInt.toCharArray();
        int[] resultIntFromCharBigInt = new int[resultCharFromBigInt.length];
        long sumDigitsOfBigInt = 0;
        for (int i = 0; i < resultCharFromBigInt.length-1; i++) {
            resultIntFromCharBigInt[i] = Character.getNumericValue(resultCharFromBigInt[i]);
            sumDigitsOfBigInt += resultIntFromCharBigInt[i];
        }
        return sumDigitsOfBigInt;
    }

    public static void main(String[] args) {
        System.out.println(factorial(100));
        System.out.println(sumDigit(factorial(100)));


    }
}
