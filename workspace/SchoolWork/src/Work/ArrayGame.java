package Work;

import java.util.Scanner;

public class ArrayGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1: ��, 2: ��, 3: ��, 4: �Ʒ�");
		int a = scan.nextInt(); 
		// TODO Auto-generated method stub
		int[][] bae = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};		
		System.out.println(bae.length);
		for(int i=0; i<bae.length; i++){
			System.out.println();
			for(int j=0;j<bae[i].length;j++){
				System.out.print(bae[i][j]+" ");
			}
		}

//		public int shiftRight(int a){
//			
//		}
//		public void shiftUp(int a){
//			
//		}
//		public void shiftDown(int a){
//			
//		}
		//�޼ҵ� �װ��� ����� �� �迭������ �ȿ��� ����ֱ� ( ���ȭ)
	}

}
