package SecondChapter;
/**
 * 测试线程所在的线程组
 * 
 * @author liuchen
 *
 */

public class ThreadGroupTest {
	public static void main(String[] args) {
		//main线程创造了t1线程，所以main线程是t1线程的父线程
		//没指定具体的线程组，则这个线程和它的父线程同组
		Thread t1 = new Thread("t1");
		ThreadGroup mainThreadGroup = Thread.currentThread().getThreadGroup();
		System.out.println("main线程所在的线程组: "+ mainThreadGroup.getName());
		System.out.println("t1线程所在的线程组: " +t1.getThreadGroup().getName());
	}

}
