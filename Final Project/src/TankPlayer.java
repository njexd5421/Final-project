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
			
			int w = 0;
			int h = 0;
			for(int i = 0; i < 700; i++)
				{
					w+=2;
					h+= 1;
			g.drawArc(0, 500, w, h, 0, 180);
			delay();
			g.setColor(Color.white);
			g.drawArc(0, 500, w, h, 0, 180);
			delay();
				}
			//			g.drawArc(x, y, width, height, startAngle, arcAngle);
		}
		public void delay()
			{
	        try
					{
					Thread.sleep(80);
					} catch (InterruptedException e)
					{
					e.printStackTrace();
					}
			}
	}
