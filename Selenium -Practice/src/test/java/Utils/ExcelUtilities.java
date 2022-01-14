package Utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.apache.commons.compress.utils.FileNameUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;


public class ExcelUtilities {

	//String [] header;

	public void ExcelCreator(String [] header) throws Exception {
		// TODO Auto-generated method stub

		//this.header = header;
		XSSFWorkbook XLSX = new XSSFWorkbook();
		XSSFSheet XLXSh = XLSX.createSheet("Test");
		XLXSh.createRow(0);
			
		for (int i =0; i<header.length;i++)
		{
			XLXSh.getRow(0).createCell(i).setCellValue(header[i]);	
		}

		File file = new File("D:\\Sandeep1.xlsx");
		FileOutputStream OS = new FileOutputStream(file);
		XLSX.write(OS);
		XLSX.close();

	}

	// Retrieve the values from the cell in the excel - XCLSX 
	public void ExcelReador(String Path,String SheetName) throws Exception {

		FileInputStream file = new FileInputStream(Path);
		XSSFWorkbook XLSX = new XSSFWorkbook(file);

		XSSFSheet XLXSH = XLSX.getSheet(SheetName);

		//retrieving total no of rows 
		int strRowNum =XLXSH.getLastRowNum();

		//retrieving total no of columns
		int strColNum = XLXSH.getRow(0).getLastCellNum();


		for(int i =0;i<=strRowNum;i++)
		{
			for (int j =0;j<=strColNum-1;j++)

			{
				String txt = XLXSH.getRow(i).getCell(j).toString();
				System.out.println("Value of the cell is:" +txt);
			}
		}


	}


	//search specific value and update it with another value in the excel - XCLSX 

	public void ExcelSearch_Update(String Path,String SheetName,String txtSearch,String txtchange) throws Exception 
	{

		FileInputStream file = new FileInputStream(Path);
		XSSFWorkbook XLSX = new XSSFWorkbook(file);

		XSSFSheet XLXSH = XLSX.getSheet(SheetName);

		//retrieving total no of rows 
		int strRowNum =XLXSH.getLastRowNum();

		//retrieving total no of columns
		int strColNum = XLXSH.getRow(0).getLastCellNum();
		for(int i =0;i<=strRowNum;i++)
		{
			for (int j =0;j<=strColNum-1;j++)

			{
				String txt = XLXSH.getRow(i).getCell(j).toString();
				if (txt.equalsIgnoreCase(txtSearch)) 
				{

					XLXSH.getRow(i).getCell(j).setCellValue(txtchange);

					System.out.println("Updated value of the cell is:" +XLXSH.getRow(i).getCell(j));
					file.close();
					FileOutputStream OS = new FileOutputStream(Path);
					XLSX.write(OS);



				}
			}

		}

		XLSX.close();
	}


	public void DeleteExcelRecords() throws FilloException
	{
		Fillo fil = new Fillo ();
		Connection con = fil.getConnection("D:/Sandeep1.xlsx");
		String strQuery = "Delete from Test where Email_Id = '1@test.com'";
		con.executeUpdate(strQuery);


	}

public void ReadWorddocument(String Path) throws IOException
	{
		//File f= new File (Path);
		String strExtn = FileNameUtils.getExtension(Path);
		if (strExtn.equalsIgnoreCase("docx"))
		{
			FileInputStream fs = new FileInputStream(Path);
			XWPFDocument doc = new XWPFDocument(fs);
			List<XWPFParagraph> para= doc.getParagraphs();
			//int noofPara = para.size();
			for(XWPFParagraph parag: para)
			{
				String s =parag.getParagraphText().toString();
				System.out.println("Pargraphs are:"+s);
				//XWPFDocument doc = new XWPFDocuments();
			}
		}
	}


public void createWorddocument() throws IOException
{
	
	XWPFDocument WD = new XWPFDocument();
	FileOutputStream OS = new FileOutputStream("D:/test.docx");
	
	XWPFParagraph pa = WD.createParagraph();
	XWPFRun er = pa.createRun();
	er.setText("sandeep");
  WD.write(OS);
	WD.close();
	
	
	}

public void createtxt() throws IOException
{
	File f = new File("D:/test1.txt");
	FileWriter fw = new FileWriter(f);
	fw.write("sandeep is foody");
	fw.close();
	
}


public void readtxt(String path) throws IOException
{
    File fs = new File(path);
	FileReader rd = new FileReader(fs);	
	BufferedReader r = new BufferedReader(rd);
	String s;
	  
	while((s = r.readLine())!=null) 
	{
		System.out.println(s);
		
	//	String s = r.readLine();
			
	}
	
	r.close();
	//FileWriter fw = new FileWriter(f);
	//fw.write("sandeep is foody");
	//fw.close();
	
}


}
