public class StringBuilderStudy {
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder(1);
		StringBuilder stringBuilder1 = new StringBuilder("");
		StringBuilder stringBuilder2 = new StringBuilder("비교값");
		StringBuilder stringBuilder3 = new StringBuilder("비교값");

		System.out.println(stringBuilder2);
		System.out.println(stringBuilder3);

		System.out.println(stringBuilder2 == stringBuilder3);
		System.out.println(stringBuilder2.equals(stringBuilder3));

		System.out.println(stringBuilder.capacity());
		System.out.println(stringBuilder1.capacity());
		System.out.println(stringBuilder2.capacity());
		System.out.println(stringBuilder3.capacity());

		System.out.println(stringBuilder2.hashCode());
		stringBuilder1.append(1);
		System.out.println(stringBuilder2.hashCode());

		System.out.println(stringBuilder3.hashCode());
		stringBuilder1.append(1);
		System.out.println(stringBuilder3.hashCode());

	}
}
