import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class W5 {

	/**
	 * @param args
	 */
	public static String tyumon = new String("null");
	public static String seat = new String("null");
	//上のフィールドに学生情報DBから格納

	public static Frame frame_w5;

	public static void f_w5(String id) {
		// TODO 自動生成されたメソッド・スタブ
		frame_w5=new Frame();
		frame_w5.setSize(600,800);
		frame_w5.setLayout(null);
		Label now = new Label("現在の注文内容");
		now.setLocation(180,100);
		now.setSize(400, 50);
		now.setFont(new Font("Arial", Font.PLAIN, 30));
		Label naiyou = new Label("注文内容:"+"        "+tyumon);
		naiyou.setLocation(200,250);
		naiyou.setSize(300, 50);
		naiyou.setFont(new Font("Arial", Font.PLAIN, 20));
		Label r_seat = new Label("予約座席:"+"        "+seat);
		r_seat.setLocation(200,350);
		r_seat.setSize(300, 50);
		r_seat.setFont(new Font("Arial", Font.PLAIN, 20));
		Label kakunin = new Label("予約を取り消してもよろしいですか？");
		kakunin.setLocation(75,500);
		kakunin.setSize(450, 50);
		kakunin.setFont(new Font("Arial", Font.PLAIN, 25));
		kakunin.setForeground(Color.red);
		Button home=new Button("ホームに戻る");
		home.setLocation(100, 650);
		home.setSize(100,50);
		home.addActionListener(new to_home_w5(""));
		Button ok=new Button("OK");
		ok.setLocation(400, 650);
		ok.setSize(100,50);
		ok.addActionListener(new cancel(""));
		//frame.add(txtField1);
		//frame.add(button);
		frame_w5.add(now);
		frame_w5.add(naiyou);
		frame_w5.add(r_seat);
		frame_w5.add(kakunin);
		frame_w5.add(home);
		frame_w5.add(ok);
		frame_w5.addWindowListener(new CloseListener(frame_w5));
		frame_w5.setVisible(true);
	}
}

class to_home_w5 implements ActionListener{
	String txt;
	to_home_w5(String str){
		this.txt=str;
	}
	public void actionPerformed(ActionEvent e){
		W1.f_w1("");
		W5.frame_w5.setVisible(false);
	}
}
class cancel implements ActionListener{
	String txt;
	cancel(String str){
		this.txt=str;
	}
	public void actionPerformed(ActionEvent e){
		//キャンセル処理
		W9.f_w9("");
		W5.frame_w5.setVisible(false);
	}
}

