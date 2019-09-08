package for_;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class speedyAaddB  {

	public static void main(String[] args) {
		
		String s;
		int count;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //識情
		try {
		count = Integer.parseInt(bf.readLine()); //Int
		int[] tmpArray=new int[count];
		
		for(int i=0;i<count;i++) {
			s=bf.readLine();
			
			String[] e=s.split(" ");
			
			tmpArray[i]=Integer.parseInt(e[0])+Integer.parseInt(e[1]);
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//識情
		
		for(int i=0;i<count;i++) {
			
			
			bw.write(tmpArray[i]+"\n");
			
		}
		bw.flush();
		bw.close();
		}catch(IOException e) {
			
		}
		
		
		
		

	}

}
