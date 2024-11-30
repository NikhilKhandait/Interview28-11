
package practiceString;

public class CharCount {

	public static void main(String[] args) {

		/* Spacific character ko count karne k liye --> example here "A" */

		String s = "naramada";
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			String ss = Character.toString(s.charAt(i));

			if (ss.equals("a")) {
				count++;
			}

		}
		if (count > 0) {
			System.out.println("a=" + count);
		}
	}
}
