package com.lockedme;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		final String ROOT_DIRECTORY_PATH = "C:/Users/Lenovo/Desktop/java";
		LockedMeBO bo = new LockedMeBO();
		Scanner sc = new Scanner(System.in);
		String fileName;
		System.out.println("Welcome to LockedMe.com");

		System.out.println("Developer Info");
		System.out.println("Mr. Ravi-Developer");
		int ch, ch1;
		do {
			System.out.println("1. List the Files in Ascending order");
			System.out.println("2.Edit");
			System.out.println("3.exit");
			System.out.println("Enter the choice");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				bo.displayFilesInAscendingOrder(ROOT_DIRECTORY_PATH);
				break;
			case 2:
				do {
					System.out.println("1.Add File to the Directory");
					System.out.println("2. Remove file from the Dierctory");
					System.out.println("3.Searching a file in Directory");
					System.out.println("4.Enter your choice");
					ch1 = sc.nextInt();
					switch (ch1) {
					case 1:
						fileName = readFileName(sc);
						bo.addFile(fileName, ROOT_DIRECTORY_PATH);
						break;
					case 2:
						fileName = readFileName(sc);
						bo.deleteFile(fileName, ROOT_DIRECTORY_PATH);
						break;
					case 3:
						fileName = readFileName(sc);
						bo.searchFile(fileName, ROOT_DIRECTORY_PATH);
						break;
					}
				} while (ch1 <= 3);
				break;
			}
		} while (ch < 3);
	}

	private static String readFileName(Scanner sc) {
		System.out.println("enter the file name to add");
		sc.nextLine();
		String fileName = sc.nextLine();
		return fileName;
	}

}
