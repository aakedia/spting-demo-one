package aabhasSpringDemo;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins running";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	//add an init method
	public void MyStartupStuff() {
		System.out.println("Start");
	}
	
	//add a destroy method
	public void MyCleanupStuff() {
		System.out.println("Clean");
	}	
}
