/*
  C5 座席情報管理部
  制作日 2019 6/4
*/
import java.util.*;
import java.sql.*;
class SeatDataControl{
    public static List<String> seatEmptyCheck(){
	String seat_availability="";
	/*DBにアクセスし全座席の空席情報seat_availabilityを取得*/
	List<String> avalist = new ArrayList<String>();
	avalist = LoadDriver.readDB(3,ServerConnect.st);
	return avalist;
    }
    public static void seatTempLock(String seat_number,String id){
	/*DBにアクセスしseat_numberにidを登録し、座席状態を"空席"から"仮ロック"に変更する*/
	LoadDriver.writeDB(1,seat_number,id,ServerConnect.st);
    }
    public static void seatLock(String id){
	String seat_number = "";
	LoadDriver.writeDB(2,seat_number,id,ServerConnect.st);
	/*その座席の状態を"仮ロック"から"予約済み"に変更する*/
	StudentInformation.seatInformation(id,seat_number);
    }
    public static String seatCancel(String id){
	/*DBにアクセスしidの座席情報seat_numberを参照し取得する。*/
	List<String> seat = new ArrayList<String>();
	seat = LoadDriver.readDB(1,id,ServerConnect.st);
	String seat_number = seat.get(0);
	/*その座席の状態を"予約済み"から"空席"に変更する*/
	LoadDriver.writeDB(3,seat_number,id,ServerConnect.st);

	return seat_number;
    }
}