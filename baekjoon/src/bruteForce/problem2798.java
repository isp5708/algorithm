package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem2798 {

	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int cardAmount,limitNumber,numberOfSum,result=0;
		String[] tmp;
		
		tmp=bf.readLine().split(" ");
		
		cardAmount=Integer.parseInt(tmp[0]);
		limitNumber=Integer.parseInt(tmp[1]);
		
		tmp=bf.readLine().split(" ");
		
		for(int a=0;a<tmp.length-2;a++) {
			for(int b=a+1;b<tmp.length-1;b++) {
				for(int c=b+1;c<tmp.length;c++) {
					numberOfSum=0;
					numberOfSum+=Integer.parseInt(tmp[a])+Integer.parseInt(tmp[b])+Integer.parseInt(tmp[c]);
					if(numberOfSum==limitNumber) {
						System.out.println(limitNumber);
						System.exit(0);
					}else if(numberOfSum<=limitNumber&&result<numberOfSum) {
						result=numberOfSum;
					}
				}
			}
		}
		System.out.println(result);

	}

}
