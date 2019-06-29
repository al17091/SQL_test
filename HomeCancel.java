class HomeCancel{
    public static CancelValue cancel(String id){
	String seat_number = SeatReservation.cancelSeatReservation(id);
	CancelValue cv2 = new CancelValue();
	cv2 = StudentInformation.cancelInformation(id,seat_number);
	return cv2;
    }
}
	