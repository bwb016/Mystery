package game;

public class Map {

	public static int[][] createMap(int row, int column) {
		int[][] grid = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				grid[i][j] = 20;
			}

		}

		return grid;
	}

	public static int[][] Entrance1() {
		int[][] grid = { 
				{ 10, 3, 3, 3, 3, 3, 3, 3, 3, 3 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 }, };

		return grid;
	}

	public static int[][] Entrance2() {
		int[][] grid = { { 3, 3, 3, 3, 3, 3, 3, 3, 3, 11 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 }, };

		return grid;
	}

	public static int[][] Ballroom1() {
		int[][] grid = { { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 }, };

		return grid;
	}

	public static int[][] Ballroom2() {
		int[][] grid = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 }, };

		return grid;
	}

	public static int[][] Ballroom3() {
		int[][] grid = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 }, };

		return grid;
	}

	public static int[][] Ballroom4() {
		int[][] grid = { { 10, 3, 3, 3, 0, 0, 3, 3, 3, 3 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

		return grid;
	}

	public static int[][] Ballroom5() {
		int[][] grid = { { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, };

		return grid;
	}

	public static int[][] Ballroom6() {
		int[][] grid = { { 3, 3, 3, 3, 0, 0, 3, 3, 3, 11 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 } };

		return grid;
	}

	public static int[][] LivingRoom1() {
		int[][] grid = { { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 },
				{ 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 }, };

		return grid;
	}

	public static int[][] LivingRoom2() {
		int[][] grid = { { 0, 0, 0, 0, 0, 0, 0, 100, 100, 100 },
				{ 0, 0, 0, 0, 0, 0, 0, 100, 100, 100 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, };

		return grid;
	}

	public static int[][] LivingRoom3() {
		int[][] grid = { { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, };

		return grid;
	}

	public static int[][] LivingRoom4() {
		int[][] grid = { { 10, 3, 0, 0, 3, 3, 3, 3, 3, 3 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

		return grid;
	}

	public static int[][] LivingRoom5() {
		int[][] grid = { { 3, 3, 3, 3, 3, 0, 0, 100, 100, 100 },
				{ 0, 0, 0, 0, 0, 0, 0, 100, 100, 100 },
				{ 0, 0, 0, 0, 0, 0, 0, 100, 100, 100 },
				{ 0, 0, 0, 0, 0, 0, 0, 100, 100, 100 },
				{ 0, 0, 0, 0, 0, 0, 0, 100, 100, 100 },
				{ 0, 0, 0, 0, 0, 0, 0, 100, 100, 100 },
				{ 0, 0, 0, 0, 0, 0, 0, 100, 100, 100 },
				{ 0, 0, 0, 0, 0, 0, 0, 100, 100, 100 },
				{ 0, 0, 0, 0, 0, 0, 0, 100, 100, 100 },
				{ 0, 0, 0, 0, 0, 0, 0, 100, 100, 100 }, };

		return grid;
	}

	public static int[][] ArtGallery1() {
		int[][] grid = { { 10, 3, 0, 0, 3, 3, 3, 3, 3, 3 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 100, 100, 0, 0, 100, 100, 100, 100, 100, 100 }, };

		return grid;
	}

	public static int[][] ArtGallery2() {
		int[][] grid = { { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 100, 100, 0, 0, 100, 100, 100, 100, 100, 100 }, };

		return grid;
	}

	public static int[][] ArtGallery3() {
		int[][] grid = { { 10, 3, 3, 3, 0, 0, 3, 3, 3, 3 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 }, };

		return grid;
	}

	public static int[][] Library1() {
		int[][] grid = { { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 100, 100, 0, 0, 100, 100, 100, 100, 100, 100 }, };

		return grid;
	}

	public static int[][] Library2() {
		int[][] grid = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 }, };

		return grid;
	}

	public static int[][] Library3() {
		int[][] grid = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 }, };

		return grid;
	}

	public static int[][] Library4() {
		int[][] grid = { { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, };

		return grid;
	}

	public static int[][] Library5() {
		int[][] grid = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, };

		return grid;
	}

	public static int[][] Library6() {
		int[][] grid = { 
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 }, };
	
		return grid;
	}

	public static int[][] Library7() {
		int[][] grid = { { 10, 3, 3, 3, 3, 3, 3, 3, 3, 3 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, };

		return grid;
	}

	public static int[][] Library8() {
		int[][] grid = { { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, };

		return grid;
	}

	public static int[][] Library9() {
		int[][] grid = { { 3, 3, 3, 3, 3, 3, 3, 3, 3, 11 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 }, };

		return grid;
	}

	public static int[][] Diningroom1() {

		int[][] grid = { { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 100, 100, 100, 100, 0, 0, 100, 100, 100, 100 }, };

		return grid;
	}

	public static int[][] Diningroom2() {

		int[][] grid = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 }, };

		return grid;
	}

	public static int[][] Diningroom3() {

		int[][] grid = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 100, 100, 100, 100, 0, 0, 100, 100, 100, 100 }, };

		return grid;
	}

	public static int[][] Diningroom4() {

		int[][] grid = { { 10, 3, 3, 3, 0, 0, 3, 3, 3, 3 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

		return grid;
	}

	public static int[][] Diningroom5() {

		int[][] grid = { { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, };

		return grid;
	}

	public static int[][] Diningroom6() {

		int[][] grid = { { 3, 3, 3, 3, 0, 0, 3, 3, 3, 11 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 } };

		return grid;
	}
	
}