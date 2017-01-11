
public class Problem6 {

	public static void main (String[] args) {
		int i;
		int j;
		int product;
		int answer = 0;
	
		for (i = 999; i >= 100; i--) {
			for (j = 999; j >= 100; j--) {
				
				product = j * i;
				
				if (product > answer) {
				
					int sixDigit = product%10;
					int oneDigit = product/100000;
					int twoDigit = product/10000%10;
					int threeDigit = product/1000%10;
					int fourDigit = product/100%10;
					int fiveDigit = product/10%10;
						
					if (oneDigit == sixDigit && twoDigit == fiveDigit && threeDigit == fourDigit)
						answer = product;
				}
			}
		}
		System.out.printf("%d is the answer", answer);		
	}	
}