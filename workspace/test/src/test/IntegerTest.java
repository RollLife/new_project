package test;

public class IntegerTest {

	public static void main(String[] args) {
		byte b1 = Byte.MAX_VALUE;
		byte b2 = Byte.MIN_VALUE;
		
		short s1 = Short.MAX_VALUE;
		short s2 = Short.MIN_VALUE;
		
		int i1 = Integer.MAX_VALUE;
		int i2 = Integer.MIN_VALUE;
		
		long l1 = Long.MAX_VALUE;
		long l2 = Long.MIN_VALUE;
		
		float f1 = Float.MAX_VALUE;
		float f2 = Float.MIN_VALUE;
		
		double d1 = Double.MAX_VALUE;
		double d2 = Double.MIN_VALUE;
		
		System.out.println("Byte의 범위 : "+b2+"~"+b1+"\n");
		System.out.println("Short의 범위 :"+s2+"~"+s1+"\n");
		System.out.println("Interger의 범위 : "+i2+"~"+i1+"\n");
		System.out.println("Long의 범위 : "+l2+"~"+l1+"\n");
		System.out.println("Float의 범위 : "+f2+"~"+f1+"\n");
		System.out.println("Double의 범위 : "+d2+"~"+d1+"\n");

	}

}
