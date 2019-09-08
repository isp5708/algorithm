package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class problem5622 {

	public static void main(String[] args) throws IOException {
		String[] dial = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"}; // 2 3 4 5 6 7 8 9
		
		HashMap<String,Integer> tmp=new HashMap<String,Integer>();
		
		tmp.put("ABC",3);
		tmp.put("DEF",4);
		tmp.put("GHI",5);
		tmp.put("JKL",6);
		tmp.put("MNO",7);
		tmp.put("PQRS",8);
		tmp.put("TUV",9);
		tmp.put("WXYZ",10);
		
		String input;
		
		int sum=0;
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		input=br.readLine();
		
		for(int i=0;i<dial.length;i++) {
			for(int j=0;j<input.length();j++) {
				if(dial[i].contains(input.charAt(j)+""))
					sum+=tmp.get(dial[i]);
			}
		}
		System.out.println(sum);

	}

}
