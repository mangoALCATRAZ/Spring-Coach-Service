package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

    //define a private filed for the dependency
    private FortuneService fortuneService;

    //define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }



    @Override
    public String getDailyWorkout() {
        
        return "This is your baseball workout!";

    }

    @Override
    public String getDailyFortune() {

        //use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}
