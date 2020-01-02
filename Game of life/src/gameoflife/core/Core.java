package gameoflife.core;

import java.util.Arrays;

public class Core {

	private static int maxItr = 9999;
	private static int curItr = 0;
	private static int mapSize = 6;
	private static char[][] map = new char[mapSize][mapSize];
	private static final char[][] deadMap = generateDeadMap();
	private static char[][][] story = new char[maxItr + 1][mapSize][mapSize];
	private final static char ALIVE = 'X';
	private final static char DEAD = '.';

	public static void main(String[] args) {
		generateMap();
		nextStage();
	}

	private static void generateMap() {
		for (int i = 0; i < mapSize; i++) {
			for (int j = 0; j < mapSize; j++) {
				map[i][j] = (Math.random() < 0.25) ? ALIVE : DEAD;
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		story[curItr] = map;
		curItr++;
	}

	private static char[][] generateDeadMap() {

		char[][] newMap = new char[mapSize][mapSize];

		for (int i = 0; i < mapSize; i++) {
			for (int j = 0; j < mapSize; j++) {
				newMap[i][j] = DEAD;
			}
		}

		return newMap;
	}

	private static void nextStage() {
		char[][] newMap = new char[mapSize][mapSize];
		for (int i = 0; i < mapSize; i++) {
			for (int j = 0; j < mapSize; j++) {
				int nbCount = 0;
				for (int x = -1; x <= 1; x++) {
					for (int y = -1; y <= 1; y++) {
						if (!(x == 0 && y == 0)) {
							try {
								if (map[i + x][j + y] == ALIVE) {
									nbCount++;
								}
							} catch (Exception e) {

							}
						}
					}
				}
				if (nbCount == 3) {
					newMap[i][j] = ALIVE;
				} else if (nbCount == 2) {
					if (map[i][j] == ALIVE) {
						newMap[i][j] = map[i][j];
					} else {
						newMap[i][j] = DEAD;
					}
				} else {
					newMap[i][j] = DEAD;
				}
			}
		}
		map = newMap;
		story[curItr] = map;
		System.out.println();
		for (int i = 0; i < mapSize; i++) {
			for (int j = 0; j < mapSize; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}

		if (Arrays.deepEquals(map, deadMap)) {
			printRes(true);
			return;
		} else if (checkStory()) {
			printRes(false);
		} else if (curItr <= maxItr - 1) {
			curItr++;
			nextStage();
		} else {
			printRes(false);
		}
	}

	private static boolean checkStory() {
		for (int i = 0; i < curItr; i++) {
			if (Arrays.deepEquals(story[i], map)) {
				return true;
			}
		}
		return false;
	}

	private static void printRes(final boolean genocide) {
		System.out.println("\n==========================");
		System.out.println("Game ended due: " + ((genocide) ? "out of people" : "time out"));
		System.out.println("Stage count: " + (curItr + 1));
	}

}
