package GUI;

import java.awt.Button;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import GUI.AhnFrame.AhnHandler;

public class Information extends Frame {
	TextField name;
	Choice sex = new Choice();// 드롭 박스 할때 사용되는 것
	TextField phoneNumF;
	TextField phoneNumM;
	TextField phoneNumL;
	Button insert;
	TextArea area;
	Label phone1;
	Label phone2;
	Label nameF; // 이름 :
	Label sexF; // 성별 :
	Label phoneF; // 전화번호 :
	public Information(){
		setLayout(new FlowLayout());
		
		name = new TextField(5);
		sex.add("남");
		sex.add("여");
		phoneNumF = new TextField(2);
		phoneNumM = new TextField(2);
		phoneNumL = new TextField(2);
		insert = new Button("입력");
		insert.addActionListener(new Informer());
		area = new TextArea(30,30);		
		phone1 = new Label("-"); //전화번호 구분자이다.
		phone2 = new Label("-");
		nameF = new Label("이름 : ");
		sexF = new Label("성별 : ");
		phoneF = new Label("전화번호 : ");
		
		add(nameF);
		add(name);
		add(sexF);
		add(sex);
		add(phoneF);
		add(phoneNumF);
		add(phone1);
		add(phoneNumM);
		add(phone2);
		add(phoneNumL);
		add(insert);
		add(area);		
		//public void insertDB 이렇게 메소드를 하나 만들어서 insert를 할 수 있는 메소드를 하나 만들어 놓자
		// 먼저 Area에 출력값 예- 양정환(남) : 010-8547-0201 이렇게 출력한 뒤 sql에 insert를 하자.

	}
	public class Informer implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==insert){
				//메소드를 이용해서 SQL에 입력하는것.
				
				String names = name.getText();
				if (sex.getItem(0)=="남"){
					String sexs = sex.getItem(0);
				
				}else if(sex.getItem(1)=="여"){
					String sexs = sex.getItem(1);
				}
				String phones = phoneNumF.getText()+"-"+phoneNumM.getText()+"-"+phoneNumL.getText();
				area.setText(names +"("+sexs+") : "+phones);
				insertDB( );
			}
		
		}
	}
	
	public void insertDB(){
		Connection myCon = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/hanyang","root","apmsetup");
			String query = "insert into comnet values (?,?,?)";
			PreparedStatement pstmt = myCon.prepareStatement(query); //외우기 ☆★☆
		}catch(Exception e){
			System.out.println("오류");
		}
		//name : varchar(30) , sex : varchar(3) , phone : varchar(13)
	}
}

