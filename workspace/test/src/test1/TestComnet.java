package test1;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Scanner;

public class TestComnet {

	public static void main(String[] args) throws FileNotFoundException {
		//mysql jar������ http://dev.mysql.com/downloads/connector/j/ ���⼭
		//�߰� ����� test ������ Ŭ�� -build Path - configure build Path - Libraries - Add External Jars �ؼ� �ٿ������ �߰�
		Scanner scanner = new Scanner(new File("C:/Users/COMNET-01/Desktop/nyam.asv"));
		scanner.useDelimiter(",");
		
		Comnet[] c= new Comnet[5];
		c[0] = new Comnet("�Ⱥ�ȣ",173,74);
		c[1] = new Comnet("��â��",172,60);
		c[2] = new Comnet("��ġ��",176,69);
		c[3] = new Comnet("������",172,80);
		c[4] = new Comnet("������",172,77);
		Connection myCon = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/hanyang","root","apmsetup");
			String query = "insert into comnet values (?,?,?)";
			PreparedStatement pstmt = myCon.prepareStatement(query); //�ܿ�� �١ڡ�
			for(Comnet hanyang : c){
				pstmt.setString(1, hanyang.getName());
				pstmt.setInt(2, hanyang.getHeight());
				pstmt.setInt(3, hanyang.getWeight());
				pstmt.execute();
			}
			pstmt.close();
			myCon.close();
		}catch(Exception e){
			e.printStackTrace();//���� ���
		}
		System.out.println("�Ϸ῰"); //database �� insert �� ���������� �Է��ߴٴ°��� �˷��ֱ� ����
		
	} // DataBase : hanyang / Table : comnet / name varchar(50),height int(3), weight(3)

}
