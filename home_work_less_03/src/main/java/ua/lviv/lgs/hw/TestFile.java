package ua.lviv.lgs.hw;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class TestFile {

	private static Logger LOG = Logger.getLogger(TestFile.class);

	public static void main(String[] args) {

		DOMConfigurator.configure("loggerConfig.xml");
		LOG.debug("DEBUG logger messege");
		LOG.info("iNFO logger messege");
		LOG.warn("WARN logger messege");
		LOG.error("ERROR logger messege");
	}
}
