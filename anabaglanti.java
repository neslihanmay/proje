package proje;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class anabaglanti {
	public static final String mysqlDriver = "com.mysql.cj.jdbc.Driver";

	public static final Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName(anabaglanti.mysqlDriver);
		return DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/proje?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey",
				"root", "123456");
	}
}
