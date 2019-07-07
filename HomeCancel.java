/*取消処理*/

class HomeCancel{
    public static int cancel(String id){
	//String seat_number = SeatReservation.cancelSeatReservation(id);
	//CancelValue cv2 = new CancelValue();
	int re1 = StudentInformation.cancelInformation(id);
	//上記の結果をintにして下記との積を結果とすべき  
        int re2 = SeatReservation.cancelSeatReservation(id);
	
	int re = re1 * re2;
	return re;
    }
}
