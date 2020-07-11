package aabhasSpringDemo;

public class BaseballCoach implements Coach {
	
	
		private FortuneService fortuneservice;
		
		//define a constructor for dependency injection
		private BaseballCoach(FortuneService thefortuneservice) {
			fortuneservice=thefortuneservice;
		}
		
		@Override
		public String getDailyWorkout() {
			return "Spend 30 mins exercisiong";
		}

		@Override
		public String getDailyFortune() {
			// 
			return fortuneservice.getFortune();
		}
}
