package com.kh.psj;

public class BMIRun {
	public static void main(String []  args) {
		BMIFunction sFunc = new BMIFunction();
	EXIT: while (true) {
		int choice = sFunc.inforMenu();
		switch(choice) {
		case 1 : 
			sFunc.infor();
			break;
		case 2 : 
			sFunc.check();
			break;
		case 3 : 
			sFunc.printBye();
			break EXIT; 
		default :
			sFunc.printExit();
			break;
		}
	}
	}

}
