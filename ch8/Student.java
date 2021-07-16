public class Student {

	String name;
	String address;
	String phone;
	String email;

	public Student(String name) {
		this.name = name;
	}

	public Student(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student{" +
			"name='" + name + '\'' +
			", address='" + address + '\'' +
			", phone='" + phone + '\'' +
			", email='" + email + '\'' +
			'}';
	}
}
