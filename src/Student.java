public class Student {
	private String name;
	private int age;
	private final String studentId;
	private transient int temporaryValue;
	private volatile int volatileValue;

	public Student(String name, int age, String studentId) {
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStudentId() {
		return studentId;
	}

	public int getTemporaryValue() {
		return temporaryValue;
	}

	public void setTemporaryValue(int temporaryValue) {
		this.temporaryValue = temporaryValue;
	}

	public int getVolatileValue() {
		return volatileValue;
	}

	public void setVolatileValue(int volatileValue) {
		this.volatileValue = volatileValue;
	}

	public native void nativeMethod();

	@Override
	public String toString() {
		return "Student{" + "name='" + name + '\'' + ", age=" + age + ", studentId='" + studentId + '\'' + '}';
	}
}
