package exercise12;

public class StackApp {

	public static void main(String[] args) {

		StackUser user = new StackUser();
		Stack s = new FixedArrayStack(10);
		
		user.fill(s);

	}

}
