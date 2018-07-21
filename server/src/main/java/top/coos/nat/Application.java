package top.coos.nat;

public class Application {

	static NatServer server;

	public static void main(String[] args) {

		ApplicationInitialize.initialize(Application.class);
		try {
			server = new NatServer(1111);
			server.start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
