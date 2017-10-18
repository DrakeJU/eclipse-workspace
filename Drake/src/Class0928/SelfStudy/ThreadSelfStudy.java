package Class0928.SelfStudy;

 class threadsample extends Thread{
	
	private String name;
	
	public threadsample(String nm) {
		this.name = nm;
	}
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(name+"가 작동하고 있습니다.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadSelfStudy{
	public static void main(String[] args) {

		threadsample car1 = new threadsample("1호차");
		threadsample car2 = new threadsample("2호차");
		car1.start();
		car2.start();
		
		for(int i = 0; i<10;i++) {
			System.out.println("main() 메소드 실행중입니다.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}


}