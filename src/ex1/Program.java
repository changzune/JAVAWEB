package ex1;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Program {

	public static void main(String[] args) {
		
		String url = "jdbc:oralce:thin:@localhost:7070/xepad1";
		String sql = "SELECT* FROM NOTICE";
		
		Class.forName("oracle.jdbc.driver.oracleDribver");
		Connection con =  DriverManager.getConnection(url,"newlec","");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		rs.close();
		st.close();
		con.close();
		

	}

}
