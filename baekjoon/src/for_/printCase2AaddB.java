package for_;
import java.util.Scanner;

public class printCase2AaddB {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int count,a,b;
		
		count=s.nextInt();
		
		int[] tmpArrayA=new int[count];
		int[] tmpArrayB=new int[count];
		
		for(int i=0;i<count;i++) {
			a=s.nextInt();
			b=s.nextInt();
			
			tmpArrayA[i]=a;
			tmpArrayB[i]=b;
		}
		
		for(int i=0;i<count;i++) {
			System.out.println("Case #"+(i+1)+": "+tmpArrayA[i]+" + "+tmpArrayB[i]+" = "+(tmpArrayA[i]+tmpArrayB[i]));
		}

	}

}
