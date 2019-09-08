package eulerProblem15;
/*�Ʒ��� ���� 2 �� 2 ������ ���� �� �𼭸����� ����Ͽ� ������ �Ʒ� �𼭸����� �����ϴ� ���� ��� 6������ �ֽ��ϴ� (�Ž��� ������ �ʱ�� �մϴ�).


�׷��� 20 �� 20 ���ڿ��� ��� �� ���� ��ΰ� �ֽ��ϱ�?*/
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
