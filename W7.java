import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class W7 {

	public static Frame frame_w7;

	public static void f_w7(String id) {
		frame_w7=new Frame();
		frame_w7.setSize(600,800);
		frame_w7.setLayout(null);

		//注文内容を格納する
		String tyumon = new String();
		int pt=0;
		String seat = new String();

		Label label1 = new Label("注文が完了しました");
		Label label2 = new Label("注文内容："+"          "+tyumon);
		Label label3 = new Label("残りのポイント："+"  "+pt+"pt");
		Label label4 = new Label("座席予約："+"          "+seat);
		Button B_home = new Button("ホームに戻る");

		label1.setLocation(175, 100);
		label2.setLocation(200, 200);
		label3.setLocation(200, 250);
		label4.setLocation(200, 300);
		B_home.setLocation(250, 500);

		label1.setSize(400, 50);
		label1.setFont(new Font("Arial", Font.PLAIN, 30));
		label2.setSize(400, 50);
		label2.setFont(new Font("Arial", Font.PLAIN, 20));
		label3.setSize(400, 50);
		label3.setFont(new Font("Arial", Font.PLAIN, 20));
		label4.setSize(400, 50);
		label4.setFont(new Font("Arial", Font.PLAIN, 20));
		B_home.setSize(100,50);

		B_home.addActionListener(new OseActionListener_w7());
		frame_w7.add(label1);
		frame_w7.add(label2);
		frame_w7.add(label3);
		frame_w7.add(label4);
		frame_w7.add(B_home);
		frame_w7.addWindowListener(new CloseListener(frame_w7));
		frame_w7.setVisible(true);
	}
}

class OseActionListener_w7 implements ActionListener{

	public void actionPerformed(ActionEvent e){
		//残高が足りるか判定
		W8.f_w8("");//残高足りない時

		//残高足りる時
		//注文処理
		//W1.f_w1("");

		W7.frame_w7.setVisible(false);

	}
}

