import java.sql.*;

// Notice, do not import com.mysql.cj.jdbc.*

public class ServerConnect {
    public static Statement st = null;
    public static Statement connect() {
        Connection con=null;
	try {
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("com.mysql.jdbc.Driver").newInstance();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        } catch (Exception ex) {
            // handle the error
            System.out.println("error "+ex.getMessage());
        }
	Statement st=null;
       try {
            con = DriverManager.getConnection("jdbc:mysql://172.21.33.65","root","");
            System.out.println( "Connected....database" );

            /*sqlコンテナの役割を果たすオブジェクトに渡すためのStatementオブジェクトを作成する。*/
	    st = con.createStatement();
	   
	    //st.close();
            //con.close();
	    
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
	return st;
    }
}