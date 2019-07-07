import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class W6 {

	/**
	 * @param args
	 */
	
	public static Frame frame_w6;
	public static void f_w6(String id) {
		// TODO 自動生成されたメソッド・スタブ
		frame_w6=new Frame();
		frame_w6.setSize(600,800);
		frame_w6.setLayout(null);
		Label title = new Label("入金フォーム");
		title.setLocation(200,150);
		title.setSize(400, 50);
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		Label q = new Label("＜いくら入金しますか＞");
		q.setLocation(180,250);
		q.setSize(300, 50);
		q.setFont(new Font("Arial", Font.PLAIN, 20));
		TextField kingaku=new TextField();
		kingaku.setLocation(180,350);
		kingaku.setSize(225, 50);
		Button button=new Button("入金");
		button.setLocation(250, 600);
		button.setSize(100,50);
		button.addActionListener(new nyukin_1(kingaku));
		frame_w6.add(title);
		frame_w6.add(q);
		frame_w6.add(kingaku);
		frame_w6.add(button);
		frame_w6.addWindowListener(new CloseListener(frame_w6));
		frame_w6.setVisible(true);
	}
}

class nyukin_1 implements ActionListener{
	String kane;
	nyukin_1(TextField money){
		this.kane=money.getText();
	}

	public void actionPerformed(ActionEvent e){
		//入金処理
		//入力が数字じゃないときのエラー処理も
		W10.f_w10(kane);
		W6.frame_w6.setVisible(false);
	}
}

