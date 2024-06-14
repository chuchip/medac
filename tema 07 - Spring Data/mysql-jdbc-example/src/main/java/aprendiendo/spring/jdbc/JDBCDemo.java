package aprendiendo.spring.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "password";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            System.out.println("Creando tabla e insertando dos registros");
            stmt.executeUpdate("create table mytable (column1 varchar(30), column2 int)");
            stmt.executeUpdate("insert into  mytable values('Valor col1',1)");
            stmt.executeUpdate("insert into  mytable values('Valor col2',2)");
            ResultSet rs = stmt.executeQuery("SELECT * FROM mytable");
            System.out.println("Leyendo registros");
            int n=1;
            while (rs.next()) {
                System.out.println("Registro: "+n);
                System.out.println("Column1: " + rs.getString("column1"));
                System.out.println("Column2: " + rs.getInt("column2"));
                n++;
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
