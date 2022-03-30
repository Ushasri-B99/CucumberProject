package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	static Logger logger = LogManager.getLogger();
	public static void main(String[] args) {
		logger.info("info Msg");
		logger.error("Erro Msg");
		logger.warn("warn Msg");
		logger.fatal("fatal Msg");
	}
}