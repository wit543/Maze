public class Main {
	static String[][] map = {
			{ "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*",
					"*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*",
					"*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*",
					"*", "*", "*", "*", "*", "*", "*", "*" },
			{ "*", "*", " ", " ", " ", " ", " ", "*", " ", " ", "*", " ", "*",
					" ", "*", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
					"*", " ", "*", "*", " ", " ", " ", "*", " ", " ", " ", " ",
					"*", " ", " ", "*", " ", " ", " ", "f" },
			{ "*", " ", " ", "*", " ", "*", " ", " ", "*", " ", " ", " ", " ",
					" ", " ", "*", "*", " ", "*", "*", "*", " ", "*", " ", "*",
					" ", " ", " ", " ", " ", "*", " ", "*", " ", "*", "*", " ",
					" ", " ", "*", " ", " ", "*", " ", "*" },
			{ "*", " ", "*", "*", " ", " ", "*", " ", "*", "*", " ", "*", "*",
					"*", " ", " ", " ", "*", " ", " ", " ", " ", "*", " ", "*",
					" ", "*", "*", " ", "*", " ", "*", " ", " ", "*", " ", "*",
					" ", "*", " ", " ", "*", "*", " ", "*" },
			{ "*", " ", " ", " ", "*", " ", "*", " ", " ", "*", " ", "*", " ",
					" ", "*", "*", " ", "*", " ", "*", " ", "*", " ", " ", "*",
					" ", "*", " ", " ", " ", " ", "*", " ", "*", " ", " ", "*",
					" ", " ", " ", "*", "*", " ", " ", "*" },
			{ "*", "*", " ", "*", "*", " ", " ", "*", " ", " ", " ", "*", "*",
					" ", " ", " ", " ", "*", " ", " ", "*", " ", " ", "*", " ",
					" ", " ", "*", " ", "*", " ", "*", " ", " ", " ", "*", " ",
					"*", "*", "*", " ", " ", " ", "*", "*" },
			{ "*", " ", " ", " ", " ", "*", " ", " ", "*", " ", "*", " ", " ",
					" ", "*", "*", "*", " ", "*", " ", " ", "*", "*", " ", " ",
					"*", " ", "*", " ", "*", "*", " ", "*", "*", " ", "*", " ",
					" ", " ", "*", " ", "*", " ", "*", "*" },
			{ "*", " ", "*", " ", "*", " ", " ", "*", "*", "*", " ", " ", "*",
					"*", " ", " ", " ", " ", " ", "*", " ", " ", "*", " ", "*",
					" ", "*", "*", " ", " ", " ", " ", "*", "*", " ", " ", "*",
					" ", "*", " ", " ", "*", " ", " ", "*" },
			{ "*", "*", " ", "*", " ", " ", "*", " ", "*", " ", " ", "*", " ",
					" ", " ", "*", "*", "*", " ", "*", "*", " ", " ", " ", "*",
					" ", " ", " ", "*", " ", "*", " ", " ", " ", " ", "*", "*",
					" ", " ", "*", " ", "*", " ", "*", "*" },
			{ "*", " ", " ", " ", " ", "*", " ", " ", " ", " ", "*", " ", "*",
					"*", " ", " ", " ", "*", " ", " ", "*", "*", "*", " ", "*",
					" ", "*", " ", "*", "*", " ", " ", "*", " ", "*", " ", " ",
					" ", "*", " ", " ", "*", " ", " ", "*" },
			{ "*", " ", "*", " ", "*", " ", " ", "*", "*", "*", " ", " ", " ",
					"*", " ", "*", " ", " ", "*", " ", " ", " ", " ", "*", " ",
					" ", "*", " ", " ", " ", "*", "*", " ", " ", " ", " ", "*",
					" ", "*", " ", "*", "*", "*", " ", "*" },
			{ "*", " ", "*", " ", "*", " ", "*", " ", " ", " ", " ", "*", " ",
					"*", "*", " ", " ", "*", " ", "*", " ", "*", " ", " ", " ",
					"*", "*", "*", "*", " ", " ", " ", "*", "*", " ", "*", " ",
					" ", "*", " ", " ", "*", " ", " ", "*" },
			{ "*", " ", "*", "*", " ", " ", " ", " ", "*", " ", "*", " ", " ",
					" ", " ", " ", "*", " ", " ", " ", "*", " ", "*", "*", "*",
					" ", "*", " ", "*", "*", "*", " ", " ", "*", "*", " ", "*",
					"*", " ", " ", "*", " ", " ", "*", "*" },
			{ "*", " ", " ", " ", "*", "*", " ", "*", " ", "*", " ", " ", "*",
					"*", "*", "*", "*", "*", " ", "*", " ", " ", " ", " ", "*",
					" ", " ", " ", " ", " ", " ", "*", " ", " ", " ", " ", " ",
					"*", " ", "*", " ", " ", "*", "*", "*" },
			{ "*", " ", "*", " ", " ", " ", "*", " ", " ", " ", "*", "*", " ",
					" ", " ", " ", "*", "*", " ", " ", " ", "*", "*", " ", "*",
					" ", "*", "*", "*", "*", " ", "*", "*", "*", " ", "*", " ",
					" ", " ", "*", "*", " ", " ", "*", "*" },
			{ "*", " ", "*", "*", "*", " ", "*", " ", "*", " ", " ", " ", " ",
					"*", " ", "*", " ", " ", " ", "*", "*", " ", " ", " ", "*",
					" ", "*", " ", " ", "*", " ", " ", " ", " ", "*", " ", "*",
					"*", "*", " ", " ", "*", " ", " ", "*" },
			{ "*", "*", " ", " ", " ", " ", "*", " ", "*", "*", "*", " ", "*",
					"*", " ", "*", " ", "*", "*", " ", "*", " ", "*", "*", " ",
					" ", "*", " ", "*", "*", "*", "*", " ", "*", " ", " ", " ",
					" ", " ", " ", "*", "*", "*", " ", "*" },
			{ "*", " ", " ", "*", "*", "*", " ", "*", " ", " ", " ", " ", "*",
					" ", " ", "*", " ", " ", " ", " ", "*", " ", " ", "*", " ",
					"*", " ", " ", " ", "*", " ", "*", " ", " ", " ", "*", "*",
					" ", "*", " ", " ", "*", " ", " ", "*" },
			{ "*", "*", " ", "*", " ", " ", " ", " ", " ", "*", "*", " ", " ",
					"*", " ", "*", "*", "*", " ", "*", " ", "*", " ", "*", " ",
					" ", "*", "*", " ", " ", " ", " ", "*", " ", "*", " ", " ",
					"*", " ", "*", " ", " ", " ", "*", "*" },
			{ "*", " ", " ", "*", "*", " ", "*", " ", "*", " ", " ", "*", " ",
					" ", "*", " ", " ", " ", " ", "*", " ", "*", " ", " ", "*",
					" ", "*", " ", "*", " ", "*", "*", " ", "*", " ", "*", " ",
					" ", " ", " ", "*", "*", "*", " ", "*" },
			{ "*", " ", "*", " ", " ", " ", "*", "*", " ", " ", "*", "*", "*",
					" ", "*", " ", "*", "*", "*", " ", " ", " ", "*", " ", "*",
					" ", " ", " ", "*", " ", " ", " ", " ", " ", " ", " ", "*",
					" ", "*", " ", "*", " ", " ", " ", "*" },
			{ "*", " ", " ", "*", "*", " ", " ", " ", "*", " ", " ", "*", " ",
					" ", "*", " ", "*", " ", " ", " ", "*", " ", "*", " ", " ",
					"*", "*", " ", " ", "*", " ", "*", "*", " ", "*", " ", " ",
					" ", "*", " ", " ", "*", "*", " ", "*" },
			{ "*", "*", " ", " ", " ", "*", "*", " ", " ", "*", " ", " ", " ",
					"*", "*", " ", "*", " ", "*", " ", " ", "*", " ", "*", " ",
					" ", "*", "*", " ", " ", "*", " ", " ", " ", "*", "*", "*",
					"*", " ", "*", " ", "*", "*", " ", "*" },
			{ "*", " ", " ", "*", " ", " ", "*", "*", " ", " ", "*", " ", "*",
					"*", " ", " ", "*", " ", " ", "*", " ", " ", " ", " ", "*",
					" ", " ", "*", "*", " ", " ", "*", " ", "*", " ", " ", " ",
					" ", " ", "*", " ", " ", " ", " ", "*" },
			{ "*", " ", "*", " ", "*", " ", " ", "*", "*", " ", "*", "*", " ",
					" ", " ", "*", " ", "*", " ", "*", " ", "*", " ", "*", "*",
					"*", " ", " ", " ", " ", "*", " ", " ", " ", "*", " ", "*",
					"*", " ", " ", "*", "*", " ", "*", "*" },
			{ "*", " ", " ", " ", " ", "*", " ", " ", "*", " ", " ", " ", "*",
					"*", " ", "*", " ", " ", "*", " ", " ", "*", " ", " ", "*",
					" ", "*", "*", " ", "*", " ", "*", " ", "*", " ", " ", " ",
					" ", "*", " ", " ", "*", " ", " ", "*" },
			{ "*", " ", "*", "*", "*", "*", "*", " ", "*", " ", "*", " ", " ",
					" ", " ", " ", "*", " ", " ", " ", "*", " ", " ", "*", " ",
					" ", " ", " ", "*", " ", " ", " ", " ", "*", " ", "*", " ",
					"*", " ", "*", " ", " ", "*", " ", "*" },
			{ "*", "*", " ", " ", " ", "*", "*", " ", " ", "*", " ", " ", "*",
					" ", "*", " ", " ", " ", "*", "*", " ", "*", " ", "*", " ",
					"*", "*", " ", "*", " ", "*", "*", "*", "*", " ", "*", " ",
					" ", " ", " ", "*", "*", "*", " ", "*" },
			{ "*", " ", " ", "*", " ", " ", " ", " ", "*", " ", " ", "*", " ",
					" ", " ", "*", " ", "*", " ", " ", " ", " ", " ", " ", " ",
					"*", " ", " ", " ", " ", "*", " ", " ", " ", " ", " ", "*",
					" ", "*", " ", " ", " ", " ", " ", "*" },
			{ "*", "s", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*",
					"*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*",
					"*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*",
					"*", "*", "*", "*", "*", "*", "*", "*" } };

	public static void main(String[] args) {
		String[][] input = new String[3][5];
		Reader reader = new Reader();
		input[0] = reader.stringToArray("#######");
		input[1] = reader.stringToArray("      #");
		input[2] = reader.stringToArray("#s### f");
		Maze maze = new Maze(map);
		System.out.println(maze.toString());
		Solver solver = new Solver();
		String[] instruction = new String[] { "right", "up", "right", "right", "down", "right", "right", "right", "up", "up", "up", "left", "up", "left", "up", "left", "up", "left", "left", "up", "left", "up", "up", "right", "up", "up", "up", "right", "right", "right", "up", "up", "left", "left", "up", "left", "left", "up", "up", "up", "up", "right", "right", "right", "up", "right", "up", "right", "up", "up", "left", "up", "up", "left", "up", "up", "right", "right", "down", "right", "down", "down", "right", "down", "right", "right", "up", "up", "up", "right", "right", "right", "right", "down", "right", "right", "down", "down", "left", "left", "left", "down", "left", "left", "down", "left", "down", "left", "down", "left", "left", "left", "down", "left", "down", "down", "right", "right", "up", "right", "right", "right", "up", "right", "right", "down", "down", "right", "right", "right", "up", "right", "up", "up", "left", "left", "up", "up", "right", "right", "right", "right", "down", "down", "right", "down", "right", "right", "right", "down", "right", "right", "up", "right", "up", "up", "right", "right", "down", "down", "right", "right", "down", "right", "right", "down", "right", "down", "right", "right", "right", "right", "down", "right", "right", "up", "up", "right", "up", "up", "up", "right", "up", "up", "up", "up", "right", "right", "up", "right", "up", "up", "up", "right" };
		
		
		Tester test = new Tester(maze, instruction,1,28);
		test.run();
	}
}
