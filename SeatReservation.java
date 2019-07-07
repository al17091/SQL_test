/*
  C3 座席予約管理部　
  制作日 2019 6/4
*/
import java.util.*;
class SeatReservation{
    //   String seat_number,seat_availability,id;
    
    public static List<String> seatCheck(){
	return SeatDataControl.seatEmptyCheck();
	//ここで座席情報管理部にアクセスしseat_availability(avalistのこと)を取得
    }
    
    public static int input(String seat_number,String id){
	int seatbooked = SeatDataControl.seatTempLock(seat_number,id);
	return seatbooked;
    }
    
    public static int cancelSeatReservation(String id){
	return SeatDataControl.seatCancel(id);
    }
}
