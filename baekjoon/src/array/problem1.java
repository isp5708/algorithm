package array;
import java.util.Scanner;


public class problem1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int max,min,count;
		
		count=s.nextInt();
		
		int[] tmpArray=new int[count];
		
		for(int i=0;i<count;i++) {
			tmpArray[i]=s.nextInt();
		}
		
		max=tmpArray[0];
		min=tmpArray[0];
		
		for(int i=1;i<count;i++) {
			if(max<tmpArray[i])
				max=tmpArray[i];
			if(min>tmpArray[i])
				min=tmpArray[i];
		}
		System.out.println(min+" "+max);

	}

}
