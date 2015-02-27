import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.util.Arrays;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.text.GapContent;


public class MazeRunnerObserverHistory extends JFrame implements Observer,Runnable{
	JLabel topLabel = new JLabel();
	JPanel panel;
	JScrollPane pane;
	int width =0;
	int height = 0;
	public MazeRunnerObserverHistory() {
		init();
	}
	private void init(){
		setSize(500,267);
		setLocation(0,467);
		setAlwaysOnTop(true);
		topLabel.setLayout(new GridLayout(1,1,5,5));
		topLabel.setSize(600,200);
		topLabel.setPreferredSize(new Dimension(width,height));
		panel = new JPanel();
		panel.setSize(600,200);
		panel.setPreferredSize(new Dimension(width,height));
		panel.setVisible(true);
		panel.add(topLabel);
		pane = new JScrollPane(panel);
		add(pane);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof MazeRunner){
			MazeRunner m = (MazeRunner) o;
			Maze maze = m.getMaze();
			int width = maze.getMaze()[0].length * 40;
			int height = maze.getMaze().length * 40;
			JLabel topLabel = new JLabel();
			topLabel.setSize(width, height);
			topLabel.setBackground(new Color(0, 0, 0));
			topLabel.setOpaque(true);
			if (m.isFinish()) {
				
				JLabel finishLabel = new JLabel();
				finishLabel.setPreferredSize(new Dimension(width,height));
				finishLabel.setBackground(new Color(0,255,128));
				finishLabel.setOpaque(true);
				finishLabel.setSize(width,height);
				finishLabel.setText("Fnish");
				finishLabel.setFont(new Font("helvetica",0,32));
				finishLabel.setHorizontalAlignment(0);
				this.topLabel.add(finishLabel,0);
			}
			else if(m.isWrong()){
				JLabel WorngLabel = new JLabel();
				WorngLabel.setPreferredSize(new Dimension(width,height));
				WorngLabel.setBackground(new Color(255,100,100));
				WorngLabel.setOpaque(true);
				WorngLabel.setSize(width,height);
				WorngLabel.setText("WORNG");
				WorngLabel.setFont(new Font("helvetica",0,32));
				WorngLabel.setHorizontalAlignment(0);
				this.panel.add(WorngLabel);
			}
			else {
				topLabel.setLayout(new GridLayout(maze.getMaze().length, maze
						.getMaze()[0].length));
				for (int i = 0; i < maze.getMaze().length; i++) {
					for (int j = 0; j < maze.getMaze()[0].length; j++) {
						if (m.getX() == j && m.getY() == i) {
							JLabel runner = new JLabel();
							runner.setBackground(new Color(255, 255, 0));
							runner.setOpaque(true);
							topLabel.add(runner);
						} else if (maze.getMaze()[i][j].getProperty() == "wall") {
							JLabel wall = new JLabel();
							wall.setBackground(new Color(200, 200, 200));
							wall.setOpaque(true);
							wall.setHorizontalAlignment(0);
							wall.setText("WALL");
							topLabel.add(wall);
						} else if (maze.getMaze()[i][j].getProperty() == "walkable") {
							JLabel walkable = new JLabel();
							walkable.setBackground(new Color(255, 255, 255));
							walkable.setOpaque(true);
							walkable.setHorizontalAlignment(0);
							topLabel.add(walkable);
						} else if (maze.getMaze()[i][j].getProperty() == "start") {
							JLabel start = new JLabel();
							start.setBackground(new Color(0, 255, 255));
							start.setOpaque(true);
							topLabel.add(start);
						} else if (maze.getMaze()[i][j].getProperty() == "finish") {
							JLabel finish = new JLabel();
							finish.setBackground(new Color(255, 0, 0));
							finish.setOpaque(true);
							topLabel.add(finish);
						}
					}

				}
				this.topLabel.add(topLabel, 0);
			}
			
			this.topLabel.add(topLabel);
			this.width+=width;
			this.height=height;
			this.topLabel.setPreferredSize(new Dimension(this.width,this.height));
			this.panel.setPreferredSize(new Dimension(this.width,this.height));
			run();
		}
	}
	@Override
	public void run() {
		setVisible(true);
	}

}
