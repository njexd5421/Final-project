
import java.awt.*;
import javax.swing.*;	


public class Missle extends Canvas
	{
		private static final long	serialVersionUID	= 1L;
		public static void main(String[] args)
			{
				Missle canvas = new Missle();
		        JFrame frame = new JFrame();
		        frame.setSize(500, 500);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.getContentPane().add(canvas).setBackground(Color.white);
		        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
		        frame.setResizable(false);
		        frame.setVisible(true);

			}
		
		public void paint(Graphics g)
			{
				
				int mx=1;
				int my=1;
				int x = 0;
				int y = 200;
				
				
				while(true)
					{
						x= x + mx;
						y = y + my;
						g.setColor(Color.black);
						g.fillRect(x,y,25,25);
						
						delay();
						
//						g.setColor(Color.white);
//	    				g.fillRect(x, y, 25, 25);
	    				
	    				delay();
	    				g.setColor(Color.black);
	    				g.drawLine(x+20, y+20, x+10, y);
	    				
	    				if(x == 490 || x == 0)
	    					{
	    						mx = -mx;
	    					}
	    				if(y == 465 || y == 0)
	    					{
	    						my = -my;
	    					}
					}
				
			}
		
		
		
		
			public void delay()
				{
		        try
						{
						Thread.sleep(10);
						} catch (InterruptedException e)
						{
						e.printStackTrace();
						}
				}
	}
