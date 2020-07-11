package aabhasSpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		// Load configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Get Beans
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//Call Methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getEmailaddress());
		System.out.println(theCoach.getTeam());
		
		//Close Context
		context.close();
	}

}
