import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class CollectionThreadSaveTest {
	// static List<String> list = new ArrayList<>();
	static List<String> list = new Vector<>();
	// static List<String> list = new Stack<>();

	public static void main(String[] ar) {
		list.add("reakwon");
		list.add("hello");
		list.add("world");

		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				list.forEach((item) -> {
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
		list.add("thread-unsafe");
	}
}
