//created by MCqwertz


package com.github.mcqwertz.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class TextFileUtils {

	public static Supplier<IntStream> getNumbers(int day) throws FileNotFoundException {
		File file = new File("src/com/github/mcqwertz/year2020/input/Day" + day);
		Scanner scanner = new Scanner(file);
		ArrayList<String> arrayList = new ArrayList<>();
		while(scanner.hasNextLine()) {
			arrayList.add(scanner.nextLine());
		}
		return () -> arrayList.stream().mapToInt(Integer::parseInt);
	}

	public static String[][] getInputDay2() throws FileNotFoundException {
		File file = new File("src/com/github/mcqwertz/year2020/input/Day2");
		Scanner scanner = new Scanner(file);
		ArrayList<String> arrayList = new ArrayList<>();
		while(scanner.hasNextLine()) {
			arrayList.add(scanner.nextLine());
		}
		String[][] input = new String[arrayList.size()][4];
		for (int i = 0; i < arrayList.size(); i++) {
			String [] strings = arrayList.get(i).split("-")[1].replace(":", " ").split(" ");
			input[i] = new String[]{arrayList.get(i).split("-")[0], strings[0], strings[1], strings[3]};
		}
		return input;
	}
}
