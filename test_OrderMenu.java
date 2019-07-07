class test_OrderMenu{
  public static void main(String args[]){
    int res;
    int money;
    String menu=args[0];
    String id=args[1];
    ServerConnect.connect();
    res=OrderMenu.possible(menu,id);
    if(menu == "A") money = 500;
	else if(menu == "B") money = 600;
	else money = 550;
    OrderControl.update(id,money);
    System.out.println("done:");
  }
}
