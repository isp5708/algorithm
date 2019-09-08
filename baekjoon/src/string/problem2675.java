package string;
import java.util.Scanner;
public class problem2675 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int numberOfTimes,count;
		String tmp;
		String[] tmpArray;
		
		numberOfTimes=s.nextInt();
		
		s.nextLine();
		
		tmpArray=new String[numberOfTimes];
		
		for(int i=0;i<numberOfTimes;i++) {
			tmpArray[i]=s.nextLine();
		}
		
		for(int i=0;i<numberOfTimes;i++) {
			count=tmpArray[i].charAt(0)-'0';
			for(int j=2;j<tmpArray[i].length();j++) {
				for(int t=0;t<count;t++)
					System.out.print(tmpArray[i].charAt(j));
			}
			System.out.println();
		}

	}

}
