
public class Problem7 {

	public static void main (String[] args) {
		
		long i = 2;
		int countPrime = 0;
		
		while (countPrime < 10001) {
			
			if (isPrime(i))
				countPrime++;
			
			i++;
			
		}
		
		System.out.printf("%d is the %dth prime number", i, countPrime);		
	}

	public static boolean isPrime (long num) {
		
		for (int i = 2; i < Math.sqrt((double) num); i++) {
			if (num%i == 0) {
				return false;
			}
		}
		return true;
	}


}