class test_Deposit{
    public static void main(String[] args) {
        String id=args[0];
        int deposit_point=Integer.parseInt(args[1]);
        ServerConnect.connect();
        HomeDeposit.deposit(deposit_point, id);
    }
}