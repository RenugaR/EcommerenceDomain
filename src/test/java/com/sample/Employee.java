package com.sample;

import java.io.File;
import java.io.IOException;

public class Employee {
	public static void main(String[] args) throws IOException  {
		// Folder

		File f = new File("D:\\Java\\FileOperationdata.txt");
		boolean createNewFile = f.createNewFile();
		System.out.println(createNewFile);

		// length
		long length = f.length();
		System.out.println(length);

		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.isHidden());

		boolean file = f.isFile();
		System.out.println(file);

		boolean absolute = f.isAbsolute();
		System.out.println(absolute);

		String absolutePath = f.getAbsolutePath();
		System.out.println(absolutePath);

		String name = f.getName();
		System.out.println(name);
	}
}
