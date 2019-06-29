/*
Login.javaの中で出力処理を追加
*/
class test_login{
    public static void main(String args[]){
        String id=args[0];
        String pass=args[1];
        System.out.println(id+" "+pass);
        LogIn.log(id, pass);
    }
}
