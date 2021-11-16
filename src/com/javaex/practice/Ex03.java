package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		age = sc.nextInt();
		
		if(age>20) {
			System.out.println("\"1번그룹\"");
		} else {
			System.out.println("\"2번그룹\"");
		} // 15-2번그룹, 19-2번그룹, 20-2번그룹, 21-1번그룹

		sc.close();
	}

}
