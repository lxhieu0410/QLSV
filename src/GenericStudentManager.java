import java.util.ArrayList;
import java.util.List;

public class GenericStudentManager<T extends Student> {
	private List<T> students;

	public GenericStudentManager() {
		this.students = new ArrayList<>();
	}

	public void addStudent(T student) {
		students.add(student);
	}

	public void removeStudent(String studentId) {
		students.removeIf(student -> student.getStudentId().equals(studentId));
	}

	public T findStudentByName(String name) {
		for (T student : students) {
			if (student.getName().equalsIgnoreCase(name)) {
				return student;
			}
		}
		return null;
	}

	public List<String> getAllStudentNames() {
		List<String> names = new ArrayList<>();
		for (T student : students) {
			names.add(student.getName());
		}
		return names;
	}

	@Override
	public String toString() {
		return "GenericStudentManager{" + "students=" + students + '}';
	}
}
