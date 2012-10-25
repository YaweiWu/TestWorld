package com.my.test.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileNameList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String dirPath = "/home/";

		List<String> fileNameList = getFileList(dirPath);

		for (String fileName : fileNameList) {
			System.out.println(fileName);
		}

	}

	public static List<String> getFileList(String dirPath) {

		if (null == dirPath)
			return null;

		File dir = new File(dirPath);

		if (!dir.exists() || !dir.isDirectory())
			return null;

		List<String> fileNameList = new ArrayList<String>();

		for (String fileName : dir.list()) {
			fileNameList.add(fileName);
		}

		Collections.sort(fileNameList);

		return fileNameList;
	}

}
