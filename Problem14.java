
public class Problem14 {

	public static void main (String[] args) {
		
		int n;
		long largestCount = 0;
		int answer = 3;
		
		for (n = 3; n <= 1000000; n++) {
			
			long j = n;
			long count = 0;
						
			while (j != 1) {
				
				count++;
				
				if (j%2 == 0) {
					j = j / 2;				
				} else {
					j = 3 * j + 1;
				}
				
			}
			
			if (count > largestCount) {
				largestCount = count;
				answer = n;
			}
			
		}
		
		System.out.printf("%d is the answer", answer);
		System.out.printf("%nit took %d calculations", largestCount);
		
	}
	
}
