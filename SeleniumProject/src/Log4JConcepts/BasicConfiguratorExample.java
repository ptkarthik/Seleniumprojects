package Log4JConcepts;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfiguratorExample {

	
	static Logger log=Logger.getLogger(BasicConfiguratorExample.class);
	
	
	public static void main(String args[])
	{
		BasicConfigurator.configure();
		log.debug("this is a debug method");
		log.info("info");
		log.warn("warn");
		log.error("error");
		log.fatal("fartal");
	}
	
}