package ThreadMethod;

class Medical extends Thread {
	public void run() {
		try {
			System.out.println("Medical Starts");
			Thread.sleep(3000);
			System.out.println("Medical Completed");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class TestDriver extends Thread {
	public void run() {
		try {
			System.out.println("TestDrive Start");
			Thread.sleep(5000);
			System.out.println("TestDrive Completed");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class OfficerSign extends Thread {
	public void run() {
		try {
			System.out.println("Officer takes the file");
			Thread.sleep(3000);
			System.out.println("Officer works Completed");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class LicenceDemo {

	public static void main(String[] args) throws InterruptedException {
		Medical m = new Medical();
		m.start();

		m.join();

		TestDriver d = new TestDriver();
		d.start();

		d.join();

		OfficerSign o = new OfficerSign();
		o.start();
	}

}
