import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class W3 {

	/**
	 * @param args
	 */
	String nm;
	public static Label kakunin2;
	public static Frame frame_w3;
	public static Button susumu;

	public static void f_w3(String id) {
		// TODO 自動生成されたメソッド・スタブ
		frame_w3=new Frame("メニュー");
		frame_w3.setSize(600,800);
		frame_w3.setLayout(null);
		Label menu = new Label("MENU");
		menu.setLocation(250,50);
		menu.setSize(400, 50);
		menu.setFont(new Font("Arial", Font.PLAIN, 30));
		kakunin2 = new Label("メニューを選択してください");
		kakunin2.setLocation(200,550);
		kakunin2.setSize(300, 50);
		kakunin2.setFont(new Font("Arial", Font.PLAIN, 20));
		kakunin2.setForeground(Color.red);
		Button A_menu=new Button("A定食　¥500");
		A_menu.setLocation(200, 150);
		A_menu.setSize(200,100);
		A_menu.addActionListener(new Menu("A定食"));
		Button B_menu=new Button("B定食　¥600");
		B_menu.setLocation(200, 275);
		B_menu.setSize(200,100);
		B_menu.addActionListener(new Menu("B定食"));
		Button C_menu=new Button("C定食　¥400");
		C_menu.setLocation(200, 400);
		C_menu.setSize(200,100);
		C_menu.addActionListener(new Menu("C定食"));
		Button modoru =new Button("戻る");
		modoru.setLocation(100, 650);
		modoru.setSize(100,50);
		modoru.addActionListener(new to_w2(""));
		susumu =new Button("OK");
		susumu.setLocation(400, 650);
		susumu.setSize(100,50);
		susumu.addActionListener(new to_w7(""));


		frame_w3.add(menu);
		frame_w3.add(kakunin2);
		frame_w3.add(A_menu);
		frame_w3.add(B_menu);
		frame_w3.add(C_menu);
		frame_w3.add(modoru);
		frame_w3.addWindowListener(new CloseListener(frame_w3));
		frame_w3.setVisible(true);
	}
}

class Menu implements ActionListener{
	String  txt;
	Menu(String str){
		this.txt=str;
	}
	public void actionPerformed(ActionEvent e){
		W3.frame_w3.add(W3.susumu);
		W3.kakunin2.setText(txt+"でよろしいですか？");
	}
}
class to_w2 implements ActionListener{
	String txt;
	to_w2(String str){
		this.txt=str;
	}
	public void actionPerformed(ActionEvent e){
		W2.f_w2("");
		W3.frame_w3.setVisible(false);
	}
}
class to_w7 implements ActionListener{
	String txt;
	to_w7(String str){
		this.txt=str;
	}
	public void actionPerformed(ActionEvent e){
		W7.f_w7("");//Stringにメニュー名を格納
		W3.frame_w3.setVisible(false);
	}
}


