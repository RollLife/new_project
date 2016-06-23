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
		//HashSet은 List와 다르게 무작위로 배열이 되고 중복이 허용이 안된다.
		//반면 리스트는 순차적으로 배열이되고 중복이 허용이 된다.
	}

}
