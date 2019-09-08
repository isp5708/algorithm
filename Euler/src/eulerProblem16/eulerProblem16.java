package eulerProblem16;
import java.math.BigInteger;

public class eulerProblem16 {

	public static void main(String[] args) {
		BigInteger number= new BigInteger("1");
		BigInteger sum=new BigInteger("0");
		
		for(int i=0;i<1000;i++) {
			number=number.multiply(BigInteger.valueOf(2));
		}
		
		while(number!=BigInteger.valueOf(0)) {
			sum=sum.add(number.mod(BigInteger.valueOf(10)));
			number=number.divide(BigInteger.valueOf(10));
		}
		System.out.println(sum);

	}

}
