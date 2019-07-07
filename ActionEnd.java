import java.sql.*;
class ActionEnd{
    //別のjavaプロジェクトで使用
    //利用者が食べ終わったときに席をクリアにする。
    //使用メソッドでできることは確認積み
    public static int seat_clear(String id){
        try{
            PreparedStatement st;
            String sqlStr="update student.Table_student_history set time=0 where student_id=? time=1";
            st=ServerConnect.con.prepareStatement(sqlStr);
            st.setString(1, id);
            int re= SeatReservation.cancelSeatReservation(id);
            return re;
        }catch(Exception e){
            return 0;
        }
    }   
}
