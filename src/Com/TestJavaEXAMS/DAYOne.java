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

	public static void main(String[] args) {
		String s3 = "madam";
		char[] charArray = s3.toCharArray();
		int length = charArray.length;
		String temp = "";
		String s4 = s3;
		for (int i = length - 1; i >= 0; i--) {
			char charAt = s3.charAt(i);
			temp += charAt;

		}
		System.out.println(temp);
		if (s3.equals(temp)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}
