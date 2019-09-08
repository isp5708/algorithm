package array;
import java.util.Scanner;

public class problem6 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		double[] tmpTestScore;
		int testAmount;
		double maxScore;
		double sumOfAllTestScore=0;
		
		testAmount=s.nextInt();
		tmpTestScore=new double[testAmount];
		
		for(int i=0;i<tmpTestScore.length;i++) {
			tmpTestScore[i]=s.nextInt();
		}
		
		maxScore=tmpTestScore[0];
		
		for(int i=1;i<tmpTestScore.length;i++) {
			if(maxScore<tmpTestScore[i])
				maxScore=tmpTestScore[i];
		}
		
		for(int i=0;i<tmpTestScore.length;i++) {
			tmpTestScore[i]=tmpTestScore[i]/maxScore*100;
		}
		
		for(int i=0;i<tmpTestScore.length;i++) {
			sumOfAllTestScore+=tmpTestScore[i];
		}
		
		System.out.println(sumOfAllTestScore/tmpTestScore.length);

	}

}
