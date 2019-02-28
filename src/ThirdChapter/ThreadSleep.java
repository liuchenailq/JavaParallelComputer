package ThirdChapter;
/**
 * sleep()方法只会使当前线程休眠，休眠期间线程不会释放锁
 * @author liucheng
 *
 */

public class ThreadSleep {
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				long startTime = System.currentTimeMillis();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				long endTime = System.currentTimeMillis();
				System.out.println(String.format("%d ms", endTime - startTime));
			}
		}.start();
		
		long startTime = System.currentTimeMillis();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println(String.format("main %d ms", endTime - startTime));
		
		
	}

}
