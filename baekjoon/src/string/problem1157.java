package string;
import java.util.Arrays;
import java.util.Scanner;
public class problem1157 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String tmp;
		
		int[] alpaCount=new int[26];
		
		int maxCount,maxIndex;
		
		Arrays.fill(alpaCount, 0);
		
		tmp=s.nextLine();
		
		tmp=tmp.toLowerCase();
		
		for(int i=0;i<tmp.length();i++) {
			alpaCount[tmp.charAt(i)-'a']++;
		}
		
		maxCount=alpaCount[0];
		maxIndex=0;
		
		for(int i=1;i<alpaCount.length;i++) {
			if(maxCount<alpaCount[i]) {
				maxCount=alpaCount[i];
				maxIndex=i;
			}
		}
		
		for(int i=0;i<alpaCount.length;i++) {
			if(maxCount==alpaCount[i]&&maxIndex!=i) {
				System.out.println("?");
				System.exit(0);
			}
		}
		
		System.out.println((char)(maxIndex+'a'-32));

	}

}
