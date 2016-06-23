package test;

public class ArrayTest {

	public static void main(String[] args) {
		int[] a =new int[]{1,2,3,4,5};
		//데이터 타입이 int[]
		int b[] = new int[5];
		b[0]=1;
		for(int i=0; i<5; i++){
			System.out.print(a[i]+" ");//한줄
		}
		for(int hanyang : a){
			System.out.println(hanyang);
		}
		//파이썬 for문 방식
		

	}

}
