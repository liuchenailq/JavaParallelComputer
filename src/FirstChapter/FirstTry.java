package FirstChapter;

import java.util.concurrent.TimeUnit;

/**
 * �̵߳ĵ�һ�γ���
 * �����߳�ʵ�ֿ����������ͬʱ����
 * 
 * @author liuchen
 *
 */
public class FirstTry {
	
	public static void enjoyMusic() {
		while(true) {
			System.out.println("I am listening music");	
			//�õ�ǰ�߳�����1��
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
		//�߳�һ��Ҫ��readBook()ǰ��������Ȼ�̲߳�����������ΪreadBook()
		//�����˳�
		new Thread() {
			public void run() {
				enjoyMusic();
			}
		}.start();
		
		readBook();
	}

}
