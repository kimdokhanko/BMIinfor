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
		double height2 = (height * 0.01); // �Է¹��ڸ��� m�� ȯ�� 
		double total = weight/(height2 * height2); // BMI ���� kg/��
		bmi.setTotal(total);
	}

	public void check() {
//		0 ~ 18.5= "��ü��";
//		~ 23 = "����";
//		~ 25 = "��ü��";
//		~ 30 = "��";
//		30 ~ = "����";
		String name;
		System.out.println("+-+-+-+[BMI ���]+-+-+-+");
		double i = bmi.getTotal();
		System.out.println(i);
		if (i <= 18.5) {
			name = "��ü��";
		} else if (i < 23.0) {
			name = "����ü��";
		} else if (i < 25.0) {
			name = "��ü��";
		} else if (i < 30.0) {
			name = "��";
		} else {
			name = "����";
		}
		System.out.println("����� BMI��" + bmi.getTotal() + "," + name + " �Դϴ�.");
	}

	public void printBye() {
		System.out.println("+-+-+-+[BMI ���� ����Ǿ����ϴ�.]+-+-+-+");
	}

	public void printExit() {
		System.out.println("+-+-+-+[1~3�� �߿��� �Է��ϼ���]+-+-+-+");
	}
}
