import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LoadDriver{
    public static List<String> list = new ArrayList<String>();
    public static List<String> readDB(int num) {
	PreparedStatement st;
        try{
	    String sqlStr = "";
	    ResultSet result;
	    switch (num){
	    case 1:
		sqlStr = "SELECT * FROM order_menu.Table_menu";
		st = ServerConnect.con.prepareStatement(sqlStr);
		result = st.executeQuery();

		while( result.next() )
		    {
			String menu_name = result.getString( "menu_name" );
			list.add(menu_name);
			String amount = result.getString( "amount" );
			list.add(amount);
			String storage = result.getString( "storage" );
			list.add(storage);
		    }
		result.close();
		break;
	    case 2:
		sqlStr = "SELECT * FROM order_menu.Table_menu";
		st = ServerConnect.con.prepareStatement(sqlStr);
		result = st.executeQuery();
		while( result.next() ){
		    String amount = result.getString( "amount" );
		    list.add(amount);
		}
		result.close();
		break;

			    
	    case 3:
		sqlStr = "SELECT seat_number,booked FROM seat.Table_seat";
		st = ServerConnect.con.prepareStatement(sqlStr);
		result = st.executeQuery();
		while( result.next() )
		    {
			String seat_number = result.getString("seat_number");
			list.add(seat_number);
			String booked = result.getString("booked");
			list.add(booked);
		    }
		result.close();
		break;

	    case 4:
		sqlStr = "SELECT A.*,B.seat_number,B.bank FROM student.Table_student_name A,student.Table_student_data B where A.student_id=B.student_id";
		st = ServerConnect.con.prepareStatement(sqlStr);
		result = st.executeQuery();

		while( result.next() )
		    {
			String student_id = result.getString( "student_id" );
			String student_name = result.getString( "student_name" );
			String pass_word = result.getString( "pass_word" );
			String seat_number = result.getString( "seat_number" );
			String bank = result.getString( "bank" );
		    }
		result.close();
	    default:
		break;
	    }
	}catch (Exception e){
	    e.printStackTrace();
	}
	return list;
    }

    /*引数にID使うとき*/
    public static List<String> readDB(int num,String id) {
	PreparedStatement st;
	try{
	    //con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
	    /*sqlコンテナの役割を果たすオブジェクトに渡すためのStatementオブジェクトを作成する。*/
	    //  Statement st = con.createStatement();
	    ResultSet result;
	    switch (num){
	    case 1:
		list.clear();
		String sqlStr = "SELECT seat_number,student_id,booked FROM seat.Table_seat";
		st = ServerConnect.con.prepareStatement(sqlStr);
		result = st.executeQuery();
		while( result.next() )
		    {
			String student_id = result.getString( "student_id" );
			//System.out.println("a");
			if(id.equals(student_id)){
			    String seat_number = result.getString( "seat_number" );
			    int booked = result.getInt("booked");
			    list.add(seat_number);
			    if(booked==2||booked==1)list.add("1");
			    else list.add("0");

			    break;
			}
		    }
		result.close();
		break;
	    case 2:
		sqlStr = "SELECT A.*,B.seat_number,B.bank FROM student.Table_student_name A,student.Table_student_data B where A.student_id=B.student_id";
		st = ServerConnect.con.prepareStatement(sqlStr);
		result = st.executeQuery();
		while( result.next() )
		    {
			String student_id = result.getString( "student_id" );
			if(student_id.equals(id)){
			    String bank = result.getString( "bank" );
			    list.clear();
			    list.add(bank);
			    break;
			    }
			}
		result.close();
		break;
	    case 3:
		sqlStr = "SELECT A.*,B.seat_number,B.bank FROM student.Table_student_name A,student.Table_student_data B where A.student_id=B.student_id";
		st = ServerConnect.con.prepareStatement(sqlStr);
		result = st.executeQuery();
		while( result.next() )
		    {
			String student_id = result.getString( "student_id" );
			/*menu_point menu も必要*/
			list.add(student_id);
		    }
		result.close();
		break;
	    case 4:
		sqlStr = "SELECT amount,student_id FROM student.Table_student_history";
		st = ServerConnect.con.prepareStatement(sqlStr);
		result = st.executeQuery();
		while( result.next() ){
		    String student_id = result.getString( "student_id" );
		    if(student_id.equals(id)){
			String amount = result.getString( "amount" );
			list.add(amount);
			break;
		    }
		}
		result.close();
		break;
	    case 5:
		sqlStr = "SELECT bank,student_id FROM student.Table_student_data";
		st = ServerConnect.con.prepareStatement(sqlStr);
		result = st.executeQuery();
		while( result.next() ){
		    String student_id = result.getString( "student_id" );
		    if(student_id.equals(id)){
			String bank = result.getString( "bank" );
			list.add(bank);
			break;
		    }
		}
		result.close();
		break;
	    default:
		break;
	    }
	    //st.close();
	    //con.close();
	}catch (Exception e){
	    e.printStackTrace();
	}
	return list;
    }

    /*IDとpassを使う(認証)*/
    public static int readDB(String id,String pass) {
	PreparedStatement st;
	int i=0;
	try{
	    //con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
	    /*sqlコンテナの役割を果たすオブジェクトに渡すためのStatementオブジェクトを作成する。*/
	    //Statement st = con.createStatement();

	    String sqlStr = "SELECT student_id,pass_word FROM student.Table_student_name";
	    st = ServerConnect.con.prepareStatement(sqlStr);
	    ResultSet result = st.executeQuery();
	    while( result.next() )
		{
		    String student_id = result.getString( "student_id" );
		    String pass_word = result.getString( "pass_word" );

		    if(student_id.equals(id) && pass_word.equals(pass)){
			i=1;
			break;
		    }
		}
	    result.close();
	    //st.close();
	    //con.close();
	}catch (Exception e){
	    e.printStackTrace();
	}
	return i;
    }

    /*seatを引数にとる更新*/
    public static void writeDB(int num,String seat,String id) {
	try{
	    //con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
	    /*sqlコンテナの役割を果たすオブジェクトに渡すためのStatementオブジェクトを作成する。*/
	    //Statement st = con.createStatement();
	    PreparedStatement st;
	    String sqlStr;

	    switch (num){
	    case 1:
		sqlStr = "UPDATE seat.Table_seat SET student_id=?,booked=1 WHERE seat_number=?";
		st = ServerConnect.con.prepareStatement(sqlStr);
		st.setString(1, id);
		st.setString(2, seat);
		st.executeUpdate();
		break;
	    case 2:
		sqlStr = "UPDATE seat.Table_seat SET booked=2 WHERE student_id=?";
		st = ServerConnect.con.prepareStatement(sqlStr);
		st.setString(1, id);
		st.executeUpdate();
		break;
	    case 3:
		sqlStr = "UPDATE seat.Table_seat SET student_id=NULL,booked=0 WHERE seat_number=?";
		st = ServerConnect.con.prepareStatement(sqlStr);
		st.setString(1, seat);
		st.executeUpdate();
		break;
	    case 4:
		sqlStr = "UPDATE student.Table_student_data SET seat_number=? WHERE student_id=?";
		//System.out.println(seat);
		st = ServerConnect.con.prepareStatement(sqlStr);
		st.setString(1, seat);
		st.setString(2, id);
		st.executeUpdate();
		break;
	    case 5:
		sqlStr = "DELETE FROM student.Table_student_history WHERE student_id=? AND time=1";
		st = ServerConnect.con.prepareStatement(sqlStr); 
		st.setString(1, id);
		st.executeUpdate();
		break;
	    case 6:
		sqlStr = "UPDATE student.Table_student_data SET seat_number=NULL WHERE student_id=?";
		//System.out.println(seat);
		st = ServerConnect.con.prepareStatement(sqlStr);
		st.setString(1, id);
		st.executeUpdate();
		break;
	    default:
		break;
	    }
	    //st.close();
	    //con.close();
	}catch (Exception ex){
	    ex.printStackTrace();
	}
    }

    /*moneyを引数にとる更新*/
    public static void writeDB(String id,String  m_name,int money){
	PreparedStatement st;
	try{
	    /*sqlコンテナの役割を果たすオブジェクトに渡すためのStatementオブジェクトを作成する。*/
	    // Statement st = con.createStatement();
	    String sqlStr = "UPDATE student.Table_student_history SET time=0 WHERE student_id=? AND time=1";
	    st = ServerConnect.con.prepareStatement(sqlStr);
	    st.setString(1, id);
		st.executeUpdate();
		String sqlStr2 = "INSERT student.Table_student_history(student_id,menu_name,amount,time) VALUES (?,?,?,1)";
		st = ServerConnect.con.prepareStatement(sqlStr2);
		st.setString(1, id);
		st.setString(2, m_name);
		st.setInt(3, money);
		st.executeUpdate();
	}catch (Exception ex){
	    ex.printStackTrace();
	}
    }


    public static void writeDB(int point,String id){
	try {
	    PreparedStatement st;
	    String sqlStr = "UPDATE student.Table_student_data SET bank = ? WHERE student_id = ?";
	    st = ServerConnect.con.prepareStatement(sqlStr);
	    st.setInt(1, point);
	    st.setString(2, id);
	    st.executeUpdate();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
    //座席認証 7/2 午前2時変更
    public static int readDB(String seat){
	int x=0;
        try{
            ResultSet result;
            PreparedStatement st;
            String sqlStr = "SELECT booked,seat_number FROM seat.Table_seat ";
            st = ServerConnect.con.prepareStatement(sqlStr);
            result = st.executeQuery();
            while(result.next()){
                int booked = result.getInt("booked");
                //System.out.println(booked);
                String seat_number = result.getString("seat_number");
                if(seat_number.equals(seat) && booked==0){
                    x=1;
                    break;
		}else if(seat_number.equals(seat) && booked==1){
                    x=2;
                    break;
                }
            }
            result.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return x;
    }
}
