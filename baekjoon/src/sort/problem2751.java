package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class problem2751 {
//�켱����ť�� �̿��Ͽ� ������
	public static void main(String[] args)throws IOException {
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int cnt;
		int[] tmp;
		
		cnt=Integer.parseInt(bf.readLine());
		tmp=new int[cnt];
		
		for(int i=0;i<cnt;i++) {
			minHeap.offer(Integer.parseInt(bf.readLine()));
		}
		
		for(int i=0;i<cnt;i++) {
			System.out.println(minHeap.poll());
		}

	}

}
