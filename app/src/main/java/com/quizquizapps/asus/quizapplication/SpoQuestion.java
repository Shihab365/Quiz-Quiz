package com.quizquizapps.asus.quizapplication;

public class SpoQuestion {

    private String PQuestion[]={
            "Which of the following term is not associated with Football?",
            "Of which country is bull-fighting the national games?",
            "Which The following terms used in Cricket?",
            "The term \" Butterfly Stroke\" is reffered to in which sports?",
            "What is the maximum permitted length of cricket bat?"
    };

    private String PChoices[][]={
            {"Penalty Kick","Free Kick","Penalty Stoke","Offside"},
            {"Spain","Portugal","Hungary","Poland"},
            {"Centre forward","Goal","Corner","LBW"},
            {"Tennis","Volleyall","Wrestling","Swimming"},
            {"32\"","34\"","36\"","38\""},
    };

    private String PCorrectAns[]={"Penalty Stoke","Spain","LBW","Swimming","38\""};

    public String getQuestion(int a){
        String question=PQuestion[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0=PChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1=PChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a){
        String choice2=PChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a){
        String choice3=PChoices[a][3];
        return choice3;
    }

    public String getCorrectAns(int a){
        String answer=PCorrectAns[a];
        return answer;
    }
}
