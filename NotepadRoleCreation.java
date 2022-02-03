package com.ebanking.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NotepadRoleCreation {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//instance class
		Library1Return Lb=new Library1Return();
		Lb.openApp("http://122.175.8.158/ranford2/");
		Lb.AdminLgn("Admin","Te$ting@");
		
		//to get test data file path
		String Fpath="F:\\Selenium joseph\\ebanking\\src\\com\\ebanking\\testdata\\Notepad Roles Creation.txt";
		
		//result file path
		String Rpath="F:\\Selenium joseph\\ebanking\\src\\com\\ebanking\\results_Notepad Roles Creation.txt";
		String SD;
		
		//to get test data file
		FileReader FR=new FileReader(Fpath);
		BufferedReader BR=new BufferedReader(FR);
		String Sread=BR.readLine();
		System.out.println(Sread);
		
		//write
		FileWriter FW=new FileWriter(Rpath);
		BufferedWriter BW=new BufferedWriter(FW);
		
		BW.write(Sread);
		BW.newLine();
		
		//multiple iterations
		while ((SD=BR.readLine())!=null) {
			

			System.out.println(SD);
			
			//split
			String SR[]=SD.split("&&&&");
			String Rname=SR[0];
			String Rdesc=SR[1];
			String Rtype=SR[2];
			String Result=Lb.Rolecre(Rname, Rdesc, Rtype);
			System.out.println(Result);
			
		
		//results
		BW.write(SD+"#^%$"+ Result);
		BW.newLine();
		
		}
		BW.close();
		BR.close();		
		

	}

}
