package CV_Generator.CV_Generator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.PdfWriter;

public class CV {

	private Document document;

	public CV(String fileName) throws FileNotFoundException, DocumentException {
		document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream(fileName + ".pdf"));
		document.open();
	}

	public void generate(ArrayList<String> info) throws DocumentException {

	}

	private void genTitle() {

	}

	private void genSubTitle() {

	}

	private void genPhoneAndEmail() {

	}

	private void genAbout() {

	}

	private void genSkills() {

	}

	private void genExp() {

	}

	private void genLang() {

	}

	public void close() {
		document.close();
	}

}
