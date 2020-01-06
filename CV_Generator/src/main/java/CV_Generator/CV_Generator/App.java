package CV_Generator.CV_Generator;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import com.itextpdf.text.DocumentException;


public class App {
	public static void main(String[] args) throws FileNotFoundException, DocumentException {

		CV cv = new CV("cv");
		Scanner s = new Scanner(System.in);
		ArrayList<String> info = new ArrayList<String>();
		
		System.out.println("Enter your full name");
		info.add(s.nextLine());
		System.out.println("Enter your title");
		info.add(s.nextLine());
		System.out.println("Enter your phone");
		info.add(s.nextLine());
		System.out.println("Enter your email");
		info.add(s.nextLine());
		System.out.println("About you");
		info.add(s.nextLine());
		System.out.println("Skill your skills.");
		System.out.println("Use \"space\" for new skill, use \"_\" for whitespace");
		info.add(s.nextLine());
		System.out.println("Your experience");
		System.out.println("Use \"_\" for new line");
		info.add(s.nextLine());
		System.out.println("Language skills");
		info.add(s.nextLine());
		
		cv.generate(info);
		cv.close();
		s.close();
	}

}
