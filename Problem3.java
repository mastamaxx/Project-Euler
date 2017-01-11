
public class Problem3 {

	public static void main (String[] args) {
		int i = 2522;
		for (i = 2522; i <=  2432902008176640000L; i+=2) {
			int check = 0;
			for (int j = 2; j <= 20; j++) {
				
				if (i%j != 0) {
					check = 1;
					break;
				}
			}
			
			if (check == 0)
				break;	
		}
		System.out.printf("%d ", i);		
	}	
}