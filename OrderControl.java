/*C4注文情報管理部*/
import java.util.*;

class OrderControl{
    static String menu;
    static int money;
    public static void stock(){
	List<String> menu = new ArrayList<String>();
	//注文情報DBから注文メニューを持ってきてmenuに入れる
	menu = LoadDriver.readDB(1,ServerConnect.st);
	/*menu_name,amount,storageの順にArrayListに格納されている*/

	//注文メニューをUIに表示

    }
    public static int possible(String menu,String id){
	int money=0;
	if(menu == "A") money = 500;
	else if(menu == "B") money = 600;
	else money = 550;
	int flag = StudentInformation.orderProcessing(money,id);
	return flag; //支払い可能確認
    }
    public static void update(String id,int money){
	SeatDataControl.seatLock(id);//仮ロック→予約済みに変更
	StudentInformation.orderupdate(id,money);//注文情報更新

	//W7座席注文完了M画面に遷移しmenuとmoneyを表示する

    }
}
