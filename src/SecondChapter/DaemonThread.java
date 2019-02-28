package SecondChapter;
/**
 * ��JVM�����е��̶߳�Ϊ�ػ��߳�ʱ��JVMֹͣ����
 * main�߳�Ҳ��һ���������߳�
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
		thread.setDaemon(true); //���ø��߳�Ϊ�ػ��߳�
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("main�߳̽����������ڣ�");
	}
}
