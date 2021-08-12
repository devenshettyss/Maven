package app1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingDemo {
	private static Logger logger = LogManager.getLogger(LoggingDemo.class);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.fatal("fatal message");
		logger.error("error message");
		logger.warn("warning message");
		logger.info("info message");
		logger.debug("this is a debug message");
		logger.trace("trace");
		
		
	}

}
