package string;
import java.util.Scanner;

public class problem1152 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String tmp,tmp1;
		String[] wordArray;
		
		tmp=s.nextLine();
		
		tmp1=tmp.trim();
		
		wordArray=tmp1.split(" ");
		
		if(!wordArray[0].equals(""))
			System.out.println(wordArray.length);
		else
			System.out.println("0");

	}

}
