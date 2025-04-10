package Org.Java;

public class ToayTest {
	private void tc1() {
		int a = 10;
		int b = 20;
		int c = 0;
		c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);

	}

	private void tc2() {
		int a = 10;
		int b = 20;
		a = b + a;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);
	}

	private void tc3() {
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

	private void tc4() {
		String s = "Praksh Rajendran Kavitha Rajkumar";
		String a = "";
		int l = s.length();
		for (int i = l - 1; i >= 0; i--) {
			char c = s.charAt(i);
			a += c;
		}
		System.out.println(a);
	}

	private void tc5() {
		int temp = 0;
		for (int i = 0; i <= 20; i++) {
			temp += i;

		}
		System.out.println(temp);

	}

	private void tc6() {
		int temp = 1;
		for (int i = 1; i <= 10; i++) {
			temp *= i;

		}
		System.out.println(temp);

	}

	private void tc7() {
		int a = 0;
		int b = 0;
		int c = 1;
		for (int i = 0; i < 7; i++) {
			System.out.println(a);
			a = b + c;
			b = c;
			c = a;

		}
	}

	private void tc8() {
		String s = "RaceCar";
		String a = "";
		// String r=s;
		int l = s.length();
		for (int i = l - 1; i >= 0; i--) {
			char c = s.charAt(i);
			a += c;
		}
		System.out.println(a);
		if (s.equalsIgnoreCase(a)) {
			System.out.println("Palindrome");

		} else {
			System.out.println("Not Palindrome");
		}
	}

	private void tc9() {
		int a = 9474;
		int b = 0;
		int c = 0;
		int d = a;
		while (a > 0) {
			b = a % 10;
			c = c + b * b * b * b;
			a = a / 10;
		}
		System.out.println(c);
		if (d == c) {
			System.out.println("Armstrong");

		} else {
			System.out.println("Not Armstrong");
		}

	}

	private void tc10() {
		int[] a = { 10, 20, 30, 40, 50 };
		int b = 0;
		for (int i = a.length - 1; i >= 0; i--) {

			b += a[i];
		}
		System.out.println(b);

	}

	private void tc11() {
		int[] a = { 10, 20, 30, 40, 50 };
		int b = a[0];
		for (int i = a.length - 1; i >= 0; i--) {

			if (b > a[i]) {
				b = a[i];
			}
		}
		System.out.println(b);

	}

	private void tc12() {
		int[] a = { 10, 20, 30, 40, 50, 15, 100 };
		int b = a[0];
		for (int i = a.length - 1; i >= 0; i--) {

			if (b < a[i]) {
				b = a[i];
			}
		}
		System.out.println(b);

	}
	private void tc13() {
		int[] a = { 10, 20, 30, 40, 50, 15, 100 };
		int b = 0;
		int c=0;
		for (int i =a.length-1; i >0; i--) {

			if (b <a[i]) {
				c = b; 
				b=a[i];
			}
			else if (c<a[i]) {
				c=a[i];
			}
		}System.out.println(b);
		System.out.println(c);
		

	}

	public static void main(String[] args) {
		ToayTest t = new ToayTest();
		t.tc13();
	}

}
