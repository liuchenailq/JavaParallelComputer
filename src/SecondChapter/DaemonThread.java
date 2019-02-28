package SecondChapter;
/**
 * 当JVM中运行的线程都为守护线程时，JVM停止运行
 * main线程也是一个正常的线程
 * 
 * @author liuchen
 *
 */

public class DaemonThread {
	public static void main(String[] args) {
		Thread thread = new Thread() {
			public void run() {
				while(true) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		thread.setDaemon(true); //设置该线程为守护线程
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("main线程结束生命周期！");
	}
}
