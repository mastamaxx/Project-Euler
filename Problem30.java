

public class Problem30 {

	public static void main (String[] args) {
		
		long total = 0;
		
		for (int i = 2; i <= 999999; i++) {
			
			long j = 0;
			int k = i;
			
			while (k > 0) {
				j += Math.pow(k%10, 5);
				k /= 10;
				if (j > i)
					break;
			}
			
			if (j == i) {
				total += i;
			}
			
		}
		
		System.out.println(total);
		
	}
	
	
}
