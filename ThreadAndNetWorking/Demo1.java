import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// 1. extend Thread class
// 2. implement Runnable Interface
class Job implements Runnable
{
	private String readFileName;
	private String writeFileName;
	Job(String readFileName,String writeFileName){
		this.readFileName= readFileName;
		this.writeFileName = writeFileName;
	}
	// Now Job is Running
	@Override
	public void run(){
		System.out.println("Thread Start "+Thread.currentThread());
		System.out.println("Thread Start "+Thread.currentThread().isAlive());
		try {
			FileInputStream fi = new FileInputStream(this.readFileName);
			FileOutputStream fo = new FileOutputStream(this.writeFileName);
			int singleByte = fi.read();
			while(singleByte!=-1){
				fo.write(singleByte);
				singleByte = fi.read();
			}
			fi.close();
			fo.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*for(int i = 1; i<=5 ; i++){
			System.out.println("I is "+i+" Thread Name "+Thread.currentThread().getName());
		}*/
		System.out.println("Thread Ends "+Thread.currentThread());
	}
}
public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		Job job = new Job("D:\\4to6batch\\ThreadFiles\\test.txt","D:\\4to6batch\\ThreadFiles\\testWrite.txt");  // Create Object of the Job
		// Create Worker and Assign the Job to the Worker
		Thread worker1 = new Thread(job,"Worker1");
		
		Job job2 = new Job("D:\\4to6batch\\ThreadFiles\\test2.txt","D:\\4to6batch\\ThreadFiles\\testWrite2.txt");
		Thread worker2 = new Thread(job2,"Worker2");
		
		worker1.start();
		worker1.join();
		worker2.start();
		

	}

}
