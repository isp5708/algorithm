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
		
		for(int i=0;i<testScoreArray.length;i++) { //�Է����̽� �����Է�
			testScoreArray[i]=s.nextLine();
		}
		
		for(int i=0;i<testScoreArray.length;i++) {//�Է����̽� ������ŭ ��������
			tmp=testScoreArray[i].split(" ");
			sum=0;
			count=0;
			
			for(int j=1;j<tmp.length;j++) {//��� �л��� ����������
				sum+=Double.parseDouble(tmp[j]);
			}
			
			//System.out.println(String.format("%.3f", pie)); //��� : 3.142
			average=sum/(tmp.length-1);  //��ձ���
			
			for(int j=1;j<tmp.length;j++) {
				if(Double.parseDouble(tmp[j])>average)
					count++;
			}

			System.out.println(String.format("%.3f",count/Double.parseDouble(tmp[0])*100 )+"%");
			tmp=null;
		}
		
		
		
		
		
		

	}

}
