
public class Main {
	public static void main(String[] args) {
		String[][] input = new String [3][5];
		Reader reader = new Reader();
		input[0] = reader.stringToArray("#######");
		input[1] = reader.stringToArray("s     #");
		input[2] = reader.stringToArray("##### f");
		Maze maze = new Maze(input);
		System.out.println(maze.toString());
		Solver solver = new Solver();
		String[] instruction = new String[]{"right","right","left","right","right","down","right"};
		Tester test = new Tester(maze, instruction);
		test.run();
	}
}
