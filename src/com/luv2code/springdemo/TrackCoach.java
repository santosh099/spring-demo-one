package com.luv2code.springdemo;

public class TrackCoach implements Coach
{
	private FortuneService fortuneService;
	
	public TrackCoach()
	{
	    	
	}
	
	public TrackCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() 
	{
		return "run a hard 5k";
	}

	@Override
	public String getDailyFortune() 
	{
		return "Just do it: " + fortuneService.getDailyFortune();
	}
    
	// add a init method
	
	public void doMyStartupStuff()
	{
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	// add a destroy method
	
	public void doMyCleanupStuffYoYo()
	{
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
	}
}
