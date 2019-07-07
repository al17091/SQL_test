/*C4注文情報管理部*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class OrderControl{
    static String menu;
    static int money;
    public static int stock(){
    	List<String> menu = new ArrayList<String>();
    	//注文情報DBから注文メニューを持ってきてmenuに入れる
    	menu = LoadDriver.readDB(1);
    	/*menu_name,amount,storageの順にArrayListに格納されている*/
    	String A="A";
        String B="B";
        int choice;
        Scanner sc=new Scanner(System.in);
    	//注文メニューをUIに表示
        System.out.println(menu.get(3)+"or"+menu.get(6)+"or"+menu.get(9)+"?");
        String input_text=sc.nextLine();
        if(input_text.equals(A)) {
        	choice = 0;
        }else if(input_text.equals(B)) {
        	choice = 1;
        }else {
        	choice = 2;
        }
        return choice;
    }

    public static int possible(String menu,String id){
	int money=0;
	if(menu == "A") money = 500;
	else if(menu == "B") money = 600;
	else money = 400;
	int flag = StudentInformation.orderProcessing(money,id);
	return flag; //支払い可能確認
    }
    public static int update(String id,String menu,int money){
    	//System.out.println(money);
	SeatDataControl.seatLock(id);//仮ロック→予約済みに変更
	StudentInformation.orderupdate(id,menu,money);//注文情報更新
	StudentInformation.downPoint(money,id);

	int i=1;
	return i;

	//W7座席注文完了M画面に遷移しmenuとmoneyを表示する

    }
}