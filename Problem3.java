import java.util.Scanner;

public class Problem3 {
	
	public static void main (String[] args) { 
	long i = 8462696833L;
	long largest = i;
	
	while (i <= 8462696833L) {
		
		
		if (i%3 != 0 && i%2 != 0 && i%5 !=0 && 600851475143L%i == 0) {
			largest = i;
			break;
		}
		
		i--;
		
		
	}
	
	System.out.printf("%d ", largest);
		 
}
}
