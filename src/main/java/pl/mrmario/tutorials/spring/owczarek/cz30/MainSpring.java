package pl.mrmario.tutorials.spring.owczarek.cz30;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


/**
 * @author Artur Owczarek
 * 	MrMario108
 */
public class MainSpring {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		context.registerShutdownHook();
		context.getBean("someBean");
		context.close();
	}
}