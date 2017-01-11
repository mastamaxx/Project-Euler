
public class Problem2 {
	
	public static void main (String[] args) { 
	int i = 1;
	int j = 0;
	int oldI;
	int total = 0;
	
	while (i <= 4000000) {
		
		oldI = i;
		i += j;
		
		if (i%2 == 0)
			total += i;
		
		j = oldI;
		
		
	}
	
	System.out.printf("%d ", total);
		 
}
}
