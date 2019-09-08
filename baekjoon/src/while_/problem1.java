package while_;
import java.util.ArrayList;
import java.util.Scanner;


public class problem1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a,b;
		ArrayList<Integer> tmpList=new ArrayList<Integer>();
		
		while(true) {
			a=s.nextInt();
			b=s.nextInt();
			
			if(a==0&&b==0)
				break;
			
			tmpList.add(a+b);
		}
		
		for(int i=0;i<tmpList.size();i++) {
			System.out.println(tmpList.get(i));
		}

	}

}
