package Com.TestJavaEXAMS;

public class DAYOne {
	private void tc1() {
		String s = "AGNI";
		String temp = "";
		int length = s.length();
		for (int i = length - 1; i >= 0; i--) {
			char t = s.charAt(i);
			temp = temp + t;

		}
		System.out.println(temp);
	}

	private void tc2() {

		String s = "StringBuffer";
		StringBuilder s1 = new StringBuilder();
		StringBuilder append = s1.append(s);
		StringBuilder reverse = append.reverse();

		System.out.println(reverse);
	}

	private void tc3() {
		String s = "StringBuffer";
		StringBuilder s1 = new StringBuilder();
		StringBuilder append = s1.append(s);
		StringBuilder reverse = append.reverse();

		System.out.println(reverse);

	}
	
	private void tc11() {

		String s = "StringBuffer";
		StringBuilder s1 = new StringBuilder();
		StringBuilder append = s1.append(s);
		StringBuilder reverse = append.reverse();

		System.out.println(reverse);
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

	}
}
