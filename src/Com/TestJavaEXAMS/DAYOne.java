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

	public static void main(String[] args) {

	}
}
