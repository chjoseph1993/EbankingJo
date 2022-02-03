package com.ebanking.master;

public class Exelib {

	public static void main(String[] args) throws InterruptedException {
		
		//instance class
				Library LB=new Library();
				 LB.openApp();
				 LB.AdminLgn();
				 LB.BranchCre();
				 LB.Rolecre();
				 LB.Employeecre();
				 LB.logout();
				 LB.close();
	}

}
