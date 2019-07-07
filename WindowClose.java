public class WindowClose{
    public static int seat_cancel(String id){
        //window_close時に影響が出るのは仮ロック中のときに×が押されたときのみ
        //したがって注文選択画面にてwindow_closeのときにこのメソッドを実行する。
        int re=SeatReservation.cancelSeatReservation(id);
        return re;
    }
}
