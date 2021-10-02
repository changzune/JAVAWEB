package dynamic_beat_2;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DynamicBeat extends JFrame {
	
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image image2;
	
	
	public DynamicBeat( ) {
		setTitle("Danamic beat");
		setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		image2 = new ImageIcon(Main.class.getResource("../images/image2.jpg"));.getImage0;
		
	}
	
	

}
