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
	        frame.getContentPane().add(canvas).setBackground(Color.gray);
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
			g.setColor(Color.green);
			g.fillOval(40, 40, 60, 30);
			g.setColor(Color.green);
			g.fillOval(15, 60, 110, 30);
			int yVaule = 500;
			for(int i = 500; i >= 0; i--)
				{
					yVaule-=1;
					g.setColor(Color.red);
					g.fillOval(i,yVaule, 20, 20);
					delay();
					
					g.setColor(Color.gray);
					g.fillOval(i, yVaule, 21, 21);
					if(yVaule == 100)
						{
							
							break;
						}
					
				}
			yVaule+=400;
			for(int b = 500; b >= 0; b--)
				{
					yVaule-=1;
					g.setColor(Color.red);
					g.fillOval(b ,yVaule, 20, 20);
					delay();
					
					g.setColor(Color.gray);
					g.fillOval(b, yVaule, 21, 21);
					if(yVaule == 100)
						{
							
							break;
						}
				}
			yVaule+=400;
			for(int c = 500; c >= 0; c--)
				{
					yVaule-=1;
					g.setColor(Color.red);
					g.fillOval(c, yVaule, 20, 20);
					delay();
					
					g.setColor(Color.gray);
					g.fillOval(c, yVaule, 21, 21);
					if(yVaule == 100)
						{
							
							break;
						}
				}
			g.setColor(Color.gray);
			g.fillOval(20, 40, 100, 100);
			
		for(int u = 0; u< 100; u++)
			{
			g.setColor(Color.red);
			g.fillOval(30, 40, u, u);
			delay1();
			g.setColor(Color.yellow);
			g.fillOval(70, 30, u+30, u+30);
			
			}
			g.setColor(Color.gray);
			g.fillOval(10, 10, 200, 200);
		for(int r = 0; r < 600; r++)
			{
				g.setColor(Color.green);
				g.fillOval(40, r, 60, 30);
				
				delay2();
				
				g.setColor(Color.green);
				g.fillOval(15, r+20, 110, 30);
				
				delay2();
				
				g.setColor(Color.gray);
				g.fillOval(40, r, 60, 30);
				
				delay2();
				
				g.setColor(Color.gray);
				g.fillOval(15, r+20, 110, 30);
				
				delay2();
				
				
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
	
		public void delay1()
			{
	        try
					{
					Thread.sleep(5);
					} catch (InterruptedException e)
					{
					e.printStackTrace();
					}
			}
		public void delay2()
			{
	        try
					{
					Thread.sleep(1);
					} catch (InterruptedException e)
					{
					e.printStackTrace();
					}
			}
	}
