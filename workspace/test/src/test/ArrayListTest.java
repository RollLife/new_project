package test;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList(); // Ctrl + Shift +o �� ������ �ڵ����� import�� �������ش�.
		Person[] p = new Person[10]; // Person Ŭ������ �ִ°��� ��ü�� ����
		
		for(int i=0; i<10; i++){
			p[i] = new Person(i+1); //Person ��ü���� �⺻ �����ڸ� �������־���Ѵ�. �ȱ׷� ������
			list.add(p[i]);
		}
		list.add(1);
		list.add(2);
		House h = new House(); // ���� ���� house Ŭ������ �𸣴� �������� ������ �ϴ°��̴�.
		list.add(h); // ���� �׳� ���־� <- list��
		//����� house�� ���۷��� ������ �����µ� String toString���� �ٲ�����
		
		System.out.println(list);
	}

}
