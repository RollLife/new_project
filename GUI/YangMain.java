package GUI;

public class YangMain {
	public static void main(String[] args){
		AhnFrame ahn = new AhnFrame();
		ahn.setSize(300,200); // int width , int height // GUI의 크기를 정해줌
		ahn.setLocation(2500,500); // x좌표 y좌표 (해상도 라고 생각하면됨 좌표에 위치하게 해줌 기본값은 왼쪽 맨위)
		ahn.setVisible(true); //GUI 원래 보이지 않도록 설정되어있기때문에 보이게 해주어야함
	}
}
