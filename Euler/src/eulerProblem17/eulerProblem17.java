package eulerProblem17;

import java.util.HashMap;
import java.util.Map;

/*1부터 5까지의 숫자를 영어로 쓰면 one, two, three, four, five 이고,
각 단어의 길이를 더하면 3 + 3 + 5 + 4 + 4 = 19 이므로 사용된 글자는 모두 19개입니다.

1부터 1,000까지 영어로 썼을 때는 모두 몇 개의 글자를 사용해야 할까요?

참고: 빈 칸이나 하이픈('-')은 셈에서 제외하며, 단어 사이의 and 는 셈에 넣습니다.
  예를 들어 342를 영어로 쓰면 three hundred and forty-two 가 되어서 23 글자,
  115 = one hundred and fifteen 의 경우에는 20 글자가 됩니다.*/
public class eulerProblem17 {

	public static void main(String[] args) {
		HashMap<Integer, Integer> numberLength = new HashMap<Integer, Integer>();
		// zero one two three four five six seven eight nine
		numberLength.put(0,0);
		numberLength.put(1, 3);
		numberLength.put(2, 3);
		numberLength.put(3, 5);
		numberLength.put(4, 4);
		numberLength.put(5, 4);
		numberLength.put(6, 3);
		numberLength.put(7, 5);
		numberLength.put(8, 5);
		numberLength.put(9, 4);

		numberLength.put(10, 3);
		numberLength.put(11, 6);
		numberLength.put(12, 6);
		numberLength.put(13, 8);
		numberLength.put(14, 8);
		numberLength.put(15, 7);
		numberLength.put(16, 7);
		numberLength.put(17, 9);
		numberLength.put(18, 8);
		numberLength.put(19, 8);

		numberLength.put(20, 6);
		numberLength.put(30, 6);
		numberLength.put(40, 5);
		numberLength.put(50, 5);
		numberLength.put(60, 5);
		numberLength.put(70, 7);
		numberLength.put(80, 6);
		numberLength.put(90, 6);
		int sum = 0;

		for (int i = 1; i <= 20; i++) {
			sum += numberLength.get(i);
		}
		for (int i = 21; i < 100; i++) {
				sum += numberLength.get(i % 10);
				sum += numberLength.get(i / 10 * 10);
		}

		for (int i = 100; i < 1000; i++) {
			int tmp=i;
			if (tmp % 100 != 0) {
				sum += numberLength.get(tmp / 100);
				sum+=7; //100단위
				sum += 3; //and
				tmp=tmp%100;
				if(tmp>0&&tmp<21) {
					sum += numberLength.get(tmp);
				}
				else {
					sum += numberLength.get(tmp % 10);
					sum += numberLength.get(tmp / 10 * 10);
				}
				
			}
			else {
				sum+=numberLength.get(tmp/100);
				sum+=7;
			}
		}
		sum += 11;

		System.out.println(sum);

	}

}
