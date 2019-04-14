
public class gitCollaboration {
	String name;
	String email;

	gitCollaboration(String studentName, String studentEmail) {
		name = studentName;
		email = studentEmail;
	}

	public static void main(String[] args) {
		// my info
		new gitCollaboration("Xiaoya", "xiaoyah@seas.upenn.edu");
		// my collaborator info
		// please feel free to add anything you'd like to share!
		System.out.println("Hello Xiaoya!");

	}
}
