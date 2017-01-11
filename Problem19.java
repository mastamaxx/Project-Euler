
public class Problem19 {

	public static void main (String[] args) {
		
		long dateCode = 0;
		int yearCode = 1900;
		long SundayCount = 0;
		
		dateCode += 366; // set date to January 1, 1901
		yearCode += 1;
		
		while (yearCode <= 2000) {
			 
			SundayCount += isSunday(dateCode);
			dateCode += 31;
			
			SundayCount += isSunday(dateCode);
			if (yearCode%4 == 0 && yearCode%100 != 0)
				dateCode += 29;
			else
				dateCode += 28;
				
			SundayCount += isSunday(dateCode);
			dateCode += 31;
			
			SundayCount += isSunday(dateCode);
			dateCode += 30;
			
			SundayCount += isSunday(dateCode);
			dateCode += 31;
			
			SundayCount += isSunday(dateCode);
			dateCode += 30;
			
			SundayCount += isSunday(dateCode);
			dateCode += 31;
			
			SundayCount += isSunday(dateCode);
			dateCode += 31;
			
			SundayCount += isSunday(dateCode);
			dateCode += 30;
			
			SundayCount += isSunday(dateCode);
			dateCode += 31;
			
			SundayCount += isSunday(dateCode);
			dateCode += 30;
			
			SundayCount += isSunday(dateCode);
			dateCode += 31;
			
			yearCode += 1;
			
		}
		
		System.out.println(SundayCount);
		
	}
	
	public static int isSunday (long dateCode) {
		if (dateCode % 7 == 0)
			return 1;
		
		return 0;
	}
	
}
