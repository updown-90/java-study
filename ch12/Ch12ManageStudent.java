public class Ch12ManageStudent {
	public static void main(String[] args) {
		Ch12ManageStudent ch12ManageStudent = new Ch12ManageStudent();
		// Ch12Student[] ch12Students = ch12ManageStudent.addStudent();
		// ch12ManageStudent.printStudents(ch12Students);
		ch12ManageStudent.checkEquals();

	}

	public Ch12Student[] addStudent() {
		Ch12Student[] ch12Student = new Ch12Student[3];
		ch12Student[0] = new Ch12Student("Kim");
		ch12Student[1] = new Ch12Student("Lee");
		ch12Student[2] = new Ch12Student("Park", "Seoul", "010XXXXXXXX", "fffff@google.com");
		return ch12Student;
	}

	public void printStudents(Ch12Student[] ch12Student) {
		for (Ch12Student data : ch12Student) {
			System.out.println(data);
		}
	}

	public void checkEquals() {
		Ch12Student a = new Ch12Student("Kim", "Seoul", "010XXXXXXXXX", "gadf123@google.com");
		Ch12Student b = new Ch12Student("Kim", "Seoul", "010XXXXXXXXX", "gadf123@google.com");

		if (a.equals(b)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

	}
}
