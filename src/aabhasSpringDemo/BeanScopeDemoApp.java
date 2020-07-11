package aabhasSpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
	
		
		//load configuration file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope_applicationContext.xml");		
		
		//retrieve beans
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
	}

}
