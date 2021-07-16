import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalTest {
	public static void main(String[] args) {
		// double 타입을 그대로 초기화하면 기대값과 다른 값을 가진다.
		// 0.01000000000000000020816681711721685132943093776702880859375
		new BigDecimal(0.01);

		// 문자열로 초기화하면 정상 인식
		// 0.01
		new BigDecimal("0.01");

		// 위와 동일한 결과, double#toString을 이용하여 문자열로 초기화
		// 0.01
		BigDecimal.valueOf(0.01);

		BigDecimal a = new BigDecimal("2.01");
		BigDecimal b = new BigDecimal("2.010");

		// 객체의 레퍼런스 주소에 대한 비교 연산자로 무의식적으로 값의 비교를 위해 사용하면 오동작
		// false
		System.out.println(a == b);

		// 값의 비교를 위해 사용, 소수점 맨 끝의 0까지 완전히 값이 동일해야 true 반환
		// false
		System.out.println(a.equals(b));

		// 값의 비교를 위해 사용, 소수점 맨 끝의 0을 무시하고 값이 동일하면 0, 적으면 -1, 많으면 1을 반환
		// 0
		System.out.println(a.compareTo(b));

		a = new BigDecimal("10");
		b = new BigDecimal("3");

		// 더하기
		// 13
		System.out.println(a.add(b));

		// 빼기
		// 7
		System.out.println(a.subtract(b));

		// 곱하기
		// 30
		System.out.println(a.multiply(b));

		// 나누기
		// 3.333333...
		// java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.
		// System.out.println(a.divide(b));

		// 나누기
		// 3.333
		System.out.println(a.divide(b, 3, RoundingMode.HALF_EVEN));

		// 나누기 후 나머지
		// 전체 자리수를 34개로 제한
		// 1
		System.out.println(a.remainder(b, MathContext.DECIMAL128));

		// 절대값
		// 3
		System.out.println(new BigDecimal("-3").abs());

		// 두 수 중 최소값
		// 3
		System.out.println(a.min(b));

		// 두 수 중 최대값
		// 10
		System.out.println(a.max(b));
	}
}
