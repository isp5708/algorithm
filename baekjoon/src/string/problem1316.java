package string;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class problem1316 {
	
	public static boolean isGroupString(String tmp) {
		//Arrays.asList(arr).contains(targetValue);
		
		ArrayList<String> d =new ArrayList<String>();
		
		int pivot=0;
		
		while(pivot<tmp.length()) {
			while((pivot+1)!=tmp.length()&&tmp.charAt(pivot)==tmp.charAt(pivot+1)) {
				pivot++;
			}
			if(!d.contains(tmp.charAt(pivot)+"")) {
				d.add(tmp.charAt(pivot)+"");
			}
			else
				return false;
			pivot++;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int count,groupCount=0;
		String[] tmp;
		
		String tmpString;
		
		count=s.nextInt();
		s.nextLine();
		
		tmp=new String[count];
		
		for(int i=0;i<count;i++) {
			tmpString="";
			tmp[i]=s.nextLine();
			
			if(isGroupString(tmp[i]))
				groupCount++;
		}
		
		System.out.println(groupCount);
		

	}

}
