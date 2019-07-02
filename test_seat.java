/*
 座席に関するテスト
 制作日 2019 6/26 作成者 上野
*/
class test_seat{
    public static void main(String[] args){
	String id = args[0];//ユーザーからidを入力
	SeatReservation.seatCheck();
	String seat_number = args[1];
	SeatReservation.input(seat_number,id);
	SeatDataControl.seatLock(id);
    }
}