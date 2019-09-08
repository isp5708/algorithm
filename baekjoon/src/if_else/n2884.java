package if_else;
import java.util.Scanner;

public class n2884 {

	public static void main(String[] args) {
		int hour,minute;
		
		Scanner s= new Scanner(System.in);
		
		hour=s.nextInt();
		minute=s.nextInt();

		if(minute-45<0) {
			if(hour-1<0)
				hour=23;
			else
				hour--;
			minute=minute+60-45;
		}else
			minute=minute-45;
		
		System.out.println(hour+" "+minute);
			
	}

}
