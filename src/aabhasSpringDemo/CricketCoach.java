package aabhasSpringDemo;

public class CricketCoach implements Coach {

	
	private FortuneService fortuneservice;
	private String emailaddress;
	private String team;
	
	public CricketCoach() {
		
	}
	
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	//Setter
	public void setFortuneservice(FortuneService fortuneservice) {
		this.fortuneservice = fortuneservice;
	}
	
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice Bowling";
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyFortune() {
		return fortuneservice.getFortune();
	}

	public void MyStartupStuff() {
		System.out.println("Start");
	}
	
	//add a destroy method
	public void MyCleanupStuff() {
		System.out.println("Clean");
	}
}

