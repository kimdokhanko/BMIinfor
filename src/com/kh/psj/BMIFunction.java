package com.kh.psj;

import java.util.Scanner;

public class BMIFunction {
	BMI bmi;
	Scanner sc = new Scanner(System.in);

	public BMIFunction() {
		bmi = new BMI();
	}

	public int inforMenu() {
		System.out.println("+-+-+-+[�񸸵� ����]+-+-+-+");
		System.out.println("[1] BMI ����ϱ�");
		System.out.println("[2] BMI �������");
		System.out.println("[3] ���� ����");
		int choice = sc.nextInt();
		return choice;
	}
	public void infor() {
		System.out.println("+-+-+-+[BMI ����ϱ�]+-+-+-+");
		System.out.print("Ű�� �Է����ּ���(cm): ");
		double height = sc.nextDouble();
		System.out.print("�����Ը� �Է����ּ���(kg): ");
		double weight = sc.nextDouble();
		System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		bmi.setHeight(height);
		bmi.setWeight(weight);
	}
	
	public void check() {
//		0 ~ 18.5= "��ü��";
//		~ 23 = "����";
//		~ 25 = "��ü��";
//		~ 30 = "��";
//		30 ~ = "����";
		System.out.println("+-+-+-+[BMI ���]+-+-+-+");
		double i = bmi.getTotal();
		if(i <= 18.5) {
			System.out.println("����� BMI�� " + bmi.getTotal() +"," + " ��ü�� �Դϴ�.");	
		} else if(i < 23.0) {
			System.out.println("����� BMI��" + bmi.getTotal()+"," + " ���� �Դϴ�."); 
		} else if (i < 25.0) {
			System.out.println("����� BMI��" + bmi.getTotal()+"," + " ��ü�� �Դϴ�."); 
			if(i < 30.0) {
				System.out.println("����� BMI��" + bmi.getTotal()+"," + " �� �Դϴ�.");
			}else if (i > 30.0) {
				System.out.println("����� BMI��" + bmi.getTotal()+"," + " �� �� �Դϴ�.");
			}
		}
	}

	public void printBye() {
		System.out.println("+-+-+-+[BMI ���� ����Ǿ����ϴ�.]+-+-+-+");
	}
	public void printExit() {
		System.out.println("+-+-+-+[1~3�� �߿��� �Է��ϼ���]+-+-+-+");
	}
}
