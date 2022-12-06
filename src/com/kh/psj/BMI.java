package com.kh.psj;

public class BMI { // 클래스 선언, 접근지정자 public
		
	public String name;  // 비만도
	public double height; // 키 cm 단위 
	public double height2; // 키 m 단위
	public double weight; // 몸무게
	public double total; // BMI계산식 키m*키m/몸무게

	public BMI() {
	} // 기본 생성자

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

