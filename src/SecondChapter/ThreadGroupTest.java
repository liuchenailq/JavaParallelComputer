package SecondChapter;
/**
 * �����߳����ڵ��߳���
 * 
 * @author liuchen
 *
 */

public class ThreadGroupTest {
	public static void main(String[] args) {
		//main�̴߳�����t1�̣߳�����main�߳���t1�̵߳ĸ��߳�
		//ûָ��������߳��飬������̺߳����ĸ��߳�ͬ��
		Thread t1 = new Thread("t1");
		ThreadGroup mainThreadGroup = Thread.currentThread().getThreadGroup();
		System.out.println("main�߳����ڵ��߳���: "+ mainThreadGroup.getName());
		System.out.println("t1�߳����ڵ��߳���: " +t1.getThreadGroup().getName());
	}

}
