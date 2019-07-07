//UIでメソッドを実行する可能性あり。

/*座席予約*/

class HomeSeat{
    public static void seat(String id){
	//String seat_availability = 
        SeatReservation.seatCheck();
	//W2座席入力画面に遷移してSeat_availabilityを表示
	
	String seat_number=""; /*seat_number:UIから選ばれた席を入れる変数*/
	//UIからseat_numberを取得
	
	SeatReservation.input(seat_number,id);
	
	//W3注文入力画面に遷移
	
	/*注文処理*/
	OrderControl.stock();
	
	String menu="";
	//UIからメニューの選択
	//選択したメニューをmenuに入れる
	int money=0;
	int flag = OrderMenu.possible(menu,id);
	/*flag==1⇒支払い可能,flag==0⇒支払い不可能*/
	if(flag==1){
	    OrderControl.update(id,menu,money);
	}else{ //flag==0
	    //W8注文不可M画面に遷移
	}
    }
}
