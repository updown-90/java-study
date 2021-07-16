public class ProfilePrint {
	byte age;
	String name;
	boolean isMarried;

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean married) {
		isMarried = married;
	}

	public static void main(String[] args) {
		ProfilePrint profilePrint = new ProfilePrint();
		profilePrint.setAge((byte)30);
		profilePrint.setMarried(true);
		profilePrint.setName("김상하");

		System.out.println(profilePrint.getAge());
		System.out.println(profilePrint.getName());
		System.out.println(profilePrint.isMarried);
	}
}
