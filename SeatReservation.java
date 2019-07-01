/*
  C3 座席予約管理部　
  制作日 2019 6/4
*/
import java.util.*;
class SeatReservation{
    static String seat_number,seat_availability,id;
   
    public static void seatCheck(){
	SeatDataControl.seatEmptyCheck();

	//ここで座席情報管理部にアクセスしseat_availability(avalistのこと)を取得
    }

    public static void input(String seat_number,String id){
	SeatDataControl.seatTempLock(seat_number,id);
    }

    public static void cancelSeatReservation(String id){
	SeatDataControl.seatCancel(id);
    }
}
