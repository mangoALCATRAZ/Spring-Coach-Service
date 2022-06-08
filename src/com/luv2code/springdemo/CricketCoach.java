package com.luv2code.springdemo;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;


    // add new fields for emailAddress and team
    private String emailAddress;
    private String team;





    //noarg constructor
    public CricketCoach(){
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    //setter methods

    public void setEmailAddress(String emailAddress){
        System.out.println("CricketCoach: inside setter methode :C - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter methode :C???? - setTeam");
        this.team = team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }




    //getters

    public String getTeam() {
        return team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String getDailyWorkout() {
        return "go bowling, you slut";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
