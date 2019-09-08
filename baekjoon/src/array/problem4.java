package array;
import java.util.Scanner;
public class problem4 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a,b,c,multi;
		
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		
		multi=a*b*c;
		
		int[] countNumber=new int[10];
		
		while(multi!=0) {
			countNumber[multi%10]++;
			multi=multi/10;
		}
		
		for(int i=0;i<countNumber.length;i++) {
			System.out.println(countNumber[i]);
		}

	}

}
