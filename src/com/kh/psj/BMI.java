package com.kh.psj;

public class BMI { // Ŭ���� ����, ���������� public
		
	public String name;  // �񸸵�
	public double height; // Ű cm ���� 
	public double height2; // Ű m ����
	public double weight; // ������
	public double total; // BMI���� Űm*Űm/������

	public BMI() {
	} // �⺻ ������

	public BMI(String name, double height, double weight, double height2, double total) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.height2 = height2;
		this.total = total;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setHeight2(double height2) {
		this.height2 = height2;
	}
	public void setTotal(double total) {
		this.total = total;
	}

	public String getName() {
		return this.name;
	}

	public double getHeight() {
		return this.height;
	}

	public double getHeight2() {
		return this.height2;
	}
	public double getTotal() {
		return this.total;
	}
}

