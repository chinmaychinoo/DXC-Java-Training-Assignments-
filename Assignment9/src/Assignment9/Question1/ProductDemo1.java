package Assignment9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		String user = "DXC";
		String pass = "chinmay";

		String sql = "SELECT prod_code, prod_name, prod_price, prod_catg from products ";

		Connection con = null;

		try {
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

			con = DriverManager.getConnection(url, user, pass);

			Statement st = con.createStatement();

			ResultSet result = st.executeQuery(sql);

			while (result.next()) {

				System.out.println(result.getInt("PROD_CODE") + " : " + result.getString("PROD_NAME") + " : " + result.getInt("PROD_PRICE") + " : " + result.getString("PROD_CATG"));

			}

		}

		catch (SQLException e) {
			System.err.println(e);

		} finally {
			try {
				con.close();

			} catch (SQLException exp) {
				System.out.println(exp);

			}
		}
	}
}
