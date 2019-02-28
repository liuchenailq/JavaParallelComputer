package FirstChapter;
/**
 * 多线程模拟银行柜台服务
 *一个线程代表一个柜台
 *存在线程安全问题
 *
 * @author liuchen
 *
 */

public class TicketWindow extends Thread{
	private final String name;
	
	//使用static修饰 保证所有对象共享变量
	private static int max = 50;
	private static int index = 1;
	
	public TicketWindow(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		while(index <= max) {
			System.out.println(name + ": " + index++);
		}
	}
	
	public static void main(String[] args) {
		new TicketWindow("1号机").start();
		new TicketWindow("2号机").start();
		new TicketWindow("3号机").start();
		new TicketWindow("4号机").start();
	}
}
