package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem10250 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int input,H,W,N;
		
		String[] tmp;
		
		String roomNumber;
		
		input=Integer.parseInt(bf.readLine());
		
		for(int i=0;i<input;i++) {
			tmp=bf.readLine().split(" ");
			
			H=Integer.parseInt(tmp[0]);
			W=Integer.parseInt(tmp[1]);
			N=Integer.parseInt(tmp[2]);
			
			roomNumber="";
			
			if(N%H!=0) {
				roomNumber+=Integer.toString(N%H);
				if(N/H+1<10) {
					roomNumber+="0";
					roomNumber+=Integer.toString(N/H+1);
				}else {
					roomNumber+=Integer.toString(N/H+1);
				}
			}else {
				roomNumber+=Integer.toString(H);
				
				if(N/H<10) {
					roomNumber+="0";
					roomNumber+=Integer.toString(N/H);
				}else {
					roomNumber+=Integer.toString(N/H);
				}
			}
			System.out.println(roomNumber);
		}

	}

}
