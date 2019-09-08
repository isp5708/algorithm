package string;
import java.util.*;

public class tmp {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String str[] = new String[n];
		for(int i=0;i<n;i++)
		{
			str[i] = scan.next();
		}
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length()-1;j++)
			{
				if(str[i].charAt(j)!=str[i].charAt(j+1))
				{
					String temp = str[i].substring(j+1);
					if(temp.contains(str[i].charAt(j)+""))
					{
						n--;
						break;
					}
				}
			}
		}	
		System.out.println(n);
	}

}
