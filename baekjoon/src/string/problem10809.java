package string;
import java.util.Arrays;
import java.util.Scanner;

public class problem10809 {

	public static void main(String[] args) {
		int[] alpaIndex=new int[26];
		
		Scanner s=new Scanner(System.in);
		
		String tmp;
		tmp=s.nextLine();
		
		Arrays.fill(alpaIndex, -1);
		
		for(int i=0;i<tmp.length();i++) {
			if(alpaIndex[tmp.charAt(i)-'a']==-1)
				alpaIndex[tmp.charAt(i)-'a']=i;
		}
		
		for(int i=0;i<alpaIndex.length;i++) {
			System.out.print(alpaIndex[i]+" ");
		}

	}

}
