package test;

import java.util.HashSet;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		int count = 0; // ��������� �˱����� ����
		
		while(set.size()<6){ // <- �ζ� ��ȣ�� 6���̹Ƿ� 0,1,2,3,4,5
			set.add((int)(Math.random()*45)+1);  // Math.random��  0.0 <=Math.random()<1.0�̴� (float) �׸��� 45���� ��ȣ�� ���� �� �ִ�.
			count++;							 // �׷��Ƿ� int�� ����ȯ�����ش�.�׷��� 0<=Math.random<45 �ε� 45�� ������ �ȵǹǷ� 1�� �ϳ� �� �÷��� ���ִ� ���̴�.
		}
		
		System.out.println(set);
		System.out.println(count);
	}

}
