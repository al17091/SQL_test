    
/*入金処理*/

class HomeDeposit{
    public static void deposit(int deposit_point,String id){
	int point; /*deposit_point:入金額,point:残高*/
	
	/*残高更新*/
	point = StudentInformation.updatePoint(deposit_point,id); 
	
	//W10入金完了M画面に遷移しdeposit_pointとpointを表示
    }
}
