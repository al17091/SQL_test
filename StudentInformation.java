/*C6学生情報管理部*/
import java.util.ArrayList;
import java.util.List;

class StudentInformation{
    static int point;

    /*認証処理*/
    public static int logIn(String id, String pass){
	//学生情報DBにidとpass出力
	ServerConnect.connect();
	int i = LoadDriver.readDB(id,pass);
	//IDがデータベースに存在しないi=0
	//passが不一致i=0
	if(i==0) return 0;
	else return 1;
    }

    /*注文処理*/
    public static int orderProcessing(int menu_point,String id){
	int confirm=0;
	//学生情報DBから残高をpoint代入
	List<String> value = LoadDriver.readDB(2,id);
	//System.out.println(value.get(0));
	int point = Integer.parseInt(value.get(0));
	confirm = point - menu_point;
	if(confirm > 0) {
		return 1;//支払い可能
	}
	else return 0;//支払い不可能
    }

    /*入金*/
    public static int downPoint(int Deposit_point,String id){

	//学生情報DBから残高をpointに代入

	List<String> value = LoadDriver.readDB(2,id);
	int point = Integer.parseInt(value.get(0));
	point -= Deposit_point;
	LoadDriver.writeDB(point,id);
	return point;
    }

    public static int updatePoint(int Deposit_point,String id){

    	//学生情報DBから残高をpointに代入

    	List<String> value = LoadDriver.readDB(2,id);
    	int point = Integer.parseInt(value.get(0));
    	point += Deposit_point;
    	LoadDriver.writeDB(point,id);
    	return point;
        }

    /*座席情報*/
    public static void seatInformation(String id, String seat_number){
	//学生情報DBに座席情報を入れる
	LoadDriver.writeDB(4,seat_number,id);
    }

    /*注文情報更新*/
    public static void orderupdate(String id,String menu_name,int money){
	//学生情報DBに注文情報(メニューの金額)を入れる

	LoadDriver.writeDB(id,menu_name,money);

    }

    /*取り消し*/
    public static int cancelInformation(String id){
	CancelValue cv = new CancelValue();
	int menu_point=0;
	//学生情報DBにidを渡し、残金"point"と最新の注文履歴の金額"menu_point"を取得

	String seat_number = null;
	List<String> value = new ArrayList<String>();
	value = LoadDriver.readDB(4,id);
	menu_point = Integer.parseInt(value.get(0));

	if(menu_point == 0) return 0; //注文の予約がないとき0を返す

	value = LoadDriver.readDB(5,id);
	int point = Integer.parseInt(value.get(1));
	int confirm = point + menu_point; //confirm:予約取消後の残金

	LoadDriver.writeDB(5,seat_number,id);

	//学生情報DB内の座席情報と注文履歴を取り消す。confirmを返しユーザーの残金を更新
	LoadDriver.writeDB(confirm,id);
	CancelValue.seat_number = seat_number;
	CancelValue.money = confirm;
	return 1;
	}
}
