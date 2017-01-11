
public class Problem4 {

	public static void main (String[] args) {
		
		long i = 8462696833L;
		long answer = i;
		
		while (i < 600851475143L) {
			
			if (600851475143L%i == 0) {
				
				int notPrime = 0;
				
				for (int j = 2; j < i; j++) {
					if (i%j == 0) {
						notPrime = 1;
						break;
					}			
				}
				
				if (notPrime == 0) {
					answer = i;
					break;
				}				
			}			
			i--;
		}		
		System.out.printf("%d ", answer);		
	}	
}