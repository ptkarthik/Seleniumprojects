package Log4JConcepts;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class propertyconfiguratorExample {
	static Logger log=Logger.getLogger(propertyconfiguratorExample.class);
	public static void main(String args[])
	{
		PropertyConfigurator.configure("propertyfileconfigurator.properties");
		log.debug("this is a debug method");
		log.info("info");
		log.warn("warn");
		log.error("error");
		log.fatal("fartal");
	}
}