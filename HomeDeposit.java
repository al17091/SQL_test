/*入金処理*/

class HomeDeposit{
    public static int deposit(int deposit_point,String id){
	int point=0; /*deposit_point:入金額,point:残高*/
	point = StudentInformation.updatePoint(deposit_point,id);/*残高更新*/ 
	//W10入金完了M画面に遷移しdeposit_pointとpointを表示
	return point;
    }
}
