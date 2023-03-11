package exceptionday6;

import java.sql.*;

public class Exceptiondemo4 {

	static void method() throws SQLException{
		throw new SQLException("connection failed");
	}
	public static void main(String[] args) {
		/*try {
			method();
		}catch(SQLException e) {
			e.printStackTrace();
		}*/
	}
}

