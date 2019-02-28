package FirstChapter;

import java.util.concurrent.TimeUnit;

/**
 * 线程不允许多次启动
 * 线程在结束生命周期后也不能再次启动
 * 
 * @author liuchen
 *
 */

public class ThreadStartTimes {
	

	public static void main(String[] args) {
		Thread thread = new Thread() {
			public void run() {
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		//线程多次启动报java.lang.IllegalThreadStateException
		//线程只能从NEW状态启动
//		thread.start();
//		thread.start();
		
		//线程结束生命周期后也不能再次启动
		thread.start();
		
		//当前休眠，确保thread有足够时间运行到结束生命
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		thread.start();
	}

}
