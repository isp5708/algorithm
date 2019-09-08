package eulerProblem15;
/*아래와 같은 2 × 2 격자의 왼쪽 위 모서리에서 출발하여 오른쪽 아래 모서리까지 도달하는 길은 모두 6가지가 있습니다 (거슬러 가지는 않기로 합니다).


그러면 20 × 20 격자에는 모두 몇 개의 경로가 있습니까?*/
public class eulerProblem15 {
	long[][] tmpArray;
	
	public eulerProblem15(int lastindex) {
		tmpArray=new long[lastindex][lastindex];
	}
	
	public void gettingTheShortestPath() {
		for(int i=0;i<tmpArray[0].length;i++) {
			tmpArray[0][i]=1;
		}
		for(int i=0;i<tmpArray[0].length;i++) {
			tmpArray[i][0]=1;
		}
		
		for(int i=1;i<tmpArray[0].length;i++) {
			for(int j=1;j<tmpArray[0].length;j++) {
				tmpArray[i][j]=tmpArray[i-1][j]+tmpArray[i][j-1];
			}
		}
		for(int i=0;i<tmpArray[0].length;i++) {
			for(int j=0;j<tmpArray[0].length;j++) {
				System.out.print(tmpArray[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(tmpArray[tmpArray.length-1][tmpArray.length-1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eulerProblem15 e = new eulerProblem15(21);
		
		e.gettingTheShortestPath();

	}

}
