package string;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class problem2908 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		String[] tmp = br.readLine().trim().split(" ");
		
		int[] sangsuAnswer=new int[2];
		String number;
		
		for(int i=0;i<tmp.length;i++) {
			number="";
			for(int j=tmp[i].length()-1;j>=0;j--) {
				number+=tmp[i].charAt(j);
			}
			sangsuAnswer[i]=Integer.parseInt(number);
		}
		
		System.out.println(sangsuAnswer[0]>sangsuAnswer[1]?sangsuAnswer[0]:sangsuAnswer[1]);

		
		

	}

}
