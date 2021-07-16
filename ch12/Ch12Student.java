import java.util.Objects;

public class Ch12Student {

	String name;
	String address;
	String phone;
	String email;

	public Ch12Student(String name) {
		this.name = name;
	}

	public Ch12Student(String name, String address, String phone, String email) {
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

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Ch12Student that = (Ch12Student)o;
		return Objects.equals(name, that.name) && Objects.equals(address, that.address)
			&& Objects.equals(phone, that.phone) && Objects.equals(email, that.email);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, address, phone, email);
	}
}
