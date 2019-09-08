package eulerProblem17;

import java.util.HashMap;
import java.util.Map;

/*1���� 5������ ���ڸ� ����� ���� one, two, three, four, five �̰�,
�� �ܾ��� ���̸� ���ϸ� 3 + 3 + 5 + 4 + 4 = 19 �̹Ƿ� ���� ���ڴ� ��� 19���Դϴ�.

1���� 1,000���� ����� ���� ���� ��� �� ���� ���ڸ� ����ؾ� �ұ��?

����: �� ĭ�̳� ������('-')�� ������ �����ϸ�, �ܾ� ������ and �� ���� �ֽ��ϴ�.
  ���� ��� 342�� ����� ���� three hundred and forty-two �� �Ǿ 23 ����,
  115 = one hundred and fifteen �� ��쿡�� 20 ���ڰ� �˴ϴ�.*/
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
				sum+=7; //100����
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
