package TimeApp;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class time extends Thread{
	public void run() {
		long time1 = System.currentTimeMillis();
		System.out.println(time1/1000);
		for(int i =0 ; i <5 ; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("시간계산");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		long time2 = System.currentTimeMillis();
		long time3 = time2-time1;
		SimpleDateFormat simple = new SimpleDateFormat("mm분 ss초");
		System.out.println(simple.format(time3));
		
	}
	public static void main(String[] args) {
		frame f = new frame();
		f.frame();
		
		time time = new time();
		time.run();
		
	}
}
class frame{
	public void frame() {
		JFrame frame = new JFrame();
		Container con = new Container();
		JLabel label = new JLabel();
		
		frame.setSize(800, 600);
		frame.setPreferredSize(new Dimension(500,200));
		frame.pack();
		label.setText("하이욤");
		con.add(label);
		Font font = new Font(null, Font.ITALIC , 32);
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		
		
		frame.setVisible(true);
		
		
	}
}
