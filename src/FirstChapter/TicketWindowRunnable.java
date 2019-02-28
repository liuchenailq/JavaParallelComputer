package FirstChapter;
/**
 * �����̰߳�ȫ����
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
		//����߳�ִ��һ������
		TicketWindowRunnable task = new TicketWindowRunnable();
		new Thread(task, "1��").start();
		new Thread(task, "2��").start();
		new Thread(task, "3��").start();
		new Thread(task, "4��").start();
	}

}
