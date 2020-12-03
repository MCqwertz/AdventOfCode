//created by MCqwertz


package com.github.mcqwertz.year2020.days;

import com.github.mcqwertz.util.TextFileUtils;

import java.io.FileNotFoundException;

public class Day3 {
	public static void main(String[] args) throws FileNotFoundException {
		char[][] grid = TextFileUtils.getInputDay3();
		System.out.println("Part 1: " + getTrees(grid, 3, 1));
		System.out.println("Part 2: " + getSecondResult(grid));
	}


	private static long getSecondResult(char[][] grid) {
		return Math.multiplyFull(getTrees(grid, 1, 1), getTrees(grid, 3, 1) * getTrees(grid, 5, 1) *
				getTrees(grid, 7, 1) * getTrees(grid, 1, 2));

	}

	private static int getTrees(char[][] grid, int right, int down) {
		int trees = 0;
		int coulomb = 0;
		for (int i = 0; i < grid.length; i = i + down) {
			coulomb = coulomb + right;
			if (grid[i][coulomb % grid[i].length] == '#') {
				trees++;
			}
		}
		System.out.println(trees);
		return trees;
	}
}
