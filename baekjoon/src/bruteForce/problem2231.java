package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem2231 {
	static int number;
	static int sum;
	
	public static void lookForConstructor(int x) {
		int tmp=x;
		sum+=tmp;
		while(tmp!=0) {
			sum+=tmp%10;
			
			tmp/=10;
		}
		if(sum==number) {
			System.out.println(x);
			System.exit(0);
		}
		sum=0;
		
	}
	
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		number=Integer.parseInt(bf.readLine());
		
		for(int i=1;i<number;i++) {
			lookForConstructor(i);
		}
		System.out.println("0");
		
	}

}
