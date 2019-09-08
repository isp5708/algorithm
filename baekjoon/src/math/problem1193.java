package math;
import java.util.Scanner;
public class problem1193 {
	static String[][] tmpArray;
	static int input,sum=0,startNumber=1,count=0;
	static int indexX=0,indexY=0;
	
	public static void findTheLengthOfAnIndex() {
		while(sum<input) {
			sum+=startNumber;
			startNumber++;
			count++;
		}
	}
	
	public static void fillTmpArray() {
		for(int i=0;i<count;i++) {
			for(int j=0;j<count;j++) {
				tmpArray[i][j]=Integer.toString(i+1)+"/"+Integer.toString(j+1);
			}
		}
	}
	
	public static void printTmpArray() {
		for(int i=0;i<tmpArray.length;i++) {
			for(int j=0;j<tmpArray.length;j++) {
				System.out.print(tmpArray[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void findOutTmpArrayValue() {
		// indexX = 0, indexY =0
		int indexMoveCount=1,indexMovePivot=0;
		while(true) {
			if(indexMovePivot%2==0) {
				indexX++;
				indexMoveCount++;
				isInput(indexMoveCount);
				indexMovePivot++;
				for(int i=0;i<indexMovePivot;i++) {
					moveLeftDownCross();
					indexMoveCount++;
					isInput(indexMoveCount);
				}
			}else {
				indexY++;
				indexMoveCount++;
				isInput(indexMoveCount);
				indexMovePivot++;
				for(int i=0;i<indexMovePivot;i++) {
					moveRightUpCross();
					indexMoveCount++;
					isInput(indexMoveCount);
				}
			}
		}
	}
	public static void isInput(int indexMoveCount) {
		if(indexMoveCount==input) {
			System.out.println(indexY+""+indexX);
			System.out.println(tmpArray[indexY][indexX]);
			System.exit(0);
		}
			
	}
	
	public static void moveLeftDownCross() {
		indexX--;
		indexY++;
	}
	public static void moveRightUpCross() {
		indexX++;
		indexY--;
	}
	
	public static boolean isUserInput(int indexMoveCount) {
		if(indexMoveCount==input)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		input=s.nextInt();
		
		findTheLengthOfAnIndex();
		tmpArray=new String[count][count];
		
		
		fillTmpArray();
		
		printTmpArray();
		if(input!=1)
			findOutTmpArrayValue();
		else
			System.out.println("1/1");
		
	}

}
