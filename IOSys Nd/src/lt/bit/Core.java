package lt.bit;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Core {

	public static void main(String[] args) {
		//uzd1();
		uzd2();
	}

	public static void uzd1() {
		List<Integer> chars = new ArrayList<Integer>();

		try (FileInputStream inF = new FileInputStream("file.txt")) {
			int c;
			while (((c = inF.read()) != -1)) {
				chars.add(c);
			}
		} catch (IOException e) {
			System.err.println("File not found");
		}

		Collections.sort(chars);

		for (int i = 0; i < chars.size(); i++) {
			System.out.println((char) chars.get(i).intValue());
		}
	}

	public static void uzd2() {
		Scanner scan = new Scanner(System.in);
		String from = scan.nextLine();
		String to = scan.nextLine();
		
		List<Character> chars = new ArrayList<Character>();
		
		try (FileInputStream inF = new FileInputStream(from+".txt")) {
			int c = inF.read();
			while (c != -1) {
				chars.add((char) c);
				c = inF.read();
			}
		} catch (IOException e) {
			System.err.println("File not found");
		}
		
		try(FileOutputStream ouF = new FileOutputStream(to+".txt")){
			for (int i = 0; i < chars.size(); i++) {
				ouF.write(chars.get(i));
			}
		}
		catch(IOException e) {
			System.out.println("Error " + e);
		}
	}

}
