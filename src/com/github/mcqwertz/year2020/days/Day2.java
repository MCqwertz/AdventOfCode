//created by MCqwertz


package com.github.mcqwertz.year2020.days;

import com.github.mcqwertz.util.TextFileUtils;

import java.io.FileNotFoundException;
import java.util.function.IntPredicate;

public class Day2 {
	public static void main(String[] args) throws FileNotFoundException {
		String[][] input = TextFileUtils.getInputDay2();
		System.out.println("Part 1: " + getFirstPart(input));
		System.out.println("Part 2: " + getSecondPart(input));
	}

	private static int getFirstPart(String[][] input) {
		int i = 0;
		for (String[] strings : input) {
			IntPredicate isSearched = arg -> arg == strings[2].charAt(0);
			int int0 = Integer.parseInt(strings[0]);
			int int1 = Integer.parseInt(strings[1]);
			int appearances = strings[3].chars().filter(isSearched).toArray().length;
			if(appearances <= int1 && appearances >= int0) {
				i++;
			}
		}
		return i;
	}

	private static int getSecondPart(String[][] input) {
		int i = 0;
		for (String[] strings : input) {
			int int0 = Integer.parseInt(strings[0]) - 1;
			int int1 = Integer.parseInt(strings[1]) - 1;
			char c = strings[2].charAt(0);
			if ((strings[3].charAt(int0) == c && strings[3].charAt(int1) != c) ||
					(strings[3].charAt(int0) != c && strings[3].charAt(int1) == c)) {
				i++;
			}
		}
		return i;
	}
}
