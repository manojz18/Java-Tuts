import java.sql.*;

public class MyClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// step 1
		//Class.forName("com.mysql.jdbc.Driver");
		// step2
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/namedb", "manoj", "root");
		// jdbc:mysql://localhost:3306/infospark" ,"root" ,"root"

		// step3
		Statement stmt = con.createStatement();
		// step4
		//stmt.execute("insert into students values(13,'RAJ')");
		ResultSet rs = stmt.executeQuery("select*from students");

		while(rs.next()){
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));

		}

		//step 5
		con.close();

	}
}
