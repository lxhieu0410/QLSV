import java.util.ArrayList;
import java.util.Arrays;

public class StudentManager {
	private Student[] students;

	public StudentManager(Student[] students) {
		this.students = students;
	}

	public void addStudent(Student student) {
		int length = students.length;
		students = Arrays.copyOf(students, length + 1);
		students[length] = student;
	}

	public void removeStudent(String studentId) {
		ArrayList<Student> list = new ArrayList<>(Arrays.asList(students));
		list.removeIf(student -> student.getStudentId().equals(studentId));
		students = list.toArray(new Student[0]);
	}

	public Student findStudentByName(String name) {
		for (Student student : students) {
			if (student.getName().equalsIgnoreCase(name)) {
				return student;
			}
		}
		return null;
	}

	public String[] getAllStudentNames() {
		String[] names = new String[students.length];
		for (int i = 0; i < students.length; i++) {
			names[i] = students[i].getName();
		}
		return names;
	}

	@Override
	public String toString() {
		return "StudentManager{" + "students=" + Arrays.toString(students) + '}';
	}
}
