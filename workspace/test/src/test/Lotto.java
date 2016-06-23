package test;

import java.util.HashSet;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		int count = 0; // 몇번도는지 알기위한 변수
		
		while(set.size()<6){ // <- 로또 번호는 6개이므로 0,1,2,3,4,5
			set.add((int)(Math.random()*45)+1);  // Math.random은  0.0 <=Math.random()<1.0이다 (float) 그리고 45개의 번호를 찍을 수 있다.
			count++;							 // 그러므로 int로 형변환을해준다.그러면 0<=Math.random<45 인데 45가 포함이 안되므로 1을 하나 더 플러스 해주는 것이다.
		}
		
		System.out.println(set);
		System.out.println(count);
	}

}
