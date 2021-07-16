public class ManageStudent {
	public static void main(String[] args) {
		ManageStudent manageStudent = new ManageStudent();
		Student[] students = manageStudent.addStudent();
		manageStudent.printStudents(students);
	}

	public Student[] addStudent() {
		Student[] student = new Student[3];
		student[0] = new Student("Kim");
		student[1] = new Student("Lee");
		student[2] = new Student("Park", "Seoul", "010XXXXXXXX", "fffff@google.com");
		return student;
	}

	public void printStudents(Student[] student) {
		for (Student data : student) {
			System.out.println(data);
		}
	}
}
