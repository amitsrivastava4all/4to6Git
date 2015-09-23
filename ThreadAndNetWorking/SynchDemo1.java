class A
{
	static void disp(){
		for(int i = 1; i<=5 ; i++){
			System.out.println("Thread "+Thread.currentThread().getName()+" Value "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	void print(){
		for(int i = 1; i<=5 ; i++){
			System.out.println("Thread "+Thread.currentThread().getName()+" Value "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Job5 implements Runnable
{
	
	
	
	A obj = new A();
	@Override
	public  void run(){
		System.out.println("This Line1  Not Synch"+Thread.currentThread().getName());
		System.out.println("This Line2  Not Synch"+Thread.currentThread().getName());
		System.out.println("This Line3  Not Synch"+Thread.currentThread().getName());
		synchronized (this) {
			for(int i = 1; i<=5 ; i++){
				System.out.println("Thread "+Thread.currentThread().getName()+" Value "+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		synchronized (obj) {
			obj.print();
		}
		
		synchronized (A.class) {
			A.disp();
		}
		}
}
public class SynchDemo1 {

	public static void main(String[] args) throws InterruptedException {
		Job5 job = new Job5();
		Thread worker1 = new Thread(job,"ram");
		//Job5 job2 = new Job5();
		Thread worker2 = new Thread(job,"shyam");
		//Job5 job3 = new Job5();
		Thread worker3 = new Thread(job,"sohan");
		worker1.start();
		worker2.start();
		worker3.start();
		/*worker1.start();
		worker1.join();
		worker2.start();
		worker2.join();
		worker3.start();*/
		
		
		
		

	}

}
