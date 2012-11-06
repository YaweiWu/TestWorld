package com.my.test.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Hello world!
 * 
 */
public class ReadWrite {
	
	public static void main(String[] args) {
		
		File source = new File("temp.json");
		File dest = new File("temp2.json");
		BufferedReader reader = null;
		BufferedWriter bw= null;  
		try {
			
			System.out.println("以行为单位读取文件内容，一次读(并写)一整行：");
			reader = new BufferedReader(new FileReader(source));
			bw = new BufferedWriter(new FileWriter(dest));
			
			String tempString = null;
			int line = 1;
			// 一次读入一行，直到读入null为文件结束
			while ((tempString = reader.readLine()) != null) {
				// 显示行号
				System.out.println("line " + line + ": " + tempString);
				line++;
				
				bw.write(tempString);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e1) {
				}
			}
		}
	}
}
