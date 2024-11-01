package javaprograms;

public class MethodCalling {

	public static void main(String[] args) {
       System.out.println("Calling different methods");
       library();
       book();
       bookgenre();
	}
	static void book() {
		System.out.println("Select a book to read");
	}
	static void library() {
		System.out.println("Enter your MembershipId");
	}
	static void bookgenre() {
		System.out.println("Enter Genre of the book");
	}

}
