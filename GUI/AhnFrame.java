package GUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AhnFrame extends Frame {
	Button addI,addP,Cancle; // 멤버 변수
	Label li;
	TextField ID , PW;
	public AhnFrame(){
		setLayout(new FlowLayout()); //레이아웃으로 만들어서 편하게 출력하게 해줌 원래 정의되어있던것을 편하게 사용가능하게 만들어줌(원래는 버튼의 위치같은거 선언해주고 해야하는데 안해줘도됨 ) (검색해보기)
		addI = new Button("아이디 입력"); // addI버튼의 내용 추가
		addI.addActionListener(new AhnHandler()); // 매개변수가 ActionListener가 필요하다.
		//매개변수로는 클래스 이름을 주어야한다.
		addP = new Button("패스워드 입력"); // addP버튼의 내용 추가
		addP.addActionListener(new AhnHandler());
		Cancle = new Button("취소");	  // Cancle버튼의 내용 추가
		Cancle.addActionListener(new AhnHandler());
		li = new Label("아이디");
		ID = new TextField(10); //TextField 객체 괄호 안에는 컬럼수를 필요로 한다 (아무것도 써주지 않으면 아주 작은 크기로 된다. (Text쓰는 곳))
		PW = new TextField(10);
		
		add(li);
		add(ID);
		add(PW);
		add(addI); // b1버튼 구현
		add(addP); // b2버튼 구현
		add(Cancle);
	}// 생성자 생성
	
	public class AhnHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(arg0.getSource()==addI){
				ID.setText("아이디");
			}else if(arg0.getSource()==addP){
				PW.setText("패스워드");
			}else if(arg0.getSource()==Cancle){
				ID.setText("");
				PW.setText("");
			}
			
		} // ActionListener에 있는 메소드를 선언해주어야 한다.
		
		// 재정의를 해서 메소드를 만들어주어야 한다.
	}
}
