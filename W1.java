import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class W1 {

	/**
	 * @param args
	 */
	public static String Name= new String("null");
	public static String Num= new String("null");
	public static int Pt =0;
	public static Frame frame_w1;
	public static void f_w1(String id) {
		// TODO 自動生成されたメソッド・スタブ
		frame_w1=new Frame("Home");
		frame_w1.setSize(600,800);
		frame_w1.setLayout(null);
		Label wlcm = new Label("Welcome"+"        <"+Name+">");
		wlcm.setLocation(100,50);
		wlcm.setSize(400, 50);
		wlcm.setFont(new Font("Arial", Font.PLAIN, 30));
		Label num = new Label("学籍番号:"+"        "+Num);
		num.setLocation(200,150);
		num.setSize(300, 50);
		Label pt = new Label("残りポイント:"+"        "+Pt);
		pt.setLocation(200,200);
		pt.setSize(300, 50);
		Label rrk = new Label("＜ポイント使用履歴＞");
		rrk.setLocation(100,300);
		rrk.setSize(300, 50);
		rrk.setFont(new Font("Arial", Font.PLAIN, 20));
		TextArea list=new TextArea("LogIn",200,200);
		list.setLocation(100,350);
		list.setSize(400,250);
		TextField txtField1=new TextField(id);
		txtField1.setLocation(100,100);
		txtField1.setSize(400, 200);
		Button nyukin=new Button("入金はこちら");
		nyukin.setLocation(100, 650);
		nyukin.setSize(100,50);
		nyukin.addActionListener(new AL_nyukin(""));
		Button zaseki=new Button("座席予約");
		zaseki.setLocation(250, 650);
		zaseki.setSize(100,50);
		zaseki.addActionListener(new AL_zaseki(""));
		Button cancel=new Button("予約取消");
		cancel.setLocation(400, 650);
		cancel.setSize(100,50);
		cancel.addActionListener(new AL_cancel(""));
		//frame.add(txtField1);
		//frame.add(button);
		frame_w1.add(wlcm);
		frame_w1.add(num);
		frame_w1.add(pt);
		frame_w1.add(rrk);
		frame_w1.add(list);
		frame_w1.add(nyukin);
		frame_w1.add(zaseki);
		frame_w1.add(cancel);
		frame_w1.addWindowListener(new CloseListener(frame_w1));
		frame_w1.setVisible(true);
	}
}

class AL_nyukin implements ActionListener{
	String txt;
	AL_nyukin(String str){
		this.txt=str;
	}
	public void actionPerformed(ActionEvent e){
		W6.f_w6("");
		W1.frame_w1.setVisible(false);
	}
}
class AL_zaseki implements ActionListener{
	String txt;
	AL_zaseki(String str){
		this.txt=str;
	}
	public void actionPerformed(ActionEvent e){
		W2.f_w2("");
		W1.frame_w1.setVisible(false);
	}
}
class AL_cancel implements ActionListener{
	String txt;
	AL_cancel(String str){
		this.txt=str;
	}
	public void actionPerformed(ActionEvent e){
		W5.f_w5("");
		W1.frame_w1.setVisible(false);
	}
}
