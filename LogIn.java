/*
  認証
  制作日 2019 6/4
*/
class LogIn{
    public static int log(String id,String pass){
	int state = StudentInformation.logIn(id,pass);
	/*学生情報管理部にidとpassを出力*/
	//学生情報管理部から正常に完了したか取得しstateに入力
	//state==0：認証不可 state==1：認証成功
	return state;
    }
}
