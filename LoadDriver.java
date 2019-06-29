import java.sql.*;
import java.util.*;

public class LoadDriver{
    public static List<String> readDB(int num,Statement st) {
        /*
	Connection con=null;
	
	try{
	    Class.forName("com.mysql.jdbc.Driver").newInstance();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch (Exception ex){
            System.out.println("error "+ex.getMessage());
        }
	*/
	List<String> list = new ArrayList<String>();
        try{
	    // con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
	        
            /*sqlコンテナの役割を果たすオブジェクトに渡すためのStatementオブジェクトを作成する。*/
	    // Statement st = con.createStatement();
	    
	    String sqlStr = "";
	    ResultSet result;
	    switch (num){
	    case 1:
		sqlStr = "SELECT * FROM order_menu.Table_menu";
		result = st.executeQuery( sqlStr );

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
		result = st.executeQuery( sqlStr );
		while( result.next() ){
		    String amount = result.getString( "amount" );
		    list.add(amount);
		}
		result.close();
		break;
	    case 3:
		sqlStr = "SELECT booked FROM seat.Table_seat";
		result = st.executeQuery(sqlStr);
		
		while( result.next() )
		    {
			String booked = result.getString( "booked");
			list.add(booked);
		    }
		result.close();
		break;
		
	    case 4:
		
		sqlStr = "SELECT A.*,B.seat_number,B.bank FROM student.Table_student_name A,student.Table_student_data B where A.student_id=B.student_id";
		result = st.executeQuery( sqlStr );
		
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
	    //st.close();
	    //con.close();
	}catch (SQLException ex){
	    ex.printStackTrace();
	}
	return list;
    }
    
    /*引数にID使うとき*/
    public static List<String> readDB(int num,String id,Statement st) {
        /*
	Connection con=null;
	
	try{
	    Class.forName("com.mysql.jdbc.Driver").newInstance();
        }catch(ClassNotFoundException e){
	    e.printStackTrace();
	}catch (Exception ex){
	    System.out.println("error "+ex.getMessage());
	}*/
	List<String> list = new ArrayList<String>();
        try{
            //con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
            /*sqlコンテナの役割を果たすオブジェクトに渡すためのStatementオブジェクトを作成する。*/
	//  Statement st = con.createStatement();
	    ResultSet result;
	    switch (num){
	    case 1:
		String sqlStr = "SELECT seat_number FROM seat.Table_seat";
		result = st.executeQuery( sqlStr );
		
		while( result.next() )
		    {
			String student_id = result.getString( "student_id" );
			if(student_id.equals(id)){
			    String seat_number = result.getString( "seat_number" );
			    list.add(seat_number);
			    break;
			}
		    }
		result.close();
		break;
	    case 2:
		sqlStr = "SELECT A.*,B.seat_number,B.bank FROM student.Table_student_name A,student.Table_student_data B where A.student_id=B.student_id";
		result = st.executeQuery( sqlStr );
		while( result.next() )
		    {
			String student_id = result.getString( "student_id" );
			if(student_id.equals(id)){
			    String bank = result.getString( "bank" );
			    list.add(bank);
			    break;
			}
		    }
		result.close();
		break;
	    case 3:
		sqlStr = "SELECT A.*,B.seat_number,B.bank FROM student.Table_student_name A,student.Table_student_data B where A.student_id=B.student_id";
		result = st.executeQuery( sqlStr );
		
		while( result.next() )
		    {
			String student_id = result.getString( "student_id" );
			/*menu_point menu も必要*/
			list.add(student_id);
		    }
		result.close();
		break;
	    case 4:
		sqlStr = "SELECT amount FROM student.Table_student_history";
		result = st.executeQuery( sqlStr );
		while( result.next() ){
		    String student_id = result.getString( "student_id" );
		    if(student_id.equals(id)){
			String amount = result.getString( "amount" );
			list.add(amount);
			break;
		    }
		}
		break;
	    case 5:
		sqlStr = "SELECT bank FROM student.Table_student_data";
		result = st.executeQuery( sqlStr );
		while( result.next() ){
		    String student_id = result.getString( "student_id" );
		    if(student_id.equals(id)){
			String bank = result.getString( "bank" );
			list.add(bank);
			break;
		    }
		}
		break;
	    default:
		break;
	    }
	    //st.close();
	    //con.close();
	}catch (SQLException ex){
	    ex.printStackTrace();
	}
	return list;
    }
    /*IDとpassを使う(認証)*/
    public static int readDB(String id,String pass,Statement st) {
	Connection con=null;
	/*
	try{
	    Class.forName("com.mysql.jdbc.Driver").newInstance();
	}catch(ClassNotFoundException e){
	    e.printStackTrace();
	}catch (Exception ex){
	    System.out.println("error "+ex.getMessage());
	}
	*/
	int i=0;
	try{
	    
	    //con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
	    /*sqlコンテナの役割を果たすオブジェクトに渡すためのStatementオブジェクトを作成する。*/
	    //Statement st = con.createStatement();
	        
	    String sqlStr = "SELECT student_id,pass_word FROM student.Table_student_name";
	    ResultSet result = st.executeQuery( sqlStr );
	        
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
	}catch (SQLException ex){
	    ex.printStackTrace();    
	}
	return i;
    }
    /*seatを引数にとる更新*/
    public static void writeDB(int num,String seat,String id,Statement st) {
	/*Connection con=null;
	try{
	    Class.forName("com.mysql.jdbc.Driver").newInstance();
	}catch(ClassNotFoundException e){
	    e.printStackTrace();
	}catch (Exception ex){
	    System.out.println("error "+ex.getMessage());
	}
	*/
	try{
	    //con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
	    /*sqlコンテナの役割を果たすオブジェクトに渡すためのStatementオブジェクトを作成する。*/
	    //Statement st = con.createStatement();
	        
	    String sqlStr;
	    
	    switch (num){
	    case 1:
		sqlStr = "UPDATE seat.Table_seat SET student_id=id,booked=1 WHERE seat_number=seat";
		st.executeUpdate( sqlStr );
		break;
	    case 2:
		sqlStr = "UPDATE seat.Table_seat SET booked=2 WHERE student_id=id";
		st.executeUpdate( sqlStr );
		break;
	    case 3:
		sqlStr = "UPDATE seat.Table_seat SET booked=0 WHERE student_id=id";
		st.executeUpdate( sqlStr );
		break;
	    case 4:
		sqlStr = "UPDATE student.Table_student_data SET seat_number=seat WHERE student_id=id";
		st.executeUpdate( sqlStr );
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
    public static void writeDB(String id,int money,Statement st){
	/*Connection con=null;
	  try{
	  Class.forName("com.mysql.jdbc.Driver").newInstance();
	  }catch(ClassNotFoundException e){
	  e.printStackTrace();
	  }catch (Exception ex){
	  System.out.println("error "+ex.getMessage());
	  }*/
	try{
	    //con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
	    /*sqlコンテナの役割を果たすオブジェクトに渡すためのStatementオブジェクトを作成する。*/
	    // Statement st = con.createStatement();
	    String sqlStr = "UPDATE student.Table_student_history SET amount=money WHERE student_id=id";
	    st.executeUpdate( sqlStr );
	    //st.close();
	    //con.close();      
	}catch (Exception ex){
	    ex.printStackTrace();    
	}
	}
	
	public static void writeDB(Statement st,String id,int point){
		try {
			System.out.println(id+""+point);
			String sqlStr = "UPDATE student.Table_student_data SET bank=point WHERE student_id=id";
			st.executeUpdate(sqlStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
