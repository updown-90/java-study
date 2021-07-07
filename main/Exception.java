public class Exception {
	public static void main(String[] args) {
		exceptionCompulsionMethod();
	}

	private static void exceptionMethod() {
		String string = null;
		System.out.println(string.toString());
	}

	private static void exceptionTryCatchMethod() {
		try {
			String string = null;
			System.out.println(string.toString());
		} catch (java.lang.Exception e) {
			System.out.println("대처했지롱");
		}
	}

	private static void exceptionTryCatchFinallyMethod() {
		try {
			String string = null;
			System.out.println(string.toString());
		} catch (java.lang.Exception e) {
			System.out.println("대처했지롱");
		} finally {
			System.out.println("무조건 실행되어야 하는 구문");
		}
	}

	private static void exceptionCompulsionMethod() {
		try {
			throw new java.lang.Exception("그냥 내쫓기");

			// String string = null;
			// System.out.println(string.toString());
		} catch (java.lang.Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("무조건 실행되어야 하는 구문");
		}
	}
}
