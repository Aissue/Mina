package minaDemo;

public class MinaTest {
	public static MinaServer minaServer;
	public static MinaClient minaClient;

	public static void main(String[] args) {
		minaServer=new MinaServer(8899);
//		minaClient=new MinaClient("127.0.0.1",8899);
		

	}

}
