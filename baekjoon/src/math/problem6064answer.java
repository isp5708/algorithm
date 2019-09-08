package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem6064answer {

	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int testCaseCount, M, N, x, y,year,cnt;
		String[] tmp;

		testCaseCount = Integer.parseInt(bf.readLine());

		for (int i = 0; i < testCaseCount; i++) {
			tmp = bf.readLine().split(" ");
			M = Integer.parseInt(tmp[0]);
			N = Integer.parseInt(tmp[1]);
			x = Integer.parseInt(tmp[2]);
			y = Integer.parseInt(tmp[3]);
			year=-1;
			cnt=0;
			if(y==N)
				y=0;
			
			while(true) {
				if((M*cnt+x)%N==y) {
					year=M*cnt+x;
					break;
				}
				
				
				if((M*cnt+x)>M*N)
					break;
				
				cnt++;
			}

			System.out.println(year);
		}

	}

}
