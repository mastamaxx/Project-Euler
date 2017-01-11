
public class Problem12 {

	public static void main (String[] args) {
		
		double answer = 100;
		int count = 0;
		double n = 0;
		long j = 0;
		
		while (count <= 500) {
			
			j++;
			n += j; 
			count = 0;
		
			for (long i = 1; i <= Math.sqrt(n); i++) {
				
				if (n%i == 0)
					count+=2;
				
			}
			
			if (count > 500) {
				answer = n;
			}
			
		}
		
		System.out.printf("%.0f is the answer", answer);
		System.out.printf("%n%d", j);
		
	}
	
}
