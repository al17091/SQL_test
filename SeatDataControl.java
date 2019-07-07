/*
  C5 座席情報管理部
  制作日 2019 6/4
*/
import java.util.*;

public class SeatDataControl{
    public static List<String> seatEmptyCheck(){
	/*DBにアクセスし全座席の空席情報seat_availabilityを取得*/
	LoadDriver.list = LoadDriver.readDB(3);
	return LoadDriver.list;
    }
    public static int seatTempLock(String seat_number,String id){
	int booked = LoadDriver.readDB(seat_number);
        //System.out.println(booked);
        if(booked == 1){
	    /*DBにアクセスしseat_numberにidを登録し、座席状態を"空席"から"仮ロック"に変更する*/
	    LoadDriver.writeDB(1,seat_number,id);
	    return 1;//success
	}else{
	    return 0;//失敗
	}
    }
    public static int seatLock(String id){
	LoadDriver.list = LoadDriver.readDB(1,id);
	String seat_number = LoadDriver.list.get(0);
	int booked = LoadDriver.readDB(seat_number);
        if(booked == 2){
	    
	    /*その座席の状態を"仮ロック"から"予約済み"に変更する*/
	    LoadDriver.writeDB(2,seat_number,id);
	    /*学生情報DB student.Table_student_dataのseat_numberに先ほど取得し\	\
	      たseat_numberを代入する*/
	    StudentInformation.seatInformation(id,seat_number);
	    return 1;//success
	}else{
            return 0;//失敗
        }
    }
    public static int seatCancel(String id){
	/*DBにアクセスしidの座席情報seat_numberを参照しseat_numberに属する情報を取得する。*/
	LoadDriver.list = LoadDriver.readDB(1,id);
	String seat_number = LoadDriver.list.get(0);
	int booked = Integer.parseInt(LoadDriver.list.get(1));
	//System.out.println(seat_number);
	/*その座席の状態を"予約済み"から"空席"に変更する*/
	if(booked==1){
	    LoadDriver.writeDB(3,seat_number,id);
	    LoadDriver.writeDB(6,seat_number,id);
	    return 1;
	}else{
	    return 0;
	}
    }
}
