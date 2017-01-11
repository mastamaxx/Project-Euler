public class Problem9 {

	public static void main (String[] args) {
					
		int k;
		long total = 2;
		
		for (k = 3; k <= 2000000; k++) {
			
			if (isPrime(k))
				total += k;
			
		}
		
		System.out.printf("%d is the answer", total);
		
	}
	
	
	public static boolean isPrime(int num) {
		
			for (int i = 2; i < (num/2 + 1); i++) {
			if (num%i == 0) {
				return false;
				}
			}
				
		return true;
		
	}	
}
