package example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingLambda {

	private static Logger LOG = LoggerFactory.getLogger(LoggingLambda.class);
	
	public void handleRequest(String input) {
		 LOG.info("Hello log, {}",input);
	}

}
