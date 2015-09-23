class Job1 implements Runnable
{
	long i = 1;
	public synchronized void run(){
		//while(true){
		for(int i = 1 ; i<=100000 ; i++){
			System.out.println("I is "+i+" "+Thread.currentThread().getName());
			i++;
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class ThreadDemo2 {

	public static void main(String[] args) throws InterruptedException {
		Job1 firstJob = new Job1();
		Thread worker1 = new Thread(firstJob,"ram");
		
		
		Thread worker2 = new Thread(firstJob,"shyam");
		worker1.setPriority(Thread.MAX_PRIORITY);
		worker2.setPriority(Thread.MIN_PRIORITY);
		
		worker1.start();
		//worker1.join();
		worker2.start();

	}

}
