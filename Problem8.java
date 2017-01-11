public class Problem8 {

	public static void main (String[] args) {
		
		
		double a = 1;
		double b = 2;
		double c = 1000 - a - b;
		double answer = 0;
		
		for (a = 1; a <= 997; a++) {
			
			for (b = a; b <= 997; b++) {
				
				 c = 1000 - a - b;
				 
				 if (c >= 0) {
					 if (c == (a*a + b*b)/c) {
					 
						 answer = a * b * c;
						 break;
					 }
				 }
			}
			
			if (answer != 0) {
				break;
			}
			
		}
		
		System.out.printf("%f is the answer%n", answer);
		System.out.printf("a b c %f %f %f%n", a, b, c);
		System.out.printf("a^2 b^2 c^2 %f %f %f%n", a*a, b*b, c*c);
		System.out.printf("(a*a + b*b)/c %f", (a*a + b*b)/c);
		
	}
	
}
