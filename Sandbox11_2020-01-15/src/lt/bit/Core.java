package lt.bit;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Core {

	public static void main(String[] args) throws IOException  {

//		FileInputStream f = new FileInputStream("a.txt");
//		
//		int b;
//		
//		while((b = f.read()) != -1) {
//			System.out.print((char) b);
//		}
//		f.close();
//		System.out.println();
//		
		char[] c = {97,32,98};
		
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		
		
		
//		
//		try(FileOutputStream o = new FileOutputStream("b.txt")){
//			String msg = "qwerty";
//			for (int i = 0; i < msg.length(); i++) {
//				o.write(msg.charAt(i));
//			}
//		}
//		catch(IOException e) {
//			System.out.println(e);
//		}
	}

}
