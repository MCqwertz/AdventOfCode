//created by MCqwertz


package com.github.mcqwertz.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileUtils {
	public static Scanner getScanner(int day) throws FileNotFoundException {
		File file = new File("src/com/github/mcqwertz/year2020/input/Day" + day);
		return new Scanner(file);
	}
}
