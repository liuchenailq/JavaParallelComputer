package FirstChapter;

import java.util.concurrent.TimeUnit;

/**
 * �̲߳�����������
 * �߳��ڽ����������ں�Ҳ�����ٴ�����
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
		//�̶߳��������java.lang.IllegalThreadStateException
		//�߳�ֻ�ܴ�NEW״̬����
//		thread.start();
//		thread.start();
		
		//�߳̽����������ں�Ҳ�����ٴ�����
		thread.start();
		
		//��ǰ���ߣ�ȷ��thread���㹻ʱ�����е���������
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		thread.start();
	}

}
