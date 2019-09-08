package eulerProblem5;

public class minOfdivide {
	
	public static long findMinOfDivide(int lastNumber) {
		long tmp=1l;
		for(int i=2;i<=lastNumber;i++) {
			tmp=lcm(tmp,i);
		}
		return tmp;
	}
	
	public static long lcm(long a,long b) {
		return a*b/gcd(a,b);
	}
	
	public static long gcd(long a,long b) {//최대공약수
		while(b!=0) {
			long tmp=a%b;
			a=b;
			b=tmp;
		}
		return a;
	}
	

	public static void main(String[] args) {
		System.out.println(findMinOfDivide(20));

	}

}
