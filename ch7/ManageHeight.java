public class ManageHeight {
	int[][] gradeHeights;

	public void setData() {
		gradeHeights = new int[5][];
		gradeHeights[0] = new int[] {170, 180, 173, 175, 177};
		gradeHeights[1] = new int[] {160, 165, 167, 186};
		gradeHeights[2] = new int[] {158, 177, 187, 176};
		gradeHeights[3] = new int[] {173, 182, 181};
		gradeHeights[4] = new int[] {170, 180, 165, 177, 172};
	}

	public void printHeight(int classNo) {
		System.out.println("ClassNo." + classNo);
		classNo--;
		for (int gradeHeight : gradeHeights[classNo]) {
			System.out.println(gradeHeight);
		}
	}

	public void printHeightAll() {
		for (int i = 0; i < gradeHeights.length; i++) {
			printHeight(i + 1);
		}
	}

	public void printAvgAll() {
		for (int i = 0; i < gradeHeights.length; i++) {
			System.out.println("ClassNo." + (i + 1));
			double sum = 0;
			int studentCount = gradeHeights[i].length;
			for (int data : gradeHeights[i]) {
				sum += data;
			}
			System.out.println("Height average : " + sum / studentCount);
		}
	}

	public static void main(String[] args) {
		ManageHeight manageHeight = new ManageHeight();
		manageHeight.setData();
		manageHeight.printHeightAll();
		manageHeight.printAvgAll();
	}
}
