/*
  認証
  制作日 2019 6/4
*/
class LogIn{
    public static void log(String id,String pass){
	int state = StudentInformation.logIn(id,pass);
	/*学生情報管理部にidとpassを出力*/
	//学生情報管理部から正常に完了したか取得しstateに入力
	//state==0：認証不可 state==1：認証成功
	if(state==0){
		/*認証不可MをUIに出力*/
		System.out.println("No");
	}
	if(state==1){
		//ホーム画面に遷移
		System.out.println("Yes");
	}
    }
}