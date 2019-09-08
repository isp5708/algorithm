package array;
import java.util.Scanner;

public class problem5 {
	public static void main(String[] args) {
		int[] i = new int[10];
		Scanner s= new Scanner(System.in);
		boolean[] modArray=new boolean[42];
		int count=0;
		
		for(int j=0;j<i.length;j++) {
			i[j]=s.nextInt();
		}
		
		for(int j=0;j<i.length;j++) {
			modArray[i[j]%42]=true;
		}
		
		for(int j=0;j<modArray.length;j++) {
			if(modArray[j]==true)
				count++;
		}
		System.out.println(count);
	}
}
