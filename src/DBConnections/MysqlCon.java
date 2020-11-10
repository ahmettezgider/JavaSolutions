package DBConnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlCon {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mesnetnew","root","");


            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT adi, COUNT(*) FROM `a_personel` GROUP BY adi");
            while(rs.next())
                System.out.println(
                        rs.getString(1) + "  " +
                        rs.getString(2)
                );
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
