package example;

public class Hello {

	public void handleRequest(String input) {
		String message = String.format("Hello %s", input);
		System.out.println(message);
	}
}
