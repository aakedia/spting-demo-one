package aabhasSpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
	
		
		//load configuration file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle_applicationContext.xml");		
		
		//retrieve beans
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
	}

}
