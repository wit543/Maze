import java.util.Observable;


public class Maze extends Observable {
	private MazeElement[][] maze;
	public Maze(String[][] input){
		addObserver(new MazeObserver());
		maze = new MazeElement[input.length][input[0].length];
		for(int i=0;i<input.length;i++)
			for(int j =0;j<input[0].length;j++){
				if(input[i][j].equals("*")||input[i][j].equals("#")){
					maze[i][j]= new Wall();
				}
				else if(input[i][j].equals("s")){
					maze[i][j]= new Start();
				}
				else if(input[i][j].equals("f")){
					maze[i][j]= new Finish();
				}
				else{
					maze[i][j]=new WalkWay();
				}
			}
	}
	public MazeElement[][] getMaze(){
		return maze;
	}
	public String toString(){
		String out="";
		for(int i=0;i<maze.length;i++){
			for(int j =0;j<maze[0].length;j++){
				out+=maze[i][j].toString();
			}
			out+="\r\n";
		}
		setChanged();
		notifyObservers(this);
		return out;
	}
}
