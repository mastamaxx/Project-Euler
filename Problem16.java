import java.math.BigInteger;

public class Problem16 {

	public static void main (String[] args) {
		
		BigInteger answer = BigInteger.valueOf(0);
		BigInteger n = new BigInteger("10715086071862673209484250490600018105614048117055336074437503883703510511249361224931983788156958581275946729175531468251871452856923140435984577574698574803934567774824230985421074605062371141877954182153046474983581941267398767559165543946077062914571196477686542167660429831652624386837205668069376");
		BigInteger j;
		
		for (int i = 1; i <= 400; i++) {
			
			j = n.remainder(BigInteger.valueOf(10));
			answer = answer.add(j);
			n = n.divide(BigInteger.valueOf(10));
			
		}
		
		System.out.println("n = " + n);
		System.out.println("answer =" + answer);
		
	}
	
}

