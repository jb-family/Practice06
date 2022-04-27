package com.javaex.ex02;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape s1 = new Shape("파랑", "파랑");
		System.out.println("================");
		
		Triangle t1 = new Triangle();
		System.out.println("================");
		
		Triangle t2 = new Triangle(3, 4);
		System.out.println("================");
		
		Shape t3 = new Triangle("빨강", "빨강", 15, 15);
		System.out.println("================");
		
		
		// 예상 값 
		// 생성자 Shape(2) 실행
		
		// 생성자 Shape(0) 실행
		// 생성자 Trinangle(0) 실행
		
		// 생성자 Shape(2) 실행
		// 생성자 Trinangle(2) 실행
		
		// 생성자 Shape(2) 실행
		// 생성자 Triangle(4) 실행
		
		//다시 확인하기
	}

}

