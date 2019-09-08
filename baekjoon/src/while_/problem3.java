package while_;
import java.util.Scanner;

public class problem3 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int num,onePlace,count=0,tmp,sumOfEachDigit;
		
		num=s.nextInt();
		tmp=num;
		do{
		
			if(num<10)
			{
				onePlace=num;
				sumOfEachDigit=num;
				num=onePlace*10+sumOfEachDigit;
			}
			else {
				onePlace=num%10;
				sumOfEachDigit=num/10+num%10;
				num=onePlace*10+sumOfEachDigit%10;
			}
			
			count++;
			
		}while(num!=tmp);
		System.out.println(count);

	}

}
