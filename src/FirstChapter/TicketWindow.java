package FirstChapter;
/**
 * ���߳�ģ�����й�̨����
 *һ���̴߳���һ����̨
 *�����̰߳�ȫ����
 *
 * @author liuchen
 *
 */

public class TicketWindow extends Thread{
	private final String name;
	
	//ʹ��static���� ��֤���ж��������
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
		new TicketWindow("1�Ż�").start();
		new TicketWindow("2�Ż�").start();
		new TicketWindow("3�Ż�").start();
		new TicketWindow("4�Ż�").start();
	}
}
