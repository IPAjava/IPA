package databas;
import java.sql.*;


public class DBfasad {

	public void lagraIDatabas(String studentid, String momentid, String betyg) throws Exception {

		try 
		{
			String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
			Class.forName(driver).newInstance();
			String connectionUrl = "jdbc:sqlserver://IDASQL.ad.liu.se;database=725G79;";
			Connection conn = DriverManager.getConnection(connectionUrl, "725G79L5jonsm761", "xrs1534Rl");

			Statement stmt = conn.createStatement();

			stmt.executeQuery("INSERT INTO momentBetyg (studentid, momentid, betyg) "
					+ "VALUES ('"+studentid+"','"+momentid+"','"+betyg+"')");
		}

		catch (ClassNotFoundException cnfe) {
			System.err.println ("ERROR: " + cnfe.toString());
			System.exit(1);
		}
		catch (SQLException sqle) {
			System.err.println ("ERROR: LAGRINGEN FUNGERAR DOCK I DATABASEN " + sqle.toString());
			//System.exit(1);
		}

	}

}


