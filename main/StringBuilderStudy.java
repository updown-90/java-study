public class StringBuilderStudy {
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder(1);
		StringBuilder StringBuilder1 = new StringBuilder("");
		StringBuilder StringBuilder2 = new StringBuilder("비교값");
		StringBuilder StringBuilder3 = new StringBuilder("비교값");

		System.out.println(StringBuilder2);
		System.out.println(StringBuilder3);

		System.out.println(StringBuilder2 == StringBuilder3);
		System.out.println(StringBuilder2.equals(StringBuilder3));

		System.out.println(stringBuilder.capacity());
		System.out.println(StringBuilder1.capacity());
		System.out.println(StringBuilder2.capacity());
		System.out.println(StringBuilder3.capacity());
	}
}
