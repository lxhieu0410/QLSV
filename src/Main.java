public class Main {
	public static void main(String[] args) {
		Student[] students = new Student[] { new Student("Lê Xuân Trinh", 26, "S01"),
				new Student("Lê Xuân Dương", 28, "S02") };

		StudentManager studentManager = new StudentManager(students);
		studentManager.addStudent(new Student("Lê Xuân Long", 21, "S03"));

		System.out.println("All students: " + studentManager);
		System.out.println("Find student by name 'Trinh': " + studentManager.findStudentByName("Trinh"));

		GenericStudentManager<Student> genericStudentManager = new GenericStudentManager<>();
		genericStudentManager.addStudent(new Student("Lê Xuân Hiếu", 23, "S04"));

		System.out.println("All students in generic manager: " + genericStudentManager);
		System.out.println("All student names: " + genericStudentManager.getAllStudentNames());
	}
}
