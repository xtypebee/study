//fig.3.6:welcomeApplet.java

import java.awt.Graphics;
import javax.swing.JApplet;

public class WelcomeApplet extends JApplet {
	
	public void paint( Graphics g ){
		super.paint( g );
		g.drawString("welcome to Java Programming!",25, 25);
		
	}
}