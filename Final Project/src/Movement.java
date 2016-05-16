import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Movement extends JComponent implements KeyListener, Runnable
	{
		private boolean upPressed, downPressed;
	
	
		

			public void keyPressed(KeyEvent ke)
			{
				if(ke.getKeyCode() == KeyEvent.VK_LEFT)
					{
					upPressed = true;
					}
				else if(ke.getKeyCode() == KeyEvent.VK_RIGHT)
					{
					downPressed = true;
					}
			}

			public void keyReleased(KeyEvent ke)
			{
				if(ke.getKeyCode() == KeyEvent.VK_LEFT)
					{
					upPressed = false;
					}
				else if(ke.getKeyCode() == KeyEvent.VK_RIGHT)
					{
					downPressed = false;
					}
				
			}
			public void keyTyped(KeyEvent ke)
				{
				}

			@Override
			public void run()
				{
					while(true)
						{
							try
							{
								Thread.sleep(20);
							}
							catch(Exception ex)
							{
							}
							requestFocus();
							repaint();
						}
					
				}
	}
