import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class W2 {

	/**
	 * @param args
	 */
	String nm;
	public static Label kakunin;
	public static String seki = new String("");
	public static Frame frame_w2;
	public static Button susumu;

	public static void f_w2(String id) {
		// TODO 自動生成されたメソッド・スタブ
		frame_w2=new Frame("座席予約");
		frame_w2.setSize(600,800);
		frame_w2.setLayout(null);
		Label mes = new Label("座席予約");
		mes.setLocation(100,100);
		mes.setSize(400, 50);
		mes.setFont(new Font("Arial", Font.PLAIN, 30));
		kakunin = new Label("座席を選択してください");
		kakunin.setLocation(225,550);
		kakunin.setSize(300, 50);
		kakunin.setFont(new Font("Arial", Font.PLAIN, 20));
		kakunin.setForeground(Color.red);
		//中央に揃えたい　kakunin.setHorizontalAlignment(Label.CENTER);
		TextField txtField1=new TextField(id);
		txtField1.setLocation(100,100);
		txtField1.setSize(400, 200);
		Button A1=new Button("A1");
		A1.setLocation(150, 200);
		A1.setSize(75,75);
		A1.addActionListener(new seat("A1"));
		Button A2=new Button("A2");
		A2.setLocation(250, 200);
		A2.setSize(75,75);
		A2.addActionListener(new seat("A2"));
		Button A3=new Button("A3");
		A3.setLocation(350, 200);
		A3.setSize(75,75);
		A3.addActionListener(new seat("A3"));
		Button B1=new Button("B1");
		B1.setLocation(150, 350);
		B1.setSize(75,75);
		B1.addActionListener(new seat("B1"));
		Button B2=new Button("B2");
		B2.setLocation(250, 350);
		B2.setSize(75,75);
		B2.addActionListener(new seat("B2"));
		Button B3=new Button("B3");
		B3.setLocation(350, 350);
		B3.setSize(75,75);
		B3.addActionListener(new seat("B3"));
		Button modoru =new Button("ホームに戻る");
		modoru.setLocation(100, 650);
		modoru.setSize(100,50);
		modoru.addActionListener(new to_home(""));
		susumu =new Button("OK");
		susumu.setLocation(400, 650);
		susumu.setSize(100,50);
		susumu.addActionListener(new to_w3(""));

		//席に予約があるかを確認して予約があれば色を変える
		A1.setBackground(Color.red);
		A1.setForeground(Color.red);


		frame_w2.add(mes);
		frame_w2.add(kakunin);
		frame_w2.add(A1);
		frame_w2.add(A2);
		frame_w2.add(A3);
		frame_w2.add(B1);
		frame_w2.add(B2);
		frame_w2.add(B3);
		frame_w2.add(modoru);
		frame_w2.addWindowListener(new CloseListener(frame_w2));
		frame_w2.setVisible(true);
	}
}

class seat implements ActionListener{
	String txt;
	seat(String str){
		this.txt=str;
	}
	public void actionPerformed(ActionEvent e){
		//座席を確認して予約がなければ
		W2.frame_w2.add(W2.susumu);
		W2.kakunin.setText(txt+"を予約します");
		//予約がある場合
		//W2.kakunin.setText(txt+"は予約済みです");
	}
}
class to_home implements ActionListener{
	String txt;
	to_home(String str){
		this.txt=str;
	}
	public void actionPerformed(ActionEvent e){
		W1.f_w1("");
		W2.frame_w2.setVisible(false);
	}
}
class to_w3 implements ActionListener{
	String txt;
	to_w3(String str){
		this.txt=str;
	}
	public void actionPerformed(ActionEvent e){
		W3.f_w3("");
		W2.frame_w2.setVisible(false);
	}
}

