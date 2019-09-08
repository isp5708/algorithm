package for_;
import java.util.Scanner;

public class aAddB {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a, b, count;
		
		count=s.nextInt();
		
		int[] tmpArray=new int[count];
		
		for(int i=0;i<count;i++) {
			a=s.nextInt();
			b=s.nextInt();
			
			tmpArray[i]=a+b;
		}
		
		for(int i=0;i<count;i++) {
			System.out.println(tmpArray[i]);
		}
		

	}

}
