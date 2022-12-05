package com.kh.psj;

import java.util.Scanner;

public class BMIFunction {
	BMI bmi;
	Scanner sc = new Scanner(System.in);

	public BMIFunction() {
		bmi = new BMI();
	}

	public int inforMenu() {
		System.out.println("+-+-+-+[비만도 계산기]+-+-+-+");
		System.out.println("[1] BMI 계산하기");
		System.out.println("[2] BMI 결과보기");
		System.out.println("[3] 계산기 종료");
		int choice = sc.nextInt();
		return choice;
	}
	public void infor() {
		System.out.println("+-+-+-+[BMI 계산하기]+-+-+-+");
		System.out.print("키를 입력해주세요(cm): ");
		double height = sc.nextDouble();
		System.out.print("몸무게를 입력해주세요(kg): ");
		double weight = sc.nextDouble();
		System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		bmi.setHeight(height);
		bmi.setWeight(weight);
	}
	
	public void check() {
//		0 ~ 18.5= "저체중";
//		~ 23 = "정상";
//		~ 25 = "과체중";
//		~ 30 = "비만";
//		30 ~ = "고도비만";
		System.out.println("+-+-+-+[BMI 결과]+-+-+-+");
		double i = bmi.getTotal();
		if(i <= 18.5) {
			System.out.println("당신의 BMI는 " + bmi.getTotal() +"," + " 저체중 입니다.");	
		} else if(i < 23.0) {
			System.out.println("당신의 BMI는" + bmi.getTotal()+"," + " 정상 입니다."); 
		} else if (i < 25.0) {
			System.out.println("당신의 BMI는" + bmi.getTotal()+"," + " 과체중 입니다."); 
			if(i < 30.0) {
				System.out.println("당신의 BMI는" + bmi.getTotal()+"," + " 비만 입니다.");
			}else if (i > 30.0) {
				System.out.println("당신의 BMI는" + bmi.getTotal()+"," + " 고도 비만 입니다.");
			}
		}
	}

	public void printBye() {
		System.out.println("+-+-+-+[BMI 계산기 종료되었습니다.]+-+-+-+");
	}
	public void printExit() {
		System.out.println("+-+-+-+[1~3번 중에서 입력하세요]+-+-+-+");
	}
}
