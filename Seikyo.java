//別のjavaプロジェクトで使用
//このクラスの実行前にsqlConnect済み
import java.sql.*;

class Seikyo{
    public static int action(String id,int deposit_point){
        //入金の逆を用いて支払い
        int point=-deposit_point;
        int re=0;
        //student.Table_student_historyに履歴を残す
        try {
            PreparedStatement st;
            String sqlStr = "UPDATE student.Table_student_history SET menu_id='0',menu_name='生協',amount=? WHERE student_id = ?";
            st = ServerConnect.con.prepareStatement(sqlStr);
            st.setInt(1, deposit_point);
            st.setString(2, id);
            st.executeUpdate();
            st.close();
            re= HomeDeposit.deposit(point, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(re>0)
            re=1;
        return re;
    }   
}
