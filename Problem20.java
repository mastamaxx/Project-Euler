import java.math.BigInteger;

public class Problem20 {

	public static void main (String[] args) {
		
		long answer = 0;
		BigInteger factorial = BigInteger.valueOf(1);
		BigInteger j;
		
		for (long i = 100; i > 0; i--) {
			
			factorial = factorial.multiply(BigInteger.valueOf(i));
			
		}
		
		for (int k = 1; k <= 160; k++) {
			
			j = factorial.remainder(BigInteger.valueOf(10));
			answer += j.longValue();
			factorial = factorial.divide(BigInteger.valueOf(10));
			
		}
		
		System.out.printf("%d is the facortial", factorial);
		System.out.printf("%n%d is the answer", answer);
		
	}
	
}
