package for_;
import java.util.Scanner;

public class printCaseAaddB {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int count,a,b;
		
		count=s.nextInt();
		
		int[] tmpArray=new int[count];
		
		for(int i=0;i<count;i++) {
			a=s.nextInt();
			b=s.nextInt();
			
			tmpArray[i]=a+b;
		}
		
		for(int i=0;i<count;i++) {
			System.out.println("Case #"+(i+1)+": "+tmpArray[i]);
		}

	}

}
