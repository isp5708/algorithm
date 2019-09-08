package array;

import java.util.Scanner;

public class problem3 {
	
	static char[] jangJo = {'c','d','e','f','g','a','b','C'};
	static char[] userInput=new char[8];
	
	public static boolean checkAscending() {
		for(int i=0;i<userInput.length;i++) {
			if(userInput[i]!=jangJo[i])
				return false;
		}
		return true;
	}
	public static boolean checkDescending() {
		int jangJoIndex=jangJo.length-1;
		for(int i=0;i<userInput.length;i++) {
			if(userInput[i]!=jangJo[jangJoIndex])
				return false;
			jangJoIndex--;
		}
		return true;
	}

	public static void main(String[] args) {
		
		int tmp;
		
		Scanner s= new Scanner(System.in);
		
		for(int i=0;i<userInput.length;i++) {
			tmp=s.nextInt();
			userInput[i]=jangJo[tmp-1];
		}
		
		if(checkAscending())
			System.out.println("ascending");
		else if(checkDescending())
			System.out.println("descending");
		else
			System.out.println("mixed");

	}

}
