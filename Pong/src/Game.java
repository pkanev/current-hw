import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable {

	private static final long serialVersionUID = 1L;
	
	JFrame frame; //Window of the game
	public final int WIDTH = 400; //width of the window
	public final int HEIGHT = WIDTH * 9 / 16; //height of the window
	public final Dimension windowSize = new Dimension(WIDTH, HEIGHT);
	public final String TITLE = "Pong InDev";

	BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_BGR);
	
	boolean gameRunning = false; //whether the game is running

	public void run() {
		while (gameRunning) { //if gameRunning == true
			tick();
			render();
		}
	}
	
	public synchronized void start(){
		gameRunning = true;
		new Thread(this).start();
	} //end start method
	
	public synchronized void stop(){
		gameRunning = false;
		System.exit(0);
	} //end start method
	

	public Game() {
		frame = new JFrame();
		
		setMinimumSize(windowSize);
		setPreferredSize(windowSize);
		setMaximumSize(windowSize);
		
		frame.add(this, BorderLayout.CENTER);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setTitle(TITLE);
	}
	
	public void tick(){
		
	}
	
	public void render(){
		BufferStrategy bs = getBufferStrategy();
		if (bs == null) {
			createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
		
		g.setColor(Color.RED);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		g.dispose();
		bs.show();
		
	}

	public static void main(String[] args) {
		Game game = new Game();
		game.start();
	}
}
