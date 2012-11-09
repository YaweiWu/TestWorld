package com.my.test.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Hello world!
 * 
 */
public class Dir {

	private final static String filePath = "/home/wuyw/notification/";

	public static void main(String[] args) {

		File dir = new File(filePath + "abc");

		System.out.println("exists:" + dir.exists());

		if (!dir.exists()) {
			System.out.println(dir.mkdir());
		}

		int num = dir.list().length;
		File f = new File(dir, getSequence(num) + "." + "newFile");
		writeToFile("aaaa", f);

	}

	private static void writeToFile(String content, File file) {

		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e1) {
				}
			}
		}
	}
	
	/**
	 * 根据当前已有文件数返回下一文件名前缀序列号，“01”..."09"."10"."11"...
	 * @param current
	 * @return
	 */
	private static String getSequence(int current) {

		return (current + 1) < 10 ? "0" + (current + 1) : String
				.valueOf((current + 1));
	}

}
