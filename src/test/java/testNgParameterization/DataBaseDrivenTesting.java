package testNgParameterization;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataBaseDrivenTesting {
	
	@DataProvider(name = "dbData")
	public Object[][] provideDBData() throws SQLException{
		String url = "jdbc.mysql://localhost:3306/testdb";
		String user = "root";
		String password = "password";
		
		List<Object[]> testData = new ArrayList<>();
		
		try(Connection conn = DriverManager.getConnection(url, user, password);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT username, email, role FROM test_users")){
			
			while(rs.next()) {
				testData.add(new Object[] {
						rs.getString("username"),
						rs.getString("email"),
						rs.getString("role")
				});
			}
		}
		
		return testData.toArray(new Object[0][0]);
				
	}
	
	@Test(dataProvider = "dbData")
	public void testUserRoles(String username, String email, String role) {
		System.out.println("Testing user: " + username);
		System.out.println("Email: " + email);
		System.out.println("Role: " + role);
	}
}
