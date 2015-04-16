package hello;

public class ConsoleHelloService implements HelloService {

	@Override
	public void sayHello() {
		System.out.println("Hello from Console");
	}
}