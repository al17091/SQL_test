import java.sql.*;

// Notice, do not import com.mysql.cj.jdbc.*
//connect database

public class ServerConnect {
    public static Connection con= null;
    public static Statement st= null;
    public static void connect() {
	    try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://172.21.33.65:3306","root","");
            System.out.println( "Connected....database" );
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
