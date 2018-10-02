import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.*;
import java.nio.file.*;

public class JSONShortestPaths {

/* TODO: would this be considered dynamic programming? */
	// Map<String, Set<String>>

	// public static void addPath(String[] split) {

	// }

	public static void DFS(int[][] matrix) {//, int source, int destination) {
		// for (int i : matrix)

			// for (int j : i) {
				// if (!visted[j]) {
					// DFS()
				// }
			// }
		// }

		// return matrix;
		// boolean[] visited = new boolean[matrix.length];
		// Arrays.fill(visited, false);

		// visited[]
		// for (int i[] : matrix) {
		// 	for (int j : i) {
		// 		System.out.print(j + " ");
		// 	}
		// 	System.out.println();
		// }
	}

	private static void DFS(int[][] matrix, int source, int destination) {
	// private static List<Integer> DFS(int[][] matrix, int source, int destination) {
		boolean[] visited = new boolean[matrix.length];
		Arrays.fill(visited, false);
		List<Integer> paths = new ArrayList<>();




		for (int i[] : matrix) {
			for (int j : i) {
				// System.out.print(j + "\t");
			}
			System.out.println();
		}


		for (int i: matrix[source-1]) {
			if (source == destination) {
				// paths.add(0);
				// matrix[source-1][i] = 0;
				System.out.println("distance: " + 0);
				break;
			}
			if (i != -1) {
				System.out.print(destination + "\t");
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static int[][] readFile(String path) throws IOException {
		BufferedReader reader = Files.newBufferedReader(Paths.get(path));
		String line = null;
		String[] split = null;
		int source, dest, distance;

		// int[][] matrix = new int[8][];
		int[][] matrix = new int[8][8];

		for (int i[]: matrix) {
			Arrays.fill(i, -1);
		}

/* TODO: fill in 0's in diag */

		while ((line = reader.readLine()) != null) {
			split = line.split(",");
			// System.out.println(Arrays.toString(split));
			// matrix[split[0]][split[1]] = Integer.parseInt(split[2]);
			matrix[Integer.parseInt(split[0]) -1][ Integer.parseInt(split[1]) -1] = Integer.parseInt(split[2]);
		}
		return matrix;
	}

	public static void main(String[] args) {
		int[][] matrix;
		try {
			 matrix = readFile(args[0]);

			for (int i[] : matrix) {
				for (int j : i) {
					// if (i == j) {
						// matrix[j][j] = 0;
					// }
					// System.out.print(j + " ");
					System.out.printf("%2s ", j);

				}
				System.out.println();
			}
			DFS(matrix, 1, 4);
			// DFS(matrix, 1, 1);

		} catch (IOException ioe) {

		}
		
	}

}