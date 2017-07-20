package demo.thread;

public class ThreadMain {
	private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>(){
		@Override
		public Integer initialValue() {
			return 0;
		}
	};
	
	public ThreadLocal<Integer> getThreadLocal() {
		return seqNum;
	}
	
	public int getNextNum() {
		seqNum.set(seqNum.get() + 1);
		return seqNum.get();
		
	}
}
