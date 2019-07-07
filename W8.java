import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class W8 {


	public static Frame frame_w8;
	public static void f_w8(String id) {
		frame_w8=new Frame();
		frame_w8.setSize(600,800);
		frame_w8.setLayout(null);

		Label label1 = new Label("残高が足りません");
		label1.setFont(new Font("Arial", Font.PLAIN, 30));
		Button B_home = new Button("ホームに戻る");
		//Button B_yes = new Button("はい");

		label1.setLocation(150, 150);
		B_home.setLocation(250, 500);

		label1.setSize(400, 50);
		B_home.setSize(100,50);

		B_home.addActionListener(new OseActionListener_w8());
		frame_w8.add(label1);
		frame_w8.add(B_home);
		frame_w8.addWindowListener(new CloseListener(frame_w8));
		frame_w8.setVisible(true);
	}
}

class OseActionListener_w8 implements ActionListener{

	public void actionPerformed(ActionEvent e){
		W1.f_w1("");
		W8.frame_w8.setVisible(false);
	}
}
