import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class W9 {


	public static Frame frame_w9;
	static int pt = 0;
	//ptに残金を入れる処理
	public static void f_w9(String id) {
		frame_w9=new Frame();
		frame_w9.setSize(600,800);
		frame_w9.setLayout(null);

		Label label1 = new Label("取消が完了しました");
		Label label2 = new Label("注文内容："+"          "+W5.tyumon);
		Label label3 = new Label("残りのポイント："+"  "+pt+"pt");
		Label label4 = new Label("座席予約："+"          "+W5.seat);
		Button B_home = new Button("ホームに戻る");
		//Button B_yes = new Button("はい");

		label1.setLocation(175, 150);
		label2.setLocation(200, 250);
		label3.setLocation(200, 300);
		label4.setLocation(200, 350);
		B_home.setLocation(250, 600);

		label1.setSize(400, 50);
		label1.setFont(new Font("Arial", Font.PLAIN, 30));
		label2.setSize(400, 50);
		label2.setFont(new Font("Arial", Font.PLAIN, 20));
		label3.setSize(400, 50);
		label3.setFont(new Font("Arial", Font.PLAIN, 20));
		label4.setSize(400, 50);
		label4.setFont(new Font("Arial", Font.PLAIN, 20));
		B_home.setSize(100,50);
		B_home.addActionListener(new OseActionListener_w9());

		frame_w9.add(label1);
		frame_w9.add(label2);
		frame_w9.add(label3);
		frame_w9.add(label4);
		frame_w9.add(B_home);
		frame_w9.addWindowListener(new CloseListener(frame_w9));
		frame_w9.setVisible(true);
	}
}

class OseActionListener_w9 implements ActionListener{

	public void actionPerformed(ActionEvent e){
		W1.f_w1("");
		W9.frame_w9.setVisible(false);
	}
}
