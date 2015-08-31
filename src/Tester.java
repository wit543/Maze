
public class Tester implements Runnable{
	Maze maze;
	String[] instruction;
	MazeRunner runner;
	int speed =250;
	public Tester(Maze maze,String[] instruction,int x,int y) {
		this.maze = maze;
		this.instruction=instruction;
		this.runner=new MazeRunner(maze, instruction, x, y);
	}
	public void setSpeed(int speed){
		this.speed=speed;
	}
	@Override
	public void run() {
		for(int i =0;i<instruction.length;i++){
			runner.run();
			try {
				Thread.sleep(speed);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
