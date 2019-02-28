package FirstChapter;

import java.util.concurrent.TimeUnit;

/**
 * 线程的第一次尝试
 * 利用线程实现看书和听音乐同时进行
 * 
 * @author liuchen
 *
 */
public class FirstTry {
	
	public static void enjoyMusic() {
		while(true) {
			System.out.println("I am listening music");	
			//让当前线程休眠1秒
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void readBook() {
		while(true) {
			System.out.println("I am reading book");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		//线程一定要在readBook()前启动，不然线程不会启动，因为readBook()
		//不会退出
		new Thread() {
			public void run() {
				enjoyMusic();
			}
		}.start();
		
		readBook();
	}

}
