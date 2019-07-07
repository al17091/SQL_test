import java.sql.*;
import java.util.*;

class ReceiveHistory{
    public static String receive(String id) {
        List<String> receiveStr=new ArrayList<String>();
        StringBuffer strTemp=new StringBuffer("");
        try {
            PreparedStatement st;
            String sqlStr = "SELECT menu_name,amount FROM student.Table_student_history WHERE student_id=?";
            st = ServerConnect.con.prepareStatement(sqlStr);
            st.setString(1, id);
	        ResultSet result = st.executeQuery();
            while( result.next())
            {
                String menu_name = result.getString( "menu_name" );
                String amount = String.valueOf(result.getInt( "amount" ));
                String str=menu_name+" "+amount+"\n";
                receiveStr.add(str);
            }
            //下が最新の履歴なのでひっくり返します
            for(int i=1;i<6;i++){
                if(receiveStr.size()-i<0)
                    break;
                strTemp=strTemp.append(receiveStr.get(receiveStr.size()-i));
            }
            String str=strTemp.toString();
	        result.close();
            st.close();
            return str;
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
            return null;
        }
    }
}