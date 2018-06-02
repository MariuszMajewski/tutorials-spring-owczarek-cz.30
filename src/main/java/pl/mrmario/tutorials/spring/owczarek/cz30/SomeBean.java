package pl.mrmario.tutorials.spring.owczarek.cz30;

import java.util.logging.Logger;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//	Wersja nie zalecana do stosowania
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

}
