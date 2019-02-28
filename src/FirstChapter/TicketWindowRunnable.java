package FirstChapter;
/**
 * 存在线程安全问题
 * @author liuchen
 *
 */

public class TicketWindowRunnable implements Runnable{
	private int index = 1;
	private final static int max = 50;

	@Override
	public void run() {
		while(index <= max) {
			System.out.println(Thread.currentThread().getName() +": " + index++);
		}
	}
	
	public static void main(String[] args) {
		//多个线程执行一个任务
		TicketWindowRunnable task = new TicketWindowRunnable();
		new Thread(task, "1号").start();
		new Thread(task, "2号").start();
		new Thread(task, "3号").start();
		new Thread(task, "4号").start();
	}

}
