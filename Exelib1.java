package com.ebanking.master;

public class Exelib1 {

	public static void main(String[] args) throws InterruptedException {
	
		//instance class
		Library1 LB=new Library1();
		 LB.openApp("http://122.175.8.158/ranford2/");
		 LB.AdminLgn("Admin","Te$ting@");
		 LB.BranchCre("Hyderabad444","Ameerpet123","SRNagar","Yellareddyguda","Alinagar","50007");
		 LB.Rolecre("Tester","TestEngineer");
		 LB.Employeecre("Josephch","Josephch");
		 LB.logout();
		 LB.close();

	}

}
