package array;
import java.util.Scanner;

public class problem7 {
	public static void main(String[] args) {
		String[] tmp;
		int inputAmount;
		int sum=0,increasingValue;
		Scanner s=new Scanner(System.in);
		inputAmount=s.nextInt();
		
		tmp=new String[inputAmount];
		
		for(int i=0;i<tmp.length;i++) {
			tmp[i]=s.next();
		}
		
		for(int i=0;i<tmp.length;i++) {
			increasingValue=0;
			for(int j=0;j<tmp[i].length();j++) {
				if(tmp[i].charAt(j)=='O') {
					increasingValue++;
					sum+=increasingValue;
				}else if(tmp[i].charAt(j)=='X') {
					increasingValue=0;
				}
			}
			System.out.println(sum);
			sum=0;
		}
		
	}

}
