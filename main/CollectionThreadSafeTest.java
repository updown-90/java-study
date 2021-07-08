import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionThreadSafeTest {
	// static List<String> list = new ArrayList<>();
	// static List<String> list = new Vector<>();
	// static List<String> list = new Stack<>();
	static Map<String, Integer> map = new ConcurrentHashMap<>();

	public static void main(String[] ar) {
		map.put("reakwon", 1);
		map.put("hello", 1);
		map.put("world", 1);

		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				map.values().forEach((item) -> {
					//1초마다 원소를 출력
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(item);
				});
			}
		});

		thread.start();    //thread 시작

		//thread가 forEach문을 먼저 수행할 여유를 주기 위해 1초 기다림
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//thread가 forEach() 하는 중에 원소추가
		map.put("world", 2);
	}
}
