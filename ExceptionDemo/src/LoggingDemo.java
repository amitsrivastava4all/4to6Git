import org.apache.log4j.Logger;


public class LoggingDemo {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(LoggingDemo.class);
		logger.debug("Main Code Starts ");
		// Some Logic Going On
		try{
		int e = 109/0;
		logger.debug("Main Code Ends");
		}
		catch(ArithmeticException e){
			logger.error("Exception in Main "+e);
		}
	}

}
