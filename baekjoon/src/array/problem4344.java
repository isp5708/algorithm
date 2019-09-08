package array;
import java.util.Scanner;
public class problem4344 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int testCaseAmount,numberOfPeople,count;
		double sum,average;
		String[] testScoreArray;
		String[] tmp;
		
		testCaseAmount=Integer.parseInt(s.nextLine());
		
		testScoreArray=new String[testCaseAmount];
		
		for(int i=0;i<testScoreArray.length;i++) { //입력케이스 갯수입력
			testScoreArray[i]=s.nextLine();
		}
		
		for(int i=0;i<testScoreArray.length;i++) {//입력케이스 갯수만큼 포문돌림
			tmp=testScoreArray[i].split(" ");
			sum=0;
			count=0;
			
			for(int j=1;j<tmp.length;j++) {//모든 학생의 점수를합함
				sum+=Double.parseDouble(tmp[j]);
			}
			
			//System.out.println(String.format("%.3f", pie)); //결과 : 3.142
			average=sum/(tmp.length-1);  //평균구함
			
			for(int j=1;j<tmp.length;j++) {
				if(Double.parseDouble(tmp[j])>average)
					count++;
			}

			System.out.println(String.format("%.3f",count/Double.parseDouble(tmp[0])*100 )+"%");
			tmp=null;
		}
		
		
		
		
		
		

	}

}
