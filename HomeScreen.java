//UIで分岐する法が良い？
class HomeScreen{
    public static void select(int i,String id){
	if(i==0){/*入金*/
	    int deposit_point=0;
	    /*UIから入金金額を取得しdeposit_pointに入れる*/
	    HomeDeposit.deposit(deposit_point,id);
	}
	else if(i==1){/*座席予約*/
	    HomeSeat.seat(id);
	}
	else{/*予約取消*/
	    HomeCancel.cancel(id);
        //System.out.println(cv.money);
	}
    }
}
	    