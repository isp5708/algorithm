package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class problem7568 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int people, bigIndex=0;
		int[] x, y;
		int count;
		int[] bigRanking;
		String[] tmp;

		people = Integer.parseInt(bf.readLine());

		x = new int[people];
		y = new int[people];
		bigRanking = new int[people];
		Arrays.fill(bigRanking, 1);


		for (int i = 0; i < people; i++) {
			tmp = bf.readLine().split(" ");
			x[i] = Integer.parseInt(tmp[0]);
			y[i] = Integer.parseInt(tmp[1]);
		}

		for(int i=0;i<people;i++) {
			for(int j=0;j<people;j++) {
				if(x[i]<x[j]&&y[i]<y[j])
					bigRanking[i]++;
			}
		}
		
		
		for(int i=0;i<people;i++) {
			System.out.print(bigRanking[i]+" ");
		}

	}

}
