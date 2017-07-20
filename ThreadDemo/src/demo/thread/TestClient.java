package demo.thread;

public class TestClient extends Thread {
	private ThreadMain sn;
	
	public TestClient(ThreadMain sn) {
		this.sn = sn;
	}
	
	public TestClient() {
		
	}
	
	@Override
	public void run () {
		
		while (true) {
//			try {
		
	//		for ( int i = 0; i < 3; i++ ) {
				System.out.println("thread[" + Thread.currentThread().getName() + "] --> sn[" + sn.getNextNum() + "]");
	//		}
			
	//		sn.getThreadLocal().remove();
				
				throw new RuntimeException();
//			} catch (Exception e) {
////				e.printStackTrace();
//			}
		}
	}
}
