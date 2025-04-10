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
	private void tc4() {
		String s = "racecar123@#$%^gfdggfgfg";
		String temp = "";
		// String o = s;
		int l = s.length();
		for (int i = l - 1; i >= 0; i--) {
			char t = s.charAt(i);

			temp += t;

		}
		System.out.println(temp);
		if (s.equals(temp)) {
			System.out.println("Palindrom");
		} else {
			System.out.println("Not Palindrom");
		}
	}

	private void tc5() {
		String s = "racecar123@#$%^gfdggfgfg";
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
		System.out.println("Charcter is :" + "\n" + s1);
		System.out.println("Number is " + "\n" + s2);
		System.out.println("Special Char is :" + "\n" + s3);
	}
	private void tc12() {

		String s = "StringBuffer";
		StringBuilder s1 = new StringBuilder();
		StringBuilder append = s1.append(s);
		StringBuilder reverse = append.reverse();

		System.out.println(reverse);
	}

	public static void main(String[] args) {

	}
}
