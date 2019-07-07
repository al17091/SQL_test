import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JPasswordField;


public class W0 {

	/**
	 * @param args
	 */
	public static Label er;
	public static Frame frame_w0;
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		frame_w0=new Frame("Log In");
		frame_w0.setSize(600,800);
		frame_w0.setLayout(null);
		Label in = new Label("ログイン");
		in.setLocation(225,50);
		in.setSize(400, 200);
		in.setFont(new Font("Arial", Font.PLAIN, 30));
		er = new Label("");
		er.setLocation(200,450);
		er.setSize(200, 100);
		Label id = new Label("ID");
		id.setLocation(100,260);
		id.setSize(400, 50);
		TextField txtField1=new TextField();
		txtField1.setLocation(100,300);
		txtField1.setSize(400, 20);
		Label pass = new Label("Pass");
		pass.setLocation(100,360);
		pass.setSize(400, 50);
		JPasswordField txtField2 = new JPasswordField();
		txtField2.setLocation(100,400);
		txtField2.setSize(400, 20);
		Button button=new Button("Login");
		button.setLocation(250, 600);
		button.setSize(100,50);
		button.addActionListener(new OseActionListener_w0(txtField1,txtField2));
		frame_w0.add(txtField1);
		frame_w0.add(txtField2);
		frame_w0.add(in);
		frame_w0.add(id);
		frame_w0.add(pass);
		frame_w0.add(er);
		frame_w0.add(button);
		frame_w0.addWindowListener(new CloseListener(frame_w0));
		frame_w0.setVisible(true);
	}
}

class OseActionListener_w0 implements ActionListener{
	TextField txt1;
	JPasswordField txt2;
	OseActionListener_w0(TextField txt1,JPasswordField txt2){
		this.txt1=txt1;
		this.txt2=txt2;
	}

//	判定
	//画面遷移だけする。
	public void actionPerformed(ActionEvent e){
		String id=this.txt1.getText();
		String password= new String(this.txt2.getPassword());
		if(LogIn.log(id,password)==1){
			W1.f_w1("");
			W0.frame_w0.setVisible(false);
		}else{
			System.out.println("no");
			W0.er.setText("パスワードかIDが間違っています");
			W0.er.setForeground(Color.red);

		}
	}
}
class CloseListener extends WindowAdapter {
	Frame f;
	CloseListener(Frame f){
		this.f=f;
	}

	 public void windowClosing(WindowEvent e) {//「×」ボタンが押されるとこのメソッドが実行されます。
		 f.setVisible(false);
		System.exit(0);
    }
}
