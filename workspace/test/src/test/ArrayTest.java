package test;

public class ArrayTest {

	public static void main(String[] args) {
		int[] a =new int[]{1,2,3,4,5};
		//������ Ÿ���� int[]
		int b[] = new int[5];
		b[0]=1;
		for(int i=0; i<5; i++){
			System.out.print(a[i]+" ");//����
		}
		for(int hanyang : a){
			System.out.println(hanyang);
		}
		//���̽� for�� ���
		

	}

}
