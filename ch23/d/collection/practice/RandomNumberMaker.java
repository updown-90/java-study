package d.collection.practice;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {
	public static void main(String[] args) {
		RandomNumberMaker randomNumberMaker = new RandomNumberMaker();

		for (int i = 0; i < 10; i++) {
			randomNumberMaker.getSixNumber();
		}
	}

	public HashSet<Integer> getSixNumber() {
		HashSet<Integer> randomNumbers = new HashSet<>();
		while (randomNumbers.size() < 6) {
			randomNumbers.add(new Random().nextInt(45));

		}
		System.out.println(randomNumbers);
		return randomNumbers;
	}
}
