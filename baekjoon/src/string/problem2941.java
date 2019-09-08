package string;
import java.util.Scanner;

public class problem2941 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			
		String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		String tmp;
		
		tmp=s.nextLine();
		
		for(int i=0;i<croatia.length;i++) {
			if(tmp.contains(croatia[i]))
				tmp=tmp.replaceAll(croatia[i], " ");
		}
		System.out.println(tmp.length());

	}

}
