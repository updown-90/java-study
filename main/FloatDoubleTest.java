import java.math.BigDecimal;

public class FloatDoubleTest {
	public static void main(String[] args) {

		float floatValue = 100 / 3;
		System.out.println(floatValue);
		double doubleValue = 100 / 3;
		System.out.println(doubleValue);
		BigDecimal bigDecimal = new BigDecimal(100 / 3);
		System.out.println(bigDecimal);
	}
}
