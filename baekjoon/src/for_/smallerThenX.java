package for_;
import java.util.Scanner;

public class smallerThenX {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int pivot,indexCount;
		int[] tmpArray;
		
		indexCount=s.nextInt();
		pivot=s.nextInt();
		
		tmpArray=new int[indexCount];
		
		for(int i=0;i<indexCount;i++) {
			tmpArray[i]=s.nextInt();
		}
		
		for(int i=0;i<indexCount;i++) {
			if(tmpArray[i]<pivot)
				System.out.print(tmpArray[i]+" ");
		}

	}

}
