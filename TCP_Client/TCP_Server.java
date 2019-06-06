import java.io.*;
import java.net.*;
import java.util.*;
public class TCP_Server {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int port=9988;
		try {
			ServerSocket srvSock=new ServerSocket(port);
			boolean flg=true;
			while(flg==true){
				Socket skt=srvSock.accept();
				InputStreamReader iSR=new InputStreamReader(skt.getInputStream());
				BufferedReader inS= new BufferedReader(iSR);
				OutputStreamWriter oSW=new OutputStreamWriter(skt.getOutputStream());
				PrintWriter outS=new PrintWriter(oSW,true);
				Calendar cal=Calendar.getInstance();
				String msg=inS.readLine();
				if(msg.equals("")){ flg=false; }
				String tmpString="Recieved:"+msg;
				tmpString+=" (at time "+cal.get(cal.HOUR);
				tmpString+=":"+cal.get(cal.MINUTE)+")";
				System.out.println(tmpString);
				outS.println(tmpString);
				inS.close();
				outS.close();
				skt.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
	