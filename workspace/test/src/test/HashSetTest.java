package test;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		Person[] p = new Person[10];
		for(int i=0; i<10;i++){
			p[i] = new Person(i+1);
			set.add(p[i]);
		}
		set.add(1);
		set.add(2);
		set.add(1);
		
		System.out.println(set);
		//HashSet�� List�� �ٸ��� �������� �迭�� �ǰ� �ߺ��� ����� �ȵȴ�.
		//�ݸ� ����Ʈ�� ���������� �迭�̵ǰ� �ߺ��� ����� �ȴ�.
	}

}
