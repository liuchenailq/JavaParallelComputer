package ThirdChapter;
/**
 * 线程优先级
 * 优先级不一定靠谱，高优先级的线程不一定总是等到更多的执行机会
 * 不要将业务优先级绑定在线程优先级上
 * 线程默认的优先级为5
 * @author liucheng
 *
 */

public class ThreadPriority {
	public static void main(String[] args) {
		System.out.println("main线程优先级：" + Thread.currentThread().getPriority());
	}

}
