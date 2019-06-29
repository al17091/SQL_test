class test_Deposit{
    public static void main(String[] args) {
        String id=args[0];
    /*    int deposit_point=Integer.parseInt(args[1]);
        System.out.println(id+" "+deposit_point);*/
        ServerConnect.st = ServerConnect.connect();
    /*    HomeDeposit.deposit(deposit_point, id);
        */
        int point=7000;
        try {
            String sqlStr = "UPDATE student.Table_student_data SET bank=point WHERE student_id=id";
            pstmt = conn.prepareStatement(sqlStr);
            pstmt.setString(1, eId);
            rs = pstmt.executeQuery();
            System.out.println(id+" "+point);
			String sqlStr = "UPDATE student.Table_student_data SET bank=point WHERE student_id=id";
			ServerConnect.st.executeUpdate(sqlStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}