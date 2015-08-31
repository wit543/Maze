import java.util.Arrays;
import java.util.Observable;
import java.util.concurrent.CountDownLatch;

public class MazeRunner extends Observable implements Runnable {
	Maze maze;
	MazeElement[][] mazeMap;
	String[] instruction;
	int move = 0;
	int x = 0;
	int y = 1;
	boolean finish = false;
	boolean wrong = false;
	public MazeRunner(Maze maze, String[] instruction,int x,int y) {
		this.maze = maze;
		this.mazeMap = maze.getMaze();
		this.instruction = instruction;
		this.x = x;
		this.y = y;
		addObserver(new MazeRunnerObserver());
		addObserver(new MazeRunnerObserverHistory());
	}

	public void setMaze(Maze maze) {
		this.maze = maze;
	}

	public void setInstruction(String[] instruction) {
		this.instruction = instruction;
	}

	public void setStartPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Maze getMaze() {
		return maze;
	}

	public boolean isFinish() {
		return this.finish;
	}
	public boolean isWrong(){
		return this.wrong;
	}
	@Override
	public void run() {
		// System.out.println("+++"+x+" "+y+" "+move);
		// for(int i = 0;i<3;i++){
		// for(int j = 0;j<7;j++){
		// System.out.print(mazeMap[i][j]);
		// }
		// System.out.println();
		// }
		// System.out.println(mazeMap[y][x]);
		try {
			// System.out.println(instruction[move] + " " + mazeMap[y][x]);
			String nextMove = instruction[move];
			if (nextMove.equals("up")) {
				int posX =x;
				int posY =y - 1;
				if (mazeMap[y - 1][x].getProperty().equals("walkable")) {
					y--;
				} else if (checkFinish(posY, posX)) {

				}
				else if(checkWrong(posY, posX)){
					
				}
			} else if (nextMove.equals("down")) {
				int posX =x;
				int posY =y + 1;
				if (mazeMap[posY][posX].getProperty().equals("walkable")) {
					y++;
				} else if (checkFinish(posY, posX)) {

				}
				else if(checkWrong(posY, posX)){
					
				}
				
			} else if (nextMove.equals("right")) {
				int posX =x+1;
				int posY =y;
				if (mazeMap[posY][posX].getProperty().equals("walkable")) {
					x++;
				} else if (checkFinish(posY, posX)) {
					
				}
				else if(checkWrong(posY, posX)){
					
				}
			} else if (nextMove.equals("left")) {
				int posX =x-1;
				int posY =y;
				if (mazeMap[posY][posX].getProperty().equals("walkable")) {
					x--;
				} else if (checkFinish(posY, posX)) {

				}
				else if(checkWrong(posY, posX)){
					
				}
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException");
		}
		move++;
		// System.out.println(x + " " + y + " " + move);
		setChanged();
		notifyObservers(this);
	}
	
	private boolean checkWrong(int posY, int posX){
		try {
			if (mazeMap[posY][posX].getProperty().equals("wall")) {
				this.wrong = true;
				return true;
			}
			return false;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.print("index out of Bound");
		}
		return false;
	}
	private boolean checkFinish(int posY, int posX) {
		try {
			if (mazeMap[posY][posX].getProperty().equals("finish")) {
				this.finish = true;
				return true;
			}
			return false;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.print("index out of Bound");
		}
		return false;
	}
}
