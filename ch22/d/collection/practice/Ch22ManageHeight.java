package d.collection.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ch22ManageHeight {

	List<List<Integer>> gradeHeights = new ArrayList<>();

	public static void main(String[] args) {
		Ch22ManageHeight ch22ManageHeight = new Ch22ManageHeight();
		ch22ManageHeight.setData();
		// ch22ManageHeight.printHeight(1);
		ch22ManageHeight.printHeightAll();
		// ch22ManageHeight.printAverage(1);
		ch22ManageHeight.printAverageAll();

	}

	public void setData() {
		gradeHeights.add(Arrays.asList(170, 180, 173, 175, 177));
		gradeHeights.add(Arrays.asList(160, 165, 167, 186));
		gradeHeights.add(Arrays.asList(158, 177, 187, 176));
		gradeHeights.add(Arrays.asList(173, 182, 181));
		gradeHeights.add(Arrays.asList(170, 180, 165, 177, 172));
	}

	public void printHeight(int classNo) {
		System.out.println("ClassNo." + classNo);
		classNo--;
		for (Integer height : gradeHeights.get(classNo)) {
			System.out.println(height);
		}
	}

	private void printHeightAll() {
		int classNo = 1;
		for (List<Integer> gradeHeight : gradeHeights) {
			System.out.println("ClassNo." + classNo);
			classNo++;
			for (Integer height : gradeHeight) {
				System.out.println(height);
			}
		}
	}

	public void printAverage(int classNo) {
		double sum = 0;
		System.out.println("ClassNo." + classNo);
		classNo--;
		for (Integer height : gradeHeights.get(classNo)) {
			sum += height;
		}

		int memberCount = gradeHeights.get(classNo).size();
		System.out.println("Height average:" + sum / memberCount);
	}

	public void printAverageAll() {
		int classNo = 1;
		for (List<Integer> gradeHeight : gradeHeights) {
			System.out.println("ClassNo." + classNo);
			double sum = 0;
			classNo++;
			for (Integer height : gradeHeight) {
				sum += height;
			}
			int memberCount = gradeHeight.size();
			System.out.println("Height average:" + sum / memberCount);
		}
	}
}
