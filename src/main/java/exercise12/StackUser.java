package exercise12;

public class StackUser {
	
	public void fill(Stack s) {
		for(int i = 0 ; i < 11 ; i++) {
			s.push(i);
			System.out.println("Pushed --->"+i);
		}
	}

}
