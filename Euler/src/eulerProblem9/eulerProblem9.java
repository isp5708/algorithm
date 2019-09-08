package eulerProblem9;

/*세 자연수 a, b, c 가 피타고라스 정리 a2 + b2 = c2 를 만족하면 피타고라스 수라고 부릅니다 (여기서 a < b < c ).
예를 들면 32 + 42 = 9 + 16 = 25 = 52이므로 3, 4, 5는 피타고라스 수입니다.

a + b + c = 1000 인 피타고라스 수 a, b, c는 한 가지 뿐입니다. 이 때, a × b × c 는 얼마입니까?*/
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
