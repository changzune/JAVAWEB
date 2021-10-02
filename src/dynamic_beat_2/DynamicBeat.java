package dynamic_beat_2;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DynamicBeat extends JFrame {
	
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image introBackground;
	
	
	public DynamicBeat( ) {
		setTitle("Danamic beat");
		setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	
		
		introBackground = new ImageIcon(Main.class.getResource("../imges/lmageBackground.jpg")).getImage();
	}
	
	public void paint(Graphics g){
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
		
	}
	

}
