package d.string.practice;

public class UserStringMethods {
	public static void main(String[] args) {
		String str = "The String class represents character strings.";

		UserStringMethods userStringMethods = new UserStringMethods();
		userStringMethods.printWords(str);
		userStringMethods.findString(str, "string");
		userStringMethods.findAnyCaseString(str, 's');
		userStringMethods.printContainWords(str, "ss");

	}

	public void printWords(String str) {
		String[] splitString = str.split(" ");
		for (String s : splitString) {
			System.out.println(s);
		}
	}

	public void findString(String str, String findStr) {
		System.out.println(str.indexOf(findStr));
	}

	public void findAnyCaseString(String str, char findStr) {
		int count = 0;
		for (char c : str.toCharArray()) {
			if (c == findStr)
				count++;
		}
		System.out.println(count);
	}

	public void printContainWords(String str, String findStr) {
		String[] splitString = str.split(" ");
		for (String s : splitString) {
			if (s.contains(findStr)) {
				System.out.println(s);
			}
		}
	}
}
