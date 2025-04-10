package Org.Java;

import java.util.ArrayList;
import java.util.List;

public class TestDay001 {

	public static void main(String[] args) {

		List<Integer> s3 = new ArrayList<>();
		s3.add(23);
		s3.add(2);
		s3.add(44);
		s3.add(3);
		s3.add(2);
		s3.add(2);
		s3.add(23);
		s3.add(25);
		s3.add(25);
		
		for(int c:s3) {
			
			System.out.println(c);
			
			
		}

		System.out.println("S3 value is" + s3);
		for (int i = 0; i < s3.size(); i++) {
			Integer j = s3.get(i);

			System.out.println("Value of loop is :" + "\n" + j);
		}

	}

}
