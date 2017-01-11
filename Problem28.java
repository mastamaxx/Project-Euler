
public class Problem28 {

	public static void main (String[] args) {
		
		long spiralSide = 1;
		long cornerValue = 1;
		long totalCorners =1;
		long cornerIncrementer = 0;
		
		spiralSide += 2;
			
		while (spiralSide <= 1001) {
			
			cornerIncrementer += 2;
			
			for (int i = 1; i <= 4; i++) {
				cornerValue += cornerIncrementer;
				totalCorners += cornerValue;
			}
			
			spiralSide += 2;
		}
		
		System.out.println(totalCorners);
		
	}
	
	
}
