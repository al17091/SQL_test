import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class W10 {


	public static Frame fname_w10;
	static int pt = 0;
	//残りポイントをptに格納
	public static void f_w10(String id) {
		fname_w10=new Frame();
		fname_w10.setSize(600,800);
		fname_w10.setLayout(null);
		String kane = new String();
		kane=id;

		Label label1 = new Label("入金が完了しました");
		Label label2 = new Label("入金額："+" "+kane);
		Label label3 = new Label("残りのポイント："+"   "+pt+"pt");
		Button B_home = new Button("ホームに戻る");

		label1.setLocation(175, 150);
		label2.setLocation(200, 250);
		label3.setLocation(200, 300);
		B_home.setLocation(250, 600);

		label1.setSize(400, 50);
		label1.setFont(new Font("Arial", Font.PLAIN, 30));
		label2.setSize(600, 50);
		label2.setFont(new Font("Arial", Font.PLAIN, 20));
		label3.setSize(400, 50);
		label3.setFont(new Font("Arial", Font.PLAIN, 20));
		B_home.setSize(100,50);
		B_home.addActionListener(new OseActionListener_w10());

		fname_w10.add(label1);
		fname_w10.add(label2);
		fname_w10.add(label3);
		fname_w10.add(B_home);
		//fname_w10.add(B_yes);
		fname_w10.addWindowListener(new CloseListener(fname_w10));
		fname_w10.setVisible(true);
	}
}

class OseActionListener_w10 implements ActionListener{

	public void actionPerformed(ActionEvent e){
		W1.f_w1("");
		W10.fname_w10.setVisible(false);
	}
}
