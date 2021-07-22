public class StringStudy {
	public static void main(String[] args) {
		String literalString1 = "비교값";
		String literalString2 = "비교값";
		String objectString = new String("비교값");

		System.out.println(literalString1);
		System.out.println(literalString2);
		System.out.println(objectString);

		System.out.println(literalString1 == literalString2);
		System.out.println(literalString1.equals(literalString2));

		System.out.println(literalString1 == objectString);
		System.out.println(literalString1.equals(objectString));

		System.out.println(literalString2 == objectString);
		System.out.println(literalString2.equals(objectString));

		System.out.println(literalString1.hashCode());
		System.out.println(literalString2.hashCode());
	}
}
