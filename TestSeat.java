
/*
 座席に関するテスト
 制作日 2019 6/26 作成者 上野
*/
import java.util.*;
class TestSeat{
    public static void main(String[] args){
	/*①座席予約画面遷移と同時に出力する空席情報を座席情報DB seat.Table_seatにアクセスし取得する。*/
	ServerConnect.connect();
	List<String> list= new ArrayList<String>();
	String id = args[0];//ユーザーからidを入力
	String seat_number=args[1];
	int test_pattern=Integer.parseInt(args[2]);
	list=SeatReservation.seatCheck();
	for(int i=0; i<LoadDriver.list.size(); i++){
	    System.out.println(LoadDriver.list.get(i));
	}
	switch(test_pattern){
	case 1:
	    int seatbooked = SeatReservation.input(seat_number,id);
	    System.out.println(seatbooked);
	    break;
	case 2:
	    int booked = SeatDataControl.seatLock(id);
	    System.out.println(booked);
	    break;
	case 3:
	    int check=SeatReservation.cancelSeatReservation(id);
	    System.out.println(check);
	    break;
	default:
	    break;
	}
    }
}