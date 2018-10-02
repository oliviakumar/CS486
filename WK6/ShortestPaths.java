import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.*;
import java.nio.file.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShortestPaths {

	public static String[] findShortestPaths() {
		return null;
	}
/*
	public static void readFile(String path) throws IOException {
		BufferedReader reader = Files.newBufferedReader(Paths.get(path));
		String line = null;
		String[] split = null;
		while ((line = reader.readLine()) != null) {
			line = line.replaceAll("(\"route_id\":\")", "");

			split = line.split("},");

			for (String s : split) {
				System.out.println(s);
				System.out.println("\t" + s.charAt(1) + ", " + s.charAt(3));
			}
			// System.out.println(Arrays.toString(split));
			// System.out.println();
			break;
			// line = line.replaceAll("\w[_]\w")
		}
		return;
	}
*/

/*
	A, C: 8
	A, E: 4
	A, F: 8
	C, B: 6
	D, B: 3
	D, C: 1
	D, E: 9
	G, H: 10
	H, A: 1
	H, F: 6
*/
	public static String regex() {
		String paths = "A, C: 8 A, E: 4 A, F: 8 C, B: 6 D, B: 3 D, C: 1 D, E: 9 G, H: 10 H, A: 1 H, F: 6";
		paths = paths.replaceAll("\\W", "");
		return paths;
	}

	public static void createPathsMatrix() {
		// String[] paths = new String[] {"A, C: 8 A, E: 4 A, F: 8 C, B: 6 D, B: 3 D, C: 1 D, E: 9 G, H: 10 H, A: 1 H, F: 6"};

		Map<String, Integer> map = new HashMap<>();
		int i;
		for (i = 0; i < 8; i++) {
			String[] letters = new String[] {"A", "B", "C", "D", "E", "F", "G", "H"};
			map.put(letters[i], i);
		}
		int[][] matrix = new int[8][];
		String[] split = regex().split("\\d");
		// System.out.println(map);
		// System.out.println(paths);
		// String[] split = null;
		// split = paths.split(",");
		// split = paths.split("\\s");//, "");
		System.out.println(Arrays.toString(split));

	// 	{
	// 	[0 0 8 0 4 8 0 7],
	// 	[10 0 3 7 0 0 8 1],
	// 	[0 6 0 0 0 7 10 2],
	// 	[0 3 1 0 9 8 10 0],
	// 	[8 0 1 0 0 3 4 0],
	// 	[2 9 2 9 0 0 4 0],
	// 	[9 0 0 8 11 7 0 10],
	// 	[1 8 7 8 0 6 0 0]
	}

	public static void main(String[] args) {
		// try {
			// readFile(args[0]);
		// } catch (IOException ioe) {
		// 	ioe.getMessage();
		// }
		createPathsMatrix();

		findShortestPaths();
	}

	// public static String[] returnRoutes() {
		// '[{"route_id":"A_C","from":"A","to":"C","duration":8},{"route_id":"A_E","from":"A","to":"E","duration":4},{"route_id":"A_F","from":"A","to":"F","duration":8},{"route_id":"A_H","from":"A","to":"H","duration":7},{"route_id":"B_A","from":"B","to":"A","duration":10},{"route_id":"B_C","from":"B","to":"C","duration":3},{"route_id":"B_D","from":"B","to":"D","duration":7},{"route_id":"B_G","from":"B","to":"G","duration":8},{"route_id":"B_H","from":"B","to":"H","duration":1},{"route_id":"C_B","from":"C","to":"B","duration":6},{"route_id":"C_F","from":"C","to":"F","duration":7},{"route_id":"C_G","from":"C","to":"G","duration":10},{"route_id":"C_H","from":"C","to":"H","duration":2},{"route_id":"D_B","from":"D","to":"B","duration":3},{"route_id":"D_C","from":"D","to":"C","duration":1},{"route_id":"D_E","from":"D","to":"E","duration":9},{"route_id":"D_F","from":"D","to":"F","duration":8},{"route_id":"D_G","from":"D","to":"G","duration":10},{"route_id":"E_A","from":"E","to":"A","duration":8},{"route_id":"E_C","from":"E","to":"C","duration":1},{"route_id":"E_F","from":"E","to":"F","duration":3},{"route_id":"E_G","from":"E","to":"G","duration":4},{"route_id":"F_A","from":"F","to":"A","duration":2},{"route_id":"F_B","from":"F","to":"B","duration":9},{ "route_id":"F_C","from":"F","to":"C","duration":2},{"route_id":"F_D","from":"F","to":"D","duration":9},{"route_id":"F_G","from":"F","to":"G","duration":4},{"route_id":"G_A","from":"G","to":"A","duration":9},{"route_id":"G_D","from":"G","to":"D","duration":8},{"route_id":"G_E","from":"G","to":"E","duration":11},{"route_id":"G_F","from":"G","to":"F","duration":7},{"route_id":"G_H","from":"G","to":"H","duration":10},{"route_id":"H_A","from":"H","to":"A","duration":1},{"route_id":"H_B","from":"H","to":"B","duration":8},{"route_id":"H_C","from":"H","to":"C","duration":7},{"route_id":"H_D","from":"H","to":"D","duration":8},{"route_id":"H_F","from":"H","to":"F","duration":6}];
	// }
}

// Return all possible paths from start node to destination node,
// sorted from shortest duration to longest.
// function findShortestPaths(start, destination) {
// 	return []
// }
// (here is a matrix representation - the columns are the "to" and the "from" is the rows so the route A->C, which has a duration of 8, is first row, third column)

// 0 0 8 0 4 8 0 7
// 10 0 3 7 0 0 8 1
// 0 6 0 0 0 7 10 2
// 0 3 1 0 9 8 10 0
// 8 0 1 0 0 3 4 0
// 2 9 2 9 0 0 4 0
// 9 0 0 8 11 7 0 10
// 1 8 7 8 0 6 0 0
