import java.awt.*;
import javax.swing.*;	
import javax.swing.JFrame;
public class TankPlayer extends Canvas
	{
		private static final long	serialVersionUID	= 1L;
		public static void main(String[] args) 
    		{
    		TankPlayer canvas = new TankPlayer();
	        JFrame frame = new JFrame();
	        frame.setSize(650, 650);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
		
		public void paint(Graphics g)
		{
			g.fillRect(600, 600, 50, 20);
			int [] xV = {630, 630, 570, 530};
			int [] yV = {620, 590, 560, 560};
			g.fillPolygon(xV, yV , 4);
			g.setColor(Color.gray);
			g.fillOval(40, 40, 60, 30);
			g.setColor(Color.gray);
			g.fillOval(15, 60, 110, 30);
			for(int i = 500; i >= 0; i--)
				{
					g.setColor(Color.red);
					g.fillOval(i,i, 20, 20);
					delay();
					
					g.setColor(Color.WHITE);
					g.fillOval(i, i, 21, 21);
				
					
				}
			for(int b = 500; b >= 0; b--)
				{
					g.setColor(Color.red);
					g.fillOval(b ,b , 20, 20);
					delay();
					
					g.setColor(Color.WHITE);
					g.fillOval(b, b, 21, 21);
					
				}
			for(int c = 500; c >= 0; c--)
				{
					g.setColor(Color.red);
					g.fillOval(c, c, 20, 20);
					delay();
					
					g.setColor(Color.WHITE);
					g.fillOval(c, c, 21, 21);
				}
			
		}
		public void delay()
			{
	        try
					{
					Thread.sleep(2);
					} catch (InterruptedException e)
					{
					e.printStackTrace();
					}
			}
	}
