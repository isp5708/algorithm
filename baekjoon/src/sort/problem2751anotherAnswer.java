package sort;

import java.util.Arrays;

public class problem2751anotherAnswer {
//병합정렬이용
	static int[] sorted = new int[8];
	public static void merge(int a[],int m,int middle,int n) {
		int i=m;
		int j=middle+1;
		int k=m;
		
		while(i<=middle && j<=n) {
			if(a[i]<=a[j]) {
				sorted[k]=a[i];
				i++;
			}else {
				sorted[k]=a[j];
				j++;
			}
			k++;
		}
		if(i>middle) {
			for(int t=j;t<=n;t++,k++) {
				sorted[k]=a[t];
			}
		}else {
			for(int t=i;t<=middle;t++,k++) {
				sorted[k]=a[t];
			}
		}
		for(int t=m;t<=n;t++) {
			a[t]=sorted[t];
		}
		System.out.println("병합 정렬 후: "+Arrays.toString(a));
	}
	
	public static void mergeSort(int a[],int m,int n) {
		int middle;
		if(m<n) {
			middle=(m+n)/2;
			mergeSort(a, m, middle); //앞부분
			mergeSort(a, middle+1, n); //뒷부분
			merge(a, m, middle, n);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {58,8,28,3,18,6,33,20};
		int size=list.length;
		System.out.println("정렬 수행전: "+Arrays.toString(list));
		mergeSort(list, 0, size-1); //리스트,시작,끝
	}

}
