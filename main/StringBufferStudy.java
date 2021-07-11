public class StringBufferStudy {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer(1);
		StringBuffer stringBuffer1 = new StringBuffer("");
		StringBuffer stringBuffer2 = new StringBuffer("비교값");
		StringBuffer stringBuffer3 = new StringBuffer("비교값");

		System.out.println(stringBuffer3);
		System.out.println(stringBuffer2);

		System.out.println(stringBuffer3 == stringBuffer2);
		System.out.println(stringBuffer3.equals(stringBuffer2));

		System.out.println(stringBuffer.capacity());
		System.out.println(stringBuffer1.capacity());
		System.out.println(stringBuffer3.capacity());
		System.out.println(stringBuffer2.capacity());
	}
}
