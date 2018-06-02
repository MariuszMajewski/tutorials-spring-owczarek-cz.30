package pl.mrmario.tutorials.spring.owczarek.cz30;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SomeBean implements InitializingBean,DisposableBean {
	private Logger logger = Logger.getLogger(SomeBean.class.getName());
	@Override
	public void destroy() throws Exception {
		logger.info("destroy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		logger.info("afterPropertiesSet");
		
	}
	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
	}
	
	@PreDestroy
	public void PreDestroy() {
		logger.info("PreDestroy");
	}
}
