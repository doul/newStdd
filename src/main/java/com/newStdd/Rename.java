package com.newStdd;

import java.io.File;
import java.text.ParseException;

import com.newStdd.util.DateUtil;
import com.newStdd.util.FileUtil;

public class Rename {
	public static void main(String[] args) throws ParseException {
		String directory= "c:\\data\\pic\\rename\\";
		File fileDirectory= new File(directory);
		File[] files= fileDirectory.listFiles();
		int count= 0;
		int countRename= 0;
		for (File file: files) {
			count++;
			long date= file.lastModified();
			while (true) {
				String newFileName=DateUtil.getDateStringZh(date);
				if (file.renameTo(new File(directory+ newFileName+ "."+ FileUtil.getFileExtension(file)))) {
					countRename++;
					break;
				} else {
					date+= 1000;
				}
			}
		}
		System.out.println("共【"+count +"】个文件");
		System.out.println("重命名【"+countRename +"】个文件");
	}
}