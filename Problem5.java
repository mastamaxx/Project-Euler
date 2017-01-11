

public class Problem5 {

	public static void main (String[] args) {
		double i;
		double sumOfSquares = 0;
		double squareOfSums = 0;
		double answer;
	
		for (i = 1; i <= 100; i++) {
			sumOfSquares += i * i;
		}
		
		for (i = 1; i <= 100; i++) {
			squareOfSums += i;
		}
		
		squareOfSums = Math.pow(squareOfSums, 2);
		
		answer = squareOfSums - sumOfSquares;
		
		System.out.printf("%f is the answer", answer);		
	}	
}