package demo.thread;

public class MainClass {

	public static void main(String[] args) {
		ThreadMain sn = new ThreadMain();
		
		TestClient t1 = new TestClient(sn);
		TestClient t2 = new TestClient(sn);
		TestClient t3 = new TestClient(sn);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
	
}
