/*
  C3 座席予約管理部　
  制作日 2019 6/4
*/
class SeatReservation{
    static String seat_number,seat_availability,id;
   
    public static String seatCheck(){
	SeatDataControl.seatEmptyCheck();
	//ここで座席情報管理部にアクセスしSeat_availabilityを取得
	return seat_availability;
    }

    public static void input(String seat_number,String id){
	SeatDataControl.seatTempLock(seat_number,id);
    }

    public static String cancelSeatReservation(String id){
	seat_number = SeatDataControl.seatCancel(id);
	return seat_number;
    }
}