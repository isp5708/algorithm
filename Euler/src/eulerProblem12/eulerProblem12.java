package eulerProblem12;
/*1���� n������ �ڿ����� ���ʷ� ���Ͽ� ������ ���� �ﰢ����� �մϴ�.
���� ��� 7��° �ﰢ���� 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28�� �˴ϴ�.
�̷� ������ �ﰢ���� ���� ������ ������ �����ϴ�.

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
�� �ﰢ������ ����� ���غ��ô�.

 1: 1
 3: 1, 3
 6: 1, 2, 3, 6
10: 1, 2, 5, 10
15: 1, 3, 5, 15
21: 1, 3, 7, 21
28: 1, 2, 4, 7, 14, 28
������ ������, 5�� �̻��� ����� ���� ù��° �ﰢ���� 28�Դϴ�.

�׷��� 500�� �̻��� ����� ���� ���� ���� �ﰢ���� ���Դϱ�?*/

public class eulerProblem12 {
	public static void find500OrMoreOfFactor() {
		int count=0;
		int aFewTriangle=1;
		int triangle=0;
		
		while(count<500) {
			triangle=0;
			
			for(int i=1;i<=aFewTriangle;i++) {
				triangle+=i;
			}
			aFewTriangle++;
			count=countFactor(triangle);
			System.out.println(triangle);
		}
		System.out.println(triangle);
	}
	
	public static int countFactor(int num) {
		int count=1;
		
		for(int i=1;i*i<num;i++) {
			if(num%i==0)
				count+=2;
		}
		return count;
	}

	public static void main(String[] args) {
		find500OrMoreOfFactor();

	}

}
