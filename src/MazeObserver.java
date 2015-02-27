import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.util.Arrays;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.GapContent;


public class MazeObserver extends JFrame implements Observer,Runnable{
	JLabel topLabel = new JLabel();
	public MazeObserver() {
		init();
	}
	private void init(){
		setSize(200,200);
		setAlwaysOnTop(true);
		add(topLabel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof Maze){
			Maze maze = (Maze)o;
			topLabel.setLayout(new GridLayout(maze.getMaze().length,maze.getMaze()[0].length));
			for(int i=0;i<maze.getMaze().length;i++){
				for(int j =0;j<maze.getMaze()[0].length;j++){
					if(maze.getMaze()[i][j].getProperty()=="wall"){
						JLabel wall = new JLabel();
						wall.setBackground(new Color(200,200,200));
						wall.setOpaque(true);
						wall.setHorizontalAlignment(0);
						wall.setText("WALL");
						topLabel.add(wall);
					}
					if(maze.getMaze()[i][j].getProperty()=="walkable"){
						JLabel walkable = new JLabel();
						walkable.setBackground(new Color(255,255,255));
						walkable.setOpaque(true);
						walkable.setHorizontalAlignment(0);
						topLabel.add(walkable);
					}
					if(maze.getMaze()[i][j].getProperty()=="start"){
						JLabel start = new JLabel();
						start.setBackground(new Color(0,255,255));
						start.setOpaque(true);
						topLabel.add(start);
					}
					if(maze.getMaze()[i][j].getProperty()=="finish"){
						JLabel finish = new JLabel();
						finish.setBackground(new Color (255,0,0));
						finish.setOpaque(true);
						topLabel.add(finish);
					}
				}
			}
			run();
			System.out.println(topLabel.getComponentCount());
			System.out.println(Arrays.deepToString(maze.getMaze()));
		}
			
		
	}
	@Override
	public void run() {
		setVisible(true);
		
	}

}
