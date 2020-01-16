package FrameworkUtils;
public class FrameworkUtils {
	public class SyncUtil {
		public void wait(int sec) {
			try {
				Thread.sleep(sec * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
