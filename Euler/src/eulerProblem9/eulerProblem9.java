package eulerProblem9;

/*�� �ڿ��� a, b, c �� ��Ÿ��� ���� a2 + b2 = c2 �� �����ϸ� ��Ÿ��� ����� �θ��ϴ� (���⼭ a < b < c ).
���� ��� 32 + 42 = 9 + 16 = 25 = 52�̹Ƿ� 3, 4, 5�� ��Ÿ��� ���Դϴ�.

a + b + c = 1000 �� ��Ÿ��� �� a, b, c�� �� ���� ���Դϴ�. �� ��, a �� b �� c �� ���Դϱ�?*/
public class eulerProblem9 {

	public static void main(String[] args) {
		int a=1,b=2,c=3;
		for(;a<b;a++) {
			for(b=a+1;b<c;b++) {
				for(c=b+1;c<=1000-a-b;c++) {
					if((a+b+c)==1000&& (a*a+b*b==c*c)){
							System.out.println(a*b*c);
					}
				}
			}
		}
		
		for(;b<1000;b++) {
			for(a=1;a<b;a++) {
				if(Math.pow(a, 2)+Math.pow(b, 2)==Math.pow((1000-(a+b)), 2))
					System.out.println(a*b*(1000-a-b));
			}
		}

	}

}
