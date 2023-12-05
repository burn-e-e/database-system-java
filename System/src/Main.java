import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String cnstring = "jdbc:mysql:\\localhost:3306/java_schema";
        try{
            Connection cn = DriverManager.getConnection(cnstring,"root","burnee95144189");
            Statement st = cn.createStatement();
            ResultSet rs =st.executeQuery("select * from people");
            while (rs.next()){
                System.out.println(rs.getInt("id"));
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}