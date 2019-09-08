package array;
import java.util.Arrays;
import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		int[] tmpArray=new int[9];
		int[] tmp=new int[9];
		
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<tmpArray.length;i++) {
			tmpArray[i]=s.nextInt();
		}
		
		System.arraycopy( tmpArray, 0, tmp, 0, tmpArray.length );
		
		Arrays.sort(tmpArray);
		
		System.out.println(tmpArray[8]);
		
		for(int i=0;i<tmp.length;i++) {
			if(tmp[i]==tmpArray[8])
				System.out.println(i+1);
		}
	}

}
