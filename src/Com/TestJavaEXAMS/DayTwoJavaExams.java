package Com.TestJavaEXAMS;

import java.util.Set;
import java.util.TreeSet;

public class DayTwoJavaExams {
	private void triangle() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {

				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");
			}
			System.out.println("");
		}
		for (int i = 4; i >= 1; i--) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}

	private void tc2() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {

				System.out.print(j + " ");
			}
			System.out.println("");

		}
		for (int i = 4; i >= 1; i--) {
			for (int j = 5; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println("");

		}
	}

	private void naturalsNumbers() {
		int temp = 0;
		for (int i = 0; i <= 10; i++) {
			temp += i;

		}
		System.out.println(temp);
	}

	private void factorialNumber() {
		int temp = 1;
		for (int i = 1; i <= 5; i++) {

			temp *= i;
		}
		System.out.println(temp);
	}

	private void forwardLoop() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);

			}
			System.out.println("");

		}
	}

	private void prinitingIValue() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);

			}
			System.out.println("");
		}
	}

	private void swapingTwoWithThirdMemeory() {
		int a = 10;
		int b = 20;
		int c = 0;
		c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);
	}

	private void swapingTwoNumbers() {
		int a = 10;
		int b = 20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);
	}

	private void reverseInt() {

		int a = 12345;
		int b = 0;
		int c = 0;
		while (a > 0) {
			b = a % 10;
			c = c * 10 + b;
			a = a / 10;

		}
		System.out.println(c);
	}

	private void reverseString() {

		String a = "One Two Three";
		String b = "";
		// char[] array = a.toCharArray();
		int length = a.length();
		for (int i = length - 1; i >= 0; i--) {
			char charAt = a.charAt(i);
			b += charAt;
		}
		System.out.println(b);

	}

	private void fibonaciSeries() {
		int a = 0;
		int b = 0;
		int c = 1;
		int d = 10;
		for (int i = 0; i < d; i++) {
			System.out.println(a); // 0 1 1 2 3 5 8
			a = b + c; // 0 1 1 2 3 5 8 13
			b = c;
			c = a;

		}

	}

	private void armstrong() {
		int a = 370;
		int b = 0;
		int c = 0;
		int d = a;
		while (a >= 1) {
			c = a % 10;
			b = b + c * c * c;
			a = a / 10;

		}
		System.out.println(b);
		if (d == b) {
			System.out.println(b + " is a Armstrong Number");
		} else {
			System.out.println(b + " is not a Armstrong Number");
		}

	}

	private void additionArray() {

		int[] a = { 45, 2, 3, 4, 5, 6, 7, 8, 9, 10, 78, 98, 65, 54 };
		int b = 0;
		int len = a.length;
		for (int i = len - 1; i > 0; i--) {

			b += a[i];
		}
		System.out.println("Addition of the Array is : " + b);
	}

	private void minOfTheArray() {
		int[] a = { 20, 2, 3, 4, 5, 6, 7, 8, 9, 10, 78, 98, 65, 54 };
		int b = a[0];
		int c = 0;
		int len = a.length;
		for (int i = len - 1; i > 0; i--) {
			if (b > a[i]) {
				b = a[i];

			}
			if (c < a[i]) {
				c = a[i];
			}
		}
		System.out.println("Minimum num of the Array is :" + b);
		System.out.println("Maximum num of the Array is :" + c);
	}

	private void findFirstTwoMaxi() {

		int[] a = { 20, 2, 3, 4, 5, 6, 7, 8, 9, 10, 78, 98, 65, 54 };
		int b = a[0];
		int c = 0;
		int len = a.length;
		for (int i = len - 1; i > 0; i--) {

			if (b < a[i]) {
				c = b;
				b = a[i];
			} else if (c < a[i]) {
				c = a[i];

			}

		}
		System.out.println("First Maximum num is :" + b);
		System.out.println("Second Maximum num is :" + c);
	}

	private void splitingstringBasedOnTheirTypes() {

		String s = "testing@123+_()*&$456_+890.com";
		StringBuilder s1 = new StringBuilder();
		StringBuilder s2 = new StringBuilder();
		StringBuilder s3 = new StringBuilder();
		for (char ch : s.toCharArray()) {
			if (Character.isLetter(ch)) {

				s1.append(ch);
			} else if (Character.isDigit(ch)) {

				s2.append(ch);
			} else {
				s3.append(ch);
			}

		}
		System.out.println("Letters of the String is :" + s1);
		System.out.println("Digit of the String is :" + s2);
		System.out.println("Special character of the String is :" + s3);

	}

	private void removingDuplicatesfromthearraylist() {
		int[] a = { 20, 2, 3, 4, 5, 6, 7, 8, 9, 10, 78, 98, 65, 54, 20, 2, 3, 4, 5, 6, 7, 8, 9, 10, 78, 98, 65, 54 };
		Set<Integer> s = new TreeSet<Integer>();
		for (int i = 0; i < a.length - 1; i++) {

			s.add(a[i]);

		}
		System.out.println("After Removed the Duplicates from the list :" + "\n" + s);
	}

	private void revStringUsingCharArray() {
		String s = "Prakash Rajendran Kavitha Raj Kumar";
		String t ="";
	char[] u = s.toCharArray();
	int len = u.length;
	for(int i= len-1; i>=0; i--) {
		t +=u[i];
	}System.out.println(t);
	}
	private void revStringusingChatAT() {
		String s = "Prakash Rajendran Kavitha Raj Kumar";
		String t ="";
		int len = s.length();
		for(int i=len-1; i>=0; i--) {
			char charAt = s.charAt(i);
			t+= charAt;
		}System.out.println(t);
	}

	public static void main(String[] args) {
		DayTwoJavaExams d = new DayTwoJavaExams();
		d.revStringusingChatAT();

	}

}
