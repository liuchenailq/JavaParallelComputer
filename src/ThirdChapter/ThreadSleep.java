package ThirdChapter;
/**
 * sleep()����ֻ��ʹ��ǰ�߳����ߣ������ڼ��̲߳����ͷ���
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
