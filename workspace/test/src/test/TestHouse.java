package test;

public class TestHouse {

	public static void main(String[] args) {
		House prugio = new House();
		prugio.weight = 500;
		prugio.height = 50;
		prugio.name = "푸르지오";
		
		House raemian = new House();
		raemian.weight = 300;
		raemian.height = 30;
		raemian.name = "래미안";
		
		//Ctrl + Alt + 화살표키 아래 누르면 복사됨
		System.out.println(raemian.name+"("+"가로 : "+raemian.weight+","+"세로 : "+raemian.height+")");
		System.out.println(prugio.name+"("+"가로 : "+prugio.weight+","+"세로 : "+prugio.height+")");
		

	}

}
