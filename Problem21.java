
public class Problem21 {

	public static void main (String[] args) {
		
		long d1;
		long d2;
		long answer = 0;
		
		for (int i = 2; i < 10000; i++) {
			
			d1 = 0;
			d2 = 0;
			
			for (int j = 1 ; j<=i/2; j++) {
				if (i%j == 0)
					d1 += j;
			}
			
			if (d1 != i) {
				for (int k = 1; k <= d1/2; k++) {
					if (d1%k == 0) {
						d2 += k;
					}
				}
			}
			
			// System.out.println(i + "\t" + d1);
			
			if (d2 == i) {
				answer += i;
			}
			
		}
		
		System.out.println(answer);
		
	}
	
}
