import java.io.*;
import java.net.*;

public class TCP_Client {

	
	public static void main(String[] args) {
		int port=9988;
		try {
			Socket skt=new Socket("172.16.38.40",port);
			BufferedWriter oSW =new BufferedWriter(new OutputStreamWriter(skt.getOutputStream()));
			PrintWriter outS=new PrintWriter(oSW,true);
			BufferedReader iSR =new BufferedReader(new InputStreamReader(skt.getInputStream()));
			BufferedReader inS= new BufferedReader(iSR);
			if(args.length==0){
				outS.println("rand");
			}else{
				outS.println(args[0]);
			}
			String tmpString="";
			while((tmpString=inS.readLine())!=null){
				System.out.println(tmpString);
			}
			inS.close();
			outS.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
