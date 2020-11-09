package tech;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class exam01 {
	
	public static void main(String[] args) {
	// 己利  , 己利 啊吝摹
	// 
	String[] grades = {"A+", "D+", "F", "C0"};
	int[] weights = {2, 5, 10, 3};
	int threshold = 50;
	int inherence = 0;
	int result = 0;
	// 
	for (int i = 0; i < grades.length; i++) {
		if(grades[i].equals("A+")) {
			inherence = 10;
		} else if(grades[i].equals("A0")) {
			inherence = 9;
		} else if(grades[i].equals("B+")) {
			inherence = 8;
		} else if(grades[i].equals("B0")) {
			inherence = 7;
		} else if(grades[i].equals("C+")) {
			inherence = 6;
		} else if(grades[i].equals("C0")) {
			inherence = 5;
		} else if(grades[i].equals("D+")) {
			inherence = 4;
		} else if(grades[i].equals("D0")) {
			inherence = 3;
		} else if(grades[i].equals("F")) {
			inherence = 0;
		}
		result += inherence * weights[i]; 
	}
	
	System.out.println(result - threshold);
	
	
	}
	
}
