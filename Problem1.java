
public class Problem1 {
	public static void main (String[] args) { 
	int i;
	int total = 0;
	
	for (i = 3; i < 1000; i++) {
		
		if (i%3 == 0 || i%5 == 0)
			total += i;
		
	}
	
	System.out.printf("%d ", total);
		 
}
}
