package test;

public class HanyangComnet {
	String studentNumber;
	int height;
	
	public void setHeight(int height){
		if (height<0){
			this.height = 100;
		}
		else{
			this.height = height;
		}
	}
	// 키가 0 이하로 장난 친 경우에는 height를 100으로 줘버린다.
	// this는 멤버를 가르킨다. 매개변수와 혼동되지 않게 멤버변수를 선언하기위해 this를 사용한다.
	
	public int getHeight(){
		return this.height;
	}
	// getHeight로 받아오는 메소드를 하나 더 만든다.
	// set으로는 불러올수 없기 때문이다.
	
}
