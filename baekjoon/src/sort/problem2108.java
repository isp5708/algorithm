package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


public class problem2108 {

	public static void main(String[] args)throws IOException {
		double arithmeticMean;
		int median,range;//산술평균,중앙값,범위
		int[] frequencyOfNumber=new int[8001];
		
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		
		int inputCnt,maxNumber=-4001,minNumber=4001;//입력수 갯수,최대수,최소수
		int tmp,sum=0;
		int maxFrequency;
		int[] t;
		ArrayList<Integer> n=new ArrayList<Integer>();
		ArrayList<Integer> n1=new ArrayList<Integer>();
		
		inputCnt=Integer.parseInt(bf.readLine());
		t=new int[inputCnt];
		for(int i=0;i<inputCnt;i++) {
			tmp=Integer.parseInt(bf.readLine());
			frequencyOfNumber[tmp+4000]++;
			t[i]=tmp;
			if(maxNumber<tmp)
				maxNumber=tmp;
			if(minNumber>tmp)
				minNumber=tmp;
			sum+=tmp;
		}
		
		arithmeticMean=Math.round(sum/(double)inputCnt);// 산술평균
		range=maxNumber-minNumber;//범위
		
		for(int i=0;i<frequencyOfNumber.length;i++) {
			if(frequencyOfNumber[i]!=0)
				n.add(i-4000);
		}
		Arrays.sort(t);
		median=t[t.length/2];//중앙값구함
		
		maxFrequency=frequencyOfNumber[n.get(0)+4000];
		for(int i=0;i<n.size();i++) {
			if(maxFrequency<frequencyOfNumber[n.get(i)+4000])
				maxFrequency=frequencyOfNumber[n.get(i)+4000];
		}
		for(int i=0;i<frequencyOfNumber.length;i++) {
			if(maxFrequency==frequencyOfNumber[i])
				n1.add(i-4000);
		}
		
		
		System.out.println((int)arithmeticMean);
		System.out.println(median);
		if(n1.size()>1)
			System.out.println(n1.get(1));
		else {
			System.out.println(n1.get(0));
		}
		System.out.println(range);
	}

}
