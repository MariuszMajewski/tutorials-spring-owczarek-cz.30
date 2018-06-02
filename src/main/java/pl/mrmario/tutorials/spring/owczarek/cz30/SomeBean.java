package pl.mrmario.tutorials.spring.owczarek.cz30;

import java.util.logging.Logger;

public class SomeBean {
	private Logger logger = Logger.getLogger(SomeBean.class.getName());

	public void myInitMethod() {
		logger.info("initMethod");
	}
	
	public void myDestroyMethod() {
		logger.info("destroyMethod");
	}
}
